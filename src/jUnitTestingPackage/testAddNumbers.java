package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunction obj = new jUnitFunction();
		int result = obj.addNumbers(50, 50);
		assertEquals(100, result);
	}

}
