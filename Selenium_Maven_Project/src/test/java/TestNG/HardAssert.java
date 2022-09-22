package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

@Test()
public void HardAssert_Test()
{
	
	int a=10;
	int b=11;
	
	
	Assert.assertEquals(a, b);
	System.out.println("-----done-------");

				
		
	}

}
