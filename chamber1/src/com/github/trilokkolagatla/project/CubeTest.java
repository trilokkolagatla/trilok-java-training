package com.github.trilokkolagatla.project;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.trilokkolagatla.project.Cube;

public class CubeTest {

	@Test
	public void postiveTest() {
		Cube c=new Cube();
		double num=c.returnCube(27);
		assertEquals(3.0,num, 0.001);
	}
	@Test
	public void negativeTest() {
		Cube c=new Cube();
		double num=c.returnCube(-27);
		assertEquals(-3.0,num, 0.001);
	}
	

}
