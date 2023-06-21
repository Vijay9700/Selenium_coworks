package testng_basics;

import org.testng.annotations.Test;
//if we are not using priority it will follow alphabetical order 

public class Working_on_OrderOfExecution_Priority {
	@Test(priority = 2)
	public void login()
	{
		System.out.println("from log in");
	}
	@Test(priority = 3)
	public void search() {
		System.out.println("from search");
	}
	@Test(priority = 1)
	public void register() {
		System.out.println("from register");
	}

}
