package com.bridglelabz.UserRegistrationProblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProblem {

	public static void main(String[] args) {
		
		private String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		private Pattern pattern = Pattern.compile(regex);
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

		public void validateFirstName(String firstName) throws InvalidFirstNameException {
			if (firstName.isEmpty()) {
				throw new InvalidFirstNameException("Invalid first name");
			}
		}
			String firstName = getUserInput(scanner, "Enter first name: ", s -> s.matches("[A-Za-z]+"),
					"Invalid first name!");

		public void validateLastName(String lastName) throws InvalidLastNameException {
			if (lastName.isEmpty()) {
				throw new InvalidLastNameException("Invalid last name");
			}
		}
			String lastName = getUserInput(scanner, "Enter last name: ", s -> s.matches("[A-Za-z]+"), "Invalid last name!");

		public void validateEmail(String email) throws InvalidEmailException {
			Matcher matcher = pattern.matcher(email);
			if (!matcher.matches()) {
				throw new InvalidEmailException("Invalid email");
			}
		}
			String email = getUserInput(scanner, "Enter email: ",
					s -> s.matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}"), "Invalid email!");

		public void validateMobile(String mobile) throws InvalidMobileException {
			if (mobile.length() != 10) {
				throw new InvalidMobileException("Invalid mobile");
			}
		}
			String mobile = getUserInput(scanner, "Enter mobile number: ", s -> s.matches("\\d{10}"),
					"Invalid mobile number!");

		public void validatePassword(String password) throws InvalidPasswordException {
			if (password.length() < 8) {
				throw new InvalidPasswordException("Invalid password");
			}
		}
	}
			String password = getUserInput(scanner, "Enter password: ",
					s -> s.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}$"), "Invalid password!");

	class InvalidFirstNameException extends Exception {
		public InvalidFirstNameException(String message) {
			super(message);
			System.out.println("First name: " + firstName);
			System.out.println("Last name: " + lastName);
			System.out.println("Email: " + email);
			System.out.println("Mobile number: " + mobile);
			System.out.println("Password: " + password);
		}
	}

	class InvalidLastNameException extends Exception {
		public InvalidLastNameException(String message) {
			super(message);
		private static String getUserInput(Scanner scanner, String prompt, Predicate<String> validator, String errorMsg) {
			String input;
			boolean valid;
			do {
				System.out.print(prompt);
				input = scanner.nextLine();
				valid = validator.test(input);
				if (!valid) {
					System.out.println(errorMsg);
				}
			} while (!valid);
			return input;
		}
	}

	class InvalidEmailException extends Exception {
		public InvalidEmailException(String message) {
			super(message);
		}
	}

	class InvalidMobileException extends Exception {
		public InvalidMobileException(String message) {
			super(message);
		}
	}

	class InvalidPasswordException extends Exception {
		public InvalidPasswordException(String message) {
			super(message);
		}
	}
	   