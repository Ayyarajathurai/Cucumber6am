package www.testng.com;

import org.testng.annotations.Test;

public class Testng_expectedexception {

	@Test(expectedExceptions = ArithmeticException.class)
	private void aMethod() {
System.out.println("A method");
int a=5/0;
	}
	@Test
	private void bMethod()  {
		
		System.out.println("Bmethod");
	}
	
	@Test
	private void cMethod() {
System.out.println("C method ");
	
	
	}
	
}
