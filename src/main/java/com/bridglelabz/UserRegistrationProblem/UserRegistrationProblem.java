package com.bridglelabz.UserRegistrationProblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProblem {

	public static void main(String[] args) {
		 regex = "^[1-9][0-9]\\s[1-9][0-9]{9}";
			String regex = "^.{8,}$";

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Mobile Number: ");
			String mobileNO = sc.nextLine();
			System.out.println("Enter A Password: ");
			String password = sc.nextLine();

			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(mobileNO);
			Matcher matcher = pattern.matcher(password);
			boolean result = matcher.matches();

			if (result) {
				System.out.println("Valid Mobile Number");
				System.out.println("You have entered a Valid Password");
			} else {
				System.out.println("Invalid Mobile Number");
				System.out.println("Invalid Password");
			}

		}
	}
	}