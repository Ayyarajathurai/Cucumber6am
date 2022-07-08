package www.testng.com;

import org.testng.annotations.Test;

public class Priority {
	
	
		
		@Test(priority = 1)
		public void bMethod() {
	System.out.println("B method executed");
		}
		
		@Test(priority = 2)
		public void eMethod() {
	System.out.println("E method executed");
		}
		
		
		@Test(priority = 3)
		public void dMethod() {
	System.out.println("D method executed");
		}
		
		@Test(priority = 4)
		public void aMethod() {
	System.out.println("A method executed");
		}
		
		@Test(priority = 5)
		private void cMethod() {
	System.out.println("C method excuted");
		}
		
		
		
		
		
		
	}



