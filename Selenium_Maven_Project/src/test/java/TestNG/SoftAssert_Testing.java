package TestNG;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_Testing {

	SoftAssert soft= new SoftAssert();
	
	
@Test(priority = 1)
public void SoftAssrt_Test()
{
	
	int a=10;
	int b=11;
	


soft.assertEquals(a, b);

	System.out.println("-----done-------");

	soft.assertAll();			
		
	}

@Test(priority = 2)
public void SoftAssrt_Test2()
{
	
	int a=100;
	int b=11;
	

soft.assertEquals(a, b);

	System.out.println("-----done-------");

	soft.assertAll();			
		
	}



}
