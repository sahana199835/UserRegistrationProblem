package com.bridglelabz.UserRegistrationProblem;

public class UserRegistrationProblemTest {

	public boolean isValidFirstName(String firstName) {
		// code to validate first name
		return true;	}

	@Test
	public void testValidFirstName() {
		UserRegistrationTest userRegistrationTest = new UserRegistrationTest();
		boolean result = userRegistrationTest.isValidFirstName("altaf");
		Assert.assertEquals(true, result);
	}

	public boolean isValidLastName(String lastName) {
		// code to validate last name
		return true;
	}

	@Test
	public void testValidLastName() {
		UserRegistrationTest userRegistrationProblemTest = new UserRegistrationTest();
		boolean result = userRegistrationProblemTest.isValidLastName("khan");
		Assert.assertEquals(true, result);
	}

	public boolean isValidEmail(String email) {
		// code to validate email
		return true;
	}

	@Test
	public void testValidEmail() {
		UserRegistrationTest userRegistrationTest = new UserRegistrationTest();
		boolean result = userRegistrationTest.isValidEmail("abc123rT");
		Assert.assertEquals(true, result);
	}
	public boolean isValidMobileNo(String mobileno) {
		// code to validate MobileNo
		return true;
	}

	@Test
	public void testValidMobileno() {
		UserRegistrationTest userRegistrationTest = new UserRegistrationTest();
		boolean result = userRegistrationTest.isValidMobileNo("91 9855217816");
		Assert.assertEquals(true, result);
	}
	public boolean isValidPassword(String password) {
		// code to validate password
		return true;
	}

	@Test
	public void testValidPassword() {
		UserRegistrationTest userRegistrationTest = new UserRegistrationTest();
		boolean result = userRegistrationTest.isValidPassword("khan9090");
		Assert.assertEquals(true, result);
   }
	}



