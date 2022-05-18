package testclasses;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Parameters {

	@BeforeClass
	@Parameters ({"browser", "platform"})
	public void setUp(String browser, String platform) {
	System.out.println("TestNG Parameters -> Setup");
	System.out.println("1. Parameter value from xml file: " + browser);
	System.out.println("2. Parameter value from xml file: " + platform);
//	Asserts.assertequals()
	}

	@Test
	public void testMethod1() {
	}
}
