package org.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A {

	@Test
	private void tc11() {
		System.out.println("test   11 ");

	}
	
	@Test
	
	private void tc12() {
		Assert.assertTrue(false, "Assert Failure in tc22");
	}	
	@Test

	private void tc13() {
System.out.println("tc13");

	}

}
