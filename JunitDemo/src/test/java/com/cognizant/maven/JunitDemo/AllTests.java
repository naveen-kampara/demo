package com.cognizant.maven.JunitDemo;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ AppTest.class, CalculatorTest.class, LoginTest.class })
public class AllTests {
	
	
}
