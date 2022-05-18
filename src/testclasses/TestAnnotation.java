package testclasses;

import org.testng.annotations.Test;
import appcode.SomeClassToTest;

public class TestAnnotation {

	@Test
	public void testMethod1() {
		SomeClassToTest Obj = new SomeClassToTest();
		int result = Obj.sumNumbers(2, 3);
		System.out.println("\nRunning Test -> testMethod1");
	}

	@Test
	public void testMethod2() {
		System.out.println("\nRunning Test -> testMethod2");
	}

	@Test
	public void testMethod3() {
		System.out.println("\nRunning Test -> testMethod3");
	}
}
