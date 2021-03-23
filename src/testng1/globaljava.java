package testng1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class globaljava {

	public static void main(String[] args) throws IOException {
Properties prop = new Properties();
FileInputStream fis= new FileInputStream("C:\\Users\\sunny\\eclipse-workspace\\seleniumproject\\src\\seleniumproject\\Testngpractice\\src\\testng1\\global.properties");
prop.load(fis);
System.out.println(prop.getProperty("url"));
System.out.println(prop.getProperty("name"));
System.out.println(prop.getProperty("browser"));
prop.setProperty("browser", "firefox");
System.out.println(prop.getProperty("browser"));
FileOutputStream fos= new FileOutputStream("C:\\Users\\sunny\\eclipse-workspace\\seleniumproject\\src\\seleniumproject\\Testngpractice\\src\\testng1\\global.properties");
prop.store(fos, null);

	}

}
