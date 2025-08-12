import java.util.*;

class Employee {
    private int empId;
    private String name;
    private int leaveBalance;

    public Employee(int empId, String name, int leaveBalance) {
        this.empId = empId;
        this.name = name;
        this.leaveBalance = leaveBalance;
    }

    public String getName() {
        return name;
    }

    public int getLeaveBalance() {
        return leaveBalance;
    }

    public void applyLeave(int days) {
        System.out.println("\nEmployee: " + name + " | Requested Leave: " + days + " days");

        if (days <= 0) {
            System.out.println("Invalid leave request.");
            return;
        }

        if (days <= leaveBalance) {
            leaveBalance -= days;
            System.out.println("Leave Approved.");
            System.out.println("Remaining Leave Balance: " + leaveBalance + " days");
        } else {
            System.out.println("Leave Rejected - Insufficient leave balance.");
            System.out.println("Available Leave Balance: " + leaveBalance + " days");
        }
    }
}

public class LeaveManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer, Employee> employees = new HashMap<>();
        employees.put(101, new Employee(101, "Alice", 12));
        employees.put(102, new Employee(102, "Bob", 8));
        employees.put(103, new Employee(103, "Charlie", 5));

        while (true) {
            System.out.println("\n--- Leave Management System ---");
            System.out.print("Enter Employee ID : ");
            int empId = sc.nextInt();

            if (employees.containsKey(empId)) {
                Employee emp = employees.get(empId);
                System.out.print("Enter number of leave days for " + emp.getName() + ": ");
                int days = sc.nextInt();
                emp.applyLeave(days);
                break;
            } else {
                System.out.println("Employee not found.");
            }
        }
        sc.close();
    }
}