package www.testng.com;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestngIgnore {
	
	@Test(enabled = false)
	public void bMethod() {
System.out.println("B method executed");
	}
	
	@Test
	public void eMethod() {
System.out.println("E method executed");
	}
	
	@Ignore
	@Test
	public void dMethod() {
System.out.println("D method executed");
	}
	
	@Test
	public void aMethod() {
System.out.println("A method executed");
	}
	
	@Test
	private void cMethod() {
System.out.println("C method excuted");
	}
	
	
	
	
	
	
}
