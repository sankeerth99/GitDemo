package testng1;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	@AfterSuite
public void imlast() {
		System.out.println("im the last to execute");
	}
	@Parameters({"url","username"})
	@Test 
	public void demo(String facebooklink, String othername)
	{
		 
System.out.println("helloi");
System.out.println(facebooklink);
System.out.println(othername);

	}
	
	@AfterMethod
	public void afterevery() {
		System.out.println("i will execute after every method");
	}
@Test
public void second() {
	System.out.println("bye");
	Assert.assertTrue(false);
}

}
