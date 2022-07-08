package www.testng.com;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test
	private void aMethod() {
System.out.println("A method");
	}
	@Test
	private void bMethod() {
		
		System.out.println("Bmethod");
	}
	
	@Test(invocationCount = 6)
	private void cMethod() {
System.out.println("C method ");
		
	}
	
	
	
	
	

}
