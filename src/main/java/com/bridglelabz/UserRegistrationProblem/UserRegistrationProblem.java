package com.bridglelabz.UserRegistrationProblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProblem {

	public static void main(String[] args) {
		String regex = "^[A-Z][a-zA-Z]{2,}$";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First Name : ");
		String data = sc.nextLine();
		System.out.println("Enter The Last Name : ");
		String lastName = sc.nextLine();

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(data);
		Matcher matcher = pattern.matcher(lastName);
		boolean result = matcher.matches();

		if (result) {
			System.out.println("Valid first name");
			System.out.println("Valid first name and last name");
		} else {
			System.out.println("Pattern not matched");
		}

	}

}


	
