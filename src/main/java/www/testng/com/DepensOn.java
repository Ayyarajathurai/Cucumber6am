package www.testng.com;

import org.testng.annotations.Test;

public class DepensOn {
	@Test(dependsOnMethods = "eMethod")
	public void bMethod() {
System.out.println("B method executed");
	}
	
	@Test(dependsOnMethods = "dMethod")
	public void eMethod() {
System.out.println("E method executed");
	}
	
	
	@Test(dependsOnMethods = "aMethod")
	public void dMethod() {
System.out.println("D method executed");
	}
	
	@Test(dependsOnMethods = "cMethod")
	public void aMethod() {
System.out.println("A method executed");
	}

	@Test(dependsOnMethods = "bMethod")
	private void cMethod() {
System.out.println("C method excuted");
	}
	
	
	

}
