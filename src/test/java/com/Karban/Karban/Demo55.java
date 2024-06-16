package com.Karban.Karban;

import org.testng.annotations.Test;

public class Demo55 {
	@Test
	void a1()
	{
		System.out.println("A");
	}
	@Test
	void b2()
	{
		System.out.println("B");
	}
	@Test
	void c3()
	{
		System.out.println("C");
	}
	@Test(priority = 1)
	void d4()
	{
		System.out.println("D");
	}

}
