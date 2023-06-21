package testng_basics;

import org.testng.annotations.Test;

public class WorkingOnOrderofExecution_Dependency {
	@Test(dependsOnMethods = "register")
	public void login()
	{
		System.out.println("from log in");
	}
	@Test(dependsOnMethods = "login" )
	public void search() {
		System.out.println("from search");
	}
	@Test
	public void register() {
		System.out.println("from register");
	}

}
