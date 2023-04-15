package com.bridglelabz.UserRegistrationProblem;

public class UserRegistrationProblemTest {

	private String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
	private Pattern pattern = Pattern.compile(regex);

	@Test
	public void testValidFirstName() {
		String firstName = "Altaf";
		try {
			validateFirstName(firstName);
		} catch (InvalidFirstNameException e) {
			Assert.assertEquals("Valid first name should not throw exception", e.getMessage());
		}
	}

	@Test
	public void testInvalidFirstName() {
		String firstName = "";
		try {
			validateFirstName(firstName);
		} catch (InvalidFirstNameException e) {
			Assert.assertEquals("Invalid first name should throw exception", "Invalid first name", e.getMessage());
		}
	}

	@Test
	public void testValidLastName() {
		String lastName = "Khan";
		try {
			validateLastName(lastName);
		} catch (InvalidLastNameException e) {
			Assert.assertEquals("Valid last name should not throw exception", e.getMessage());
		}
	}

	@Test
	public void testInvalidLastName() {
		String lastName = "";
		try {
			validateLastName(lastName);
		} catch (InvalidLastNameException e) {
			Assert.assertEquals("Invalid last name should throw exception", "Invalid last name", e.getMessage());
		}
	}

	@Test
	public void testValidEmail() {
		String email = "altaf.khan@yahoo.com";
		try {
			validateEmail(email);
		} catch (InvalidEmailException e) {
			Assert.assertEquals("Valid email should not throw exception", e.getMessage());
		}
	}

	@Test
	public void testInvalidEmail() {
		String email = "altaf@. com.my";
		try {
			validateEmail(email);
		} catch (InvalidEmailException e) {
			Assert.assertEquals("Invalid email should throw exception", "Invalid email", e.getMessage());
		}
	}

	@Test
	public void testValidMobile() {
		String mobile = "1234567890";
		try {
			validateMobile(mobile);
		} catch (InvalidMobileException e) {
			Assert.assertEquals("Valid mobile should not throw exception", e.getMessage());
		}
	}

	@Test
	public void testInvalidMobile() {
		String mobile = "123";
		try {
			validateMobile(mobile);
		} catch (InvalidMobileException e) {
			Assert.assertEquals("Invalid mobile should throw exception", "Invalid mobile", e.getMessage());
		}
	}

	@Test
	public void testValidPassword() {
		String password = "Altaf1234";
		try {
			validatePassword(password);
		} catch (InvalidPasswordException e) {
			Assert.assertEquals("Valid password should not throw exception", e.getMessage());
		}
	}

	@Test
	public void testInvalidPassword() {
		String password = "abcd";
		try {
			validatePassword(password);
		} catch (InvalidPasswordException e) {
			Assert.assertEquals("Invalid password should throw exception", "Invalid password", e.getMessage());
		}
	}

	private void validateFirstName(String firstName) throws InvalidFirstNameException {
		if (firstName.isEmpty()) {
			throw new InvalidFirstNameException("Invalid first name");
		}
	}

	private void validateLastName(String lastName) throws InvalidLastNameException {
		if (lastName.isEmpty()) {
			throw new InvalidLastNameException("Invalid last name");
		}
	}

	private void validateEmail(String email) throws InvalidEmailException {
		Matcher matcher = pattern.matcher(email);
		if (!matcher.matches()) {
			throw new InvalidEmailException("Invalid email");
		}
	}

	private void validateMobile(String mobile) throws InvalidMobileException {
		if (mobile.length() != 10) {
			throw new InvalidMobileException("Invalid mobile");
		}
	}

	private void validatePassword(String password) throws InvalidPasswordException {
		if (password.length() < 8) {
			throw new InvalidPasswordException("Invalid password");
		}
	}

}
}
