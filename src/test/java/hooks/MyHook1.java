package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHook1 {
	@Before(order=2)
	public void beforeHook1()
	{
		System.out.println("before hook1 is executing");
	}
	
	@Before(value="@sanity",order=1)
	public void beforeHook2()
	{
		System.out.println("before hook2 is executing");
	}
	
	@After(order=5)
	public void afterHook1()
	{
		System.out.println("after hook1 is executing");
	}
	
	@After(order=3)
	public void afterHook2()
	{
		System.out.println("after hook2 is executing");
	}
	
	
}
