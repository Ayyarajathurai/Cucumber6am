package www.testng.com;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {

	
	@Test(dataProvider = "data")
	public void aMethod(String username,String password) {

		
	System.out.println("name is  "+username+"password is   "+password);	
		
		
	}
		
		@DataProvider(name="data")
	public Object[][] testData() {

		return new Object[][] {
			
			{"abc","123"},{"def","345"},{"ghi","678"}
			
		};
		
	}	
	
	
		
		
}	
		
		
		
		
		
		
	
	
	
	
	
	
	
	

