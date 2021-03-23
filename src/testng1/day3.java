package testng1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day3 {
@Test(dependsOnMethods= {"carloanmobile"})
public void carloansignin() {
	System.out.println("car signin page");
}
@Test
public void carloanmobile() {
	System.out.println("car laon mobile signin");
	
}
@Test(groups= {"1st group"})
public void carloanapi() {
	System.out.println("car loan api signin");
}
@BeforeTest
public void beforecarloansignin() {
	System.out.println("i will execute first");
	
}
@Test(timeOut = 500000)
public void carTImeout() {
	System.out.println("checking time");
	
}
}
