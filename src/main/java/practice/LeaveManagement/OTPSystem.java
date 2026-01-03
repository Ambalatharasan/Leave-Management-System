package practice.LeaveManagement;

import java.util.Random;

public class OTPSystem {
	private String generatedOTP;
	private long otpGeneratedTime;

	public void generateOTP() {
		Random random = new Random();
		int otp = 100000 + random.nextInt(900000);
		generatedOTP = String.valueOf(otp);
		otpGeneratedTime = System.currentTimeMillis();
		System.out.println("\nYour OTP is: " + generatedOTP + " (Valid for 1 minute)");
	}

	public boolean verifyOTP(String enteredOTP) {
		long currentTime = System.currentTimeMillis();
		if (currentTime - otpGeneratedTime > 60000) { // 1 minute validity
			System.out.println("OTP expired! Please request a new one.");
			return false;
		}

		if (enteredOTP.equals(generatedOTP)) {
			System.out.println("OTP Verified Successfully!");
			return true;
		} else {
			System.out.println("Invalid OTP. Please try again.");
			return false;
		}
	}
}