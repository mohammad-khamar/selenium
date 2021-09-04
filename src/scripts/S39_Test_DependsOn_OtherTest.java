package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class S39_Test_DependsOn_OtherTest 
{
	@Test
	public void createUser()
	{
		SoftAssert s=new SoftAssert();
		s.assertEquals("Vijay kumar", "Vijay kumar");
		Reporter.log("Created", true);
		s.assertAll();
	}
	@Test(dependsOnMethods="createUser")
	public void deleteUser()
	{
		Reporter.log("Delete User", true);
	}
}


