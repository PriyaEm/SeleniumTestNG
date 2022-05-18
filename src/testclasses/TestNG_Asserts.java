package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import appcode.SomeClassToTest;

public class TestNG_Asserts {
	
	@Test
	public void testSum() {
		System.out.println("Running Test -> testSum");
		SomeClassToTest Obj = new SomeClassToTest();
		int result = Obj.sumNumbers(2, 3);
		Assert.assertEquals(result, 5);
	}
	
	@Test
	public void testStrings() {
		System.out.println("Running Test -> testStrings");
		String expectedString = "Hello World";
		SomeClassToTest Obj = new SomeClassToTest();
		String result = Obj.addStrings("Hello", "World");
		Assert.assertEquals(result, expectedString);
	}
	
	@Test
	public void testArrays() {
		System.out.println("Running Test -> testArrays");
		int [] expectedArray = {1, 2, 3};
		SomeClassToTest Obj = new SomeClassToTest();
		int [] result = Obj.getArray();
		Assert.assertEquals(result, expectedArray);	
		System.out.println("End Test -> testArrays");
	}
}
