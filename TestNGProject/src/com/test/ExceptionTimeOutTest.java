package com.test;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {

	@Test (timeOut=1000)
	public void infintLoopTest() {
		int i =1;
		while(i==1) {
			System.out.println(i);
		}
	}
	
	@Test (expectedExceptions = NumberFormatException.class)
	public void test1() {
		String x = "100A";
		Integer.parseInt(x);
	}
	
	
	
}
