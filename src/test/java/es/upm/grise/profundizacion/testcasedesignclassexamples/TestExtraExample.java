package es.upm.grise.profundizacion.testcasedesignclassexamples;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestExtraExample {
	ClassExample c;
	
	@BeforeEach
	public void setUp() {
		c = new ClassExample();
	}

	@Test
	public void test1() {
		c.extraExample1(-3, 6);
	}
	
	@Test
	public void test2() {
		c.extraExample1(5, -4);
	}
	
	@Test
	public void test3() {
		c.extraExample1(7, 8);
	}
	
	@Test
	public void test4() {
		c.extraExample1(10, 10);
	}

}
