package practice.LeaveManagement;

public class Employee {
	private int empId;
	private String name;
	private int leaveBalance;

	public Employee(int empId, String name, int leaveBalance) {
		this.empId = empId;
		this.name = name;
		this.leaveBalance = leaveBalance;
	}

	public int getEmpId() {
		return empId;
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
			System.out.println("Invalid leave request. Enter a valid number of days.");
			return;
		}

		if (days <= leaveBalance) {
			leaveBalance -= days;
			System.out.println("Leave Approved!");
			System.out.println("Remaining Leave Balance: " + leaveBalance + " days");
		} else {
			System.out.println("Leave Rejected - Insufficient balance.");
			System.out.println("Available Leave Balance: " + leaveBalance + " days");
		}
	}
}
