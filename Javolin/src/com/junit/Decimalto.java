package com.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import project.*;

public class Decimalto {
	@Test
	public void postiveTest() {
		Decimalto d=new Decimalto();
		String actual=d.convertbinary(89);
		assertEquals('1011001',actual);
	}

	private int convertbinary(int i) {
		return 0;
	}
}