package application;

import framework.Test;
import framework.TestClass;

@TestClass
public class MyTest {
	
	@Test
	public void testMethod1() {
		System.out.println("perform test method 1");
	}

	@Test
	public void testMethod2() {
		System.out.println("perform test method 2");
	}

}
