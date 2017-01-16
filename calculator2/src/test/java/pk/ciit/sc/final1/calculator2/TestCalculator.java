package pk.ciit.sc.final1.calculator2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculator {

	Calculator obj=new Calculator();
	
	@Test
	public void testsquare() {
		
		int result=obj.square(5);
		assertEquals(25,result);
		
	}
	@Test
	(expected= IllegalArgumentException.class)
	public void testsquare1() throws IllegalArgumentException {
		
	   int result =obj.square(Integer.parseInt("helllo"));
	   
	   throw new IllegalArgumentException();
	}
	
	
	@Test
	public void testmax() {
		
		int result=obj.findMax(34, 5, 10);
		assertEquals(34,result);
		
	}
	
	@Test
	public void tescube() {
		
		int result=obj.cube(5);
		assertEquals(125,result);
		
	}
	
	@Test
	public void testdevide() {
		
		int result=obj.devide(25,5);
		assertEquals(5,result);
		
	}
	
	@Test
	(expected= ArithmeticException.class)
	public void testdevid() throws ArithmeticException {
		
	   int result =obj.devide(25,0);
	   
	   throw new ArithmeticException();
	}
	
	
	
	
	
	
	
	
	

}
