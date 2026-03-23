package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHook {
	@Before("@sanity")
	public void beforeHook()
	{
		System.out.println("before hook is executing");
	}

	@After("@regression")
	public void AfterHook()
     {
		System.out.println("after hook is exscuting");
		
	 }
}
