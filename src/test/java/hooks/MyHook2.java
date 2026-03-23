package hooks;

import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class MyHook2 {
	
	@BeforeStep(order=1)
	public void beforeStep1()
	{
		System.out.println("before step1  is executing");	
	}
	
	@AfterStep(order=2)
	public void afterStep1()
	{
		System.out.println("after step1 is executing");
	}

	@BeforeAll(order=2)
	public static void beforeAll1()
	{
		System.out.println("before All1  is executing");	
	}
	
	@BeforeAll(order=1)
	public static void beforeAll2()
	{
		System.out.println("before All2  is executing");	
	}
	
	@AfterAll(order=1)
	public static void afterAll1()
	{
		System.out.println("after All1 is executing");
	}
	
	@AfterAll(order=2)
	public static void afterAll2()
	{
		System.out.println("after All2 is executing");
	}



}
