import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TesngAnnotations {
	
	@Test
	public void method1() {
		
		System.out.println("CALLING METHOD 1");
	}
	@Test
	public void method2() {
		
		System.out.println("CALLING METHOD 2");
	}
	@Test
	public void method3() {
		
		System.out.println("CALLING METHOD 3");
	}
	
	@BeforeMethod
	public void before() {
		
		System.out.println("*****CALLING BEFORE METHOD*********");
	}
	
	@AfterMethod
	public void after() {
		
		System.out.println("*****CALLING AFTER METHOD*********");
	}

	@BeforeClass
	public void beforeclass() {
		
		System.out.println("BEFORE CLASS");
	}
	@AfterClass
	public void afterclass() {
		
		System.out.println("AFTER CLASS");
	}
	
}
