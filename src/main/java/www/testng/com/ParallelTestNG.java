package www.testng.com;

import org.testng.annotations.Test;

public class ParallelTestNG {
	
	
	
	@Test
	
	private void aMethod() throws InterruptedException {

		System.out.println("B Method");	
		//Thread.sleep(1000);
	}
	
	@Test
	private void bMetho() throws InterruptedException {
		
	System.out.println("A method");	
	//Thread.sleep(1000);
		
	}
	@Test
	private void cMethod() throws InterruptedException {
System.out.println("C Method");
//Thread.sleep(1000);
	}
	
	
	

}
