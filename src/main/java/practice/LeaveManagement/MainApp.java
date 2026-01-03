package practice.LeaveManagement;

import java.util.*;

public class MainApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LeaveService leaveService = new LeaveService();

		System.out.println("--- Leave Management System ---");
		System.out.print("Enter your Employee ID: ");
		int empId = sc.nextInt();
		sc.nextLine();

		Employee emp = leaveService.findEmployeeById(empId);

		if (emp == null) {
			System.out.println("Employee not found. Access Denied.");
			sc.close();
			return;
		}

		System.out.println("\nWelcome, " + emp.getName() + "!");

		OTPSystem otpSystem = new OTPSystem();
		otpSystem.generateOTP();

		int attempts = 1;
		boolean verified = false;

		while (attempts > 0 && !verified) {
			System.out.print("Enter OTP: ");
			String enteredOTP = sc.nextLine();
			if (otpSystem.verifyOTP(enteredOTP)) {
				verified = true;
				break;
			} else {
				attempts--;
				if (attempts > 0)
					System.out.println("Attempts left: " + attempts);
				else
					System.out.println("Try again later.");
			}
		}

		if (verified) {
			leaveService.showMenu(emp, sc);
		}

		sc.close();
	}
}