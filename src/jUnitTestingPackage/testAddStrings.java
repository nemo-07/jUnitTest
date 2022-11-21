package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunction obj = new jUnitFunction();
		String result = obj.AddStrings("HI", " USER");
		assertEquals("HI USER", result);
	}

}
