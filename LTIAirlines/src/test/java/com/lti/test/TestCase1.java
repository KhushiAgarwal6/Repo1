package com.lti.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.Lti.client.Main;
import com.Lti.model.Flight;

public class TestCase1 {
	@Test
	public void testAdd() {
		// test data
		int num1 = 10;
		int num2 = 20;

		assertEquals(30, Main.add(num1, num2));

	}

	@Test
	public void testNums() {
		// test data
		int num1 = 10;
		int num2 = 20;
		// int num2=10;
		assertTrue(Main.compare(num1, num2));
	}

	@Test
	public void testObjects() {
		Flight f1 = new Flight(1001, "mumbai", "delhi");
		Flight f2 = new Flight(1001, "mumbai", "delhi");
		Flight f3 = null;
		// Flight f2=f1;
		// assertSame(f1, f2);
		// assertEquals("not same", f1, f2);
		assertNotNull(f3);

	}

}
