package www.testng.com;

import org.testng.annotations.Test;

public class Timeout {
	@Test
	private void aMethod() {
System.out.println("A method");
	}
	@Test(timeOut = 1000)
	private void bMethod() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Bmethod");
	}
	
	@Test
	private void cMethod() {
System.out.println("C method ");
	
	
	}
}
