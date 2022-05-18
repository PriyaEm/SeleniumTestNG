package testclasses;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.ITestNGMethod;

public class TestNG_DataProvider {
//	
//	@DataProvider(name="inputs")
//	public Object[][] getData(){
//		return new Object[][] {
//			{"bmw", "x6"},
//			{"audi", "a6"},
//			{"honda", "c300"}
//		};
//	}

	@Test(dataProvider = "inputs" , dataProviderClass = TestData.class) 
	public void testMethod(String input1, String input2) {
		System.out.println("Input1: " + input1);
		System.out.println("Input2: " + input2);
	}
}
