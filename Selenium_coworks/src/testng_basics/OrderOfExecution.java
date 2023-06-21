package testng_basics;

import org.testng.annotations.Test;

public class OrderOfExecution {
	@Test
	public void A()
	{
		System.out.println("from A");
	}
	@Test
	public void Z()
	{
		System.out.println("from Z");
	}
	@Test
	public void a()
	{
		System.out.println("from a");
	}
	@Test
	public void G()
	{
		System.out.println("from G");
	}
	@Test
	public void b()
	{
		System.out.println("from b");
	}

}
