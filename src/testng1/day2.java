package testng1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day2 {

	@Test(groups= {"1st group"})
	public void part2()
	{
		System.out.println("hello2");
	}
	@BeforeMethod
	public void everytime() {
		System.out.println("i execute before every method");
	}
}
