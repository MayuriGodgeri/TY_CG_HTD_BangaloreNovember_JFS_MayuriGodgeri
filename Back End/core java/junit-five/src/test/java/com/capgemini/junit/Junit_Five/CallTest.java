package com.capgemini.junit.Junit_Five;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CallTest {

	@Test
	void testAdd() {
		Calculator c1=new Calculator();
	int	i=c1.add(5,25);
		assertEquals(30,i);
		
	}
    
	@Test
	void testNeg() {
		Calculator c1=new Calculator();
	int	i=c1.add(5,-3);
		assertEquals(2,i);
		
	}
	
	@Test
	void testMulti() {
		Calculator c1=new Calculator();
	int	i=c1.multi(5,-3);
		assertEquals(-15,i);
		
	}
	@Test
	void testMulti1() {
		Calculator c1=new Calculator();
	int	i=c1.multi(5,30);
		assertEquals(150,i);
		
	}
	@Test
	void testMulti2() {
		Calculator c1=new Calculator();
	int	i=c1.multi(-5,-3);
		assertEquals(15,i);
		}
	
	@Test
	void testDivide() {
		Calculator c1=new Calculator();
	int	i=c1.divide(10,5);
		assertEquals(2,i);
		}
	@Test
	void testDivide2() {
		Calculator c1=new Calculator();
	int	i=c1.divide(-50,5);
		assertEquals(-10,i);
		}
	
	void testFindLength() {
		Calculator c1=new Calculator();
		int res=c1.findLength("mayu");
		assertEquals(4,res);
	}
	
	
	@Test
	void testDivideForArithmeticException() {
		Calculator c1=new Calculator();
	
		assertThrows(ArithmeticException.class,
				()->{
					int	i=c1.divide(10,0);
					
				});
		}
	@Test
	void testFindLengthForNullPointerException() {
		Calculator c1=new Calculator();
		assertThrows(NullPointerException.class,
				()->{
				int i1=	c1.findLength(null);
				});
		
	}
	
}
