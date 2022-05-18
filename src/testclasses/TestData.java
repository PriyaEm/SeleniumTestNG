package testclasses;

import org.testng.annotations.DataProvider;

public class TestData {

	@DataProvider(name = "inputs")
	public Object[][] getData() {
		return new Object[][] { { "bmw", "x6" }, { "audi", "a6" }, { "honda", "c300" } };
	}
}
