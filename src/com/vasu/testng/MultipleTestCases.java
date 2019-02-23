package com.vasu.testng;

import org.testng.annotations.Test;

public class MultipleTestCases 
{
	@Test()
	public void appLaunch()
	{
		System.out.println("appLaunch");
	}

	@Test()
	public void appLogin()
	{
		System.out.println("appLogin");
	}

	@Test(enabled=false)
	public void appClose()
	{
		System.out.println("appClose");
	}

}
