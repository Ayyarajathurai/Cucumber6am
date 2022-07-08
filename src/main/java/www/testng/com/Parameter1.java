package www.testng.com;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

public class Parameter1 {

	@org.testng.annotations.Parameters({"name"})
	@Test
	private void aMethod(String username)  {

		System.out.println(username);	
	}
	
	@org.testng.annotations.Parameters({"pass"})
	@Test
	private void bMetho(String password)  {
		
	System.out.println(password);	
		
	}

@org.testng.annotations.Parameters({"india"})
	private void cMethod(String state ) {
System.out.println(state);
	}
}
