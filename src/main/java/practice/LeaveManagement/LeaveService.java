package practice.LeaveManagement;

import java.util.*;

public class LeaveService {
	private Map<Integer, Employee> employees = new HashMap<>();

	public LeaveService() {
		employees.put(101, new Employee(101, "Alice", 12));
		employees.put(102, new Employee(102, "Bob", 8));
		employees.put(103, new Employee(103, "Charlie", 5));
	}

	public Employee findEmployeeById(int empId) {
		return employees.get(empId);
	}

	public void showMenu(Employee emp, Scanner sc) {
		int choice;
		do {
			System.out.println("\n--- Leave Management Menu ---");
			System.out.println("1. Apply for Leave");
			System.out.println("2. View Leave Balance");
			System.out.println("3. Logout");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter number of leave days: ");
				int days = sc.nextInt();
				emp.applyLeave(days);
				break;

			case 2:
				System.out.println("\nEmployee: " + emp.getName());
				System.out.println("Available Leave Balance: " + emp.getLeaveBalance() + " days");
				break;

			case 3:
				System.out.println("\nLogging out... Goodbye " + emp.getName() + "!");
				break;

			default:
				System.out.println("Invalid choice. Please enter 1–3.");
			}
		} while (choice != 3);
	}
}