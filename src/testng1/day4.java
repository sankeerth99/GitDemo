package testng1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day4 {
@Test
public void homeloansignin() {
	System.out.println("home signin page1");
}
@Test
public void grouphomeloanmobile() {
	System.out.println("group home laon mobile signin2");
	
}

@AfterTest
public void Aftergrouphomeloanmobile() {
	System.out.println("I will execute last3");
	
}
@Test(enabled=false)
public void grouploanmobile() {
	System.out.println("home group laon mobile signin4");
	
}
@BeforeSuite
public void beforesuite() {
	System.out.println("im the first");
}
@Test(groups= {"1st group"})
public void groupmobile() {
	System.out.println("homegroup mobile signin5");
	
}
@Test
public void homeloanapi() {
	System.out.println("home loan api signin6");
}
}
