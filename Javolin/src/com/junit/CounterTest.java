package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import project.Counter;

public class CounterTest {

	@Test
	public void PostiveTest() {
		Counter c=new Counter();
		int actual=c.returnCounter(6);
		assertEquals(7, actual);		
	}
	@Test
	public void negativeTest() {
		Counter c=new Counter();
		int actual=c.returnCounter(-1);
		assertEquals(0, actual);		
	}

}