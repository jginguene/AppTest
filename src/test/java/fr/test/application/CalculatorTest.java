package fr.test.application;

import org.junit.Test;

import junit.framework.TestCase;

public class CalculatorTest {

	@Test
	public void testAdd1() {
		int res = new Calculator().add(1, 2);
		TestCase.assertEquals(3, res);

	}

	@Test
	public void testDiff1() {
		int res = new Calculator().diff(5, 1);
		TestCase.assertEquals(4, res);

	}

}
