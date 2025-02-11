package com.cognizant.maven.JunitDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;



class CalculatorTest {
	Calculator cl;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cl=new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		
	}

	@Test
	void addTest() {
		assertEquals(12,cl.add(6, 6));
	}
	@Test
	void subTest() {
		assertEquals(0,cl.sub(6, 6));
	}
	@Test
	void mulTest() {
		assertEquals(36,cl.mul(6, 6));
	}
	@Test
	void DivTest() {
		assertThrows(ArithmeticException.class,()->cl.div(6, 0),"wrong Exception thrown");
	}
	

	
	@ParameterizedTest
	@CsvSource({"2,4,6","14,7,21"})
	void addTest3(int a,int b,int c) {
		assertEquals(c,cl.add(a, b));
	}

}
