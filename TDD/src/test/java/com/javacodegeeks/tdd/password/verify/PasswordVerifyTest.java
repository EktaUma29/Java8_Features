package com.javacodegeeks.tdd.password.verify;

import org.junit.Assert;
import org.junit.Test;

public class PasswordVerifyTest {

	PasswordVerify passwordVerify = new PasswordVerify();

	Boolean passwordExpected;
	Boolean passwordActual;

	@Test
	public void passwordShouldBeLargerThanEightCharacters() {
		passwordExpected = true;
		passwordActual = passwordVerify.checkPassword("ab7Ani");
		Assert.assertEquals(passwordExpected, passwordActual);
	}

	@Test
	public void passwordShouldNull() {
		passwordExpected = false;
		passwordActual = passwordVerify.checkPassword(null);
		Assert.assertEquals(passwordExpected, passwordActual);
	}
	@Test
	public void passwordShouldNotBeNull() {
		passwordExpected = true;
		passwordActual = passwordVerify.checkPassword("ab7aiAyrt");
		Assert.assertEquals(passwordExpected, passwordActual);
	}

	@Test
	public void passwordShouldContainAtLeastOneUpperCaseCharacter() {
		passwordExpected = true;
		passwordActual = passwordVerify.checkPassword("ab7aiAyrt");
		Assert.assertEquals(passwordExpected, passwordActual);
	}

	@Test
	public void passwordShouldContainAtLeastOneLowerCaseCharacter() {
		passwordExpected = true;
		passwordActual = passwordVerify.checkPassword("ab7aiAyrt");
		Assert.assertEquals(passwordExpected, passwordActual);
	}

	@Test
	public void passwordShouldContainAtLeastOneDigit() {
		passwordExpected = true;
		passwordActual = passwordVerify.checkPassword("ab7aiAyrt");
		Assert.assertEquals(passwordExpected, passwordActual);
	}
	@Test
	public void passwordLessThanEightCharacters() {
		passwordExpected = false;
		passwordActual = passwordVerify.checkPassword("abyrt");
		Assert.assertEquals(passwordExpected, passwordActual);
	}

	

	@Test
	public void passwordShouldNotContainAnyUpperCaseCharacter() {
		passwordExpected = false;
		passwordActual = passwordVerify.checkPassword("77777777");
		Assert.assertEquals(passwordExpected, passwordActual);
	}

	@Test
	public void passwordShouldNotContainAnyLowerCaseCharacter() {
		passwordExpected = false;
		passwordActual = passwordVerify.checkPassword("7777777");
		Assert.assertEquals(passwordExpected, passwordActual);
	}

	@Test
	public void passwordShouldNotContainAnyDigit() {
		passwordExpected = false;
		passwordActual = passwordVerify.checkPassword("abdaiyBti");
		Assert.assertEquals(passwordExpected, passwordActual);
	}

	
	@Test
	public void shouldOkWithAtLeastThreeCondition(){
		String checkStatusOk = passwordVerify.atLeastThreeConditionCheck("ab7aii");
		Assert.assertEquals("Exception: Length should be Greater than or Equal to 8", checkStatusOk);
	}
	
	/*@Test
	public void shouldNotBeOkIfFourthConditionIsNotTrue(){
		String actualStatus = passwordVerify.atFourthConditionCheck("ab7aiyBti");
		Assert.assertEquals("Ok", actualStatus);
	}*/

}