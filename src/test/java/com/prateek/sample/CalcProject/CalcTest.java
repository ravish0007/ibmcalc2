package com.prateek.sample.CalcProject;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalcTest {
	
	@Test
	public void testAddCase(){
		int result = CalcMain.addCase(4,6);
		assertThat(result,is("10"));			
	}

	@Test
	public void testSubCase(){
		int result = CalcMain.subCase(6,3);
		assertThat(result,is("3"));			
	}
	
	@Test
	public void testMulCase(){
		int result = CalcMain.mulCase(4,6);
		assertThat(result,is("24"));			
	}
	
	@Test
	public void testDivCase(){
		float result = CalcMain.divCase(10,2);
		assertThat(result,is("5.0"));			
	}
	
	@Test
	public void testRemCase(){
		int result = CalcMain.addCase(10,3);
		assertThat(result,is("1.0"));			
	}
}