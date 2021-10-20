package es.upm.grise.profundizacion.testcasedesignclassexamples;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CuriousEclEmmaBehaviorTest {
	
	CuriousEclEmmaBehavior p = new CuriousEclEmmaBehavior();

	@Test
	public void testAnd_ff() {
		//p.logicalAnd(false, false);
	}
	
	@Test
	public void testAnd_ft() {
		p.logicalAnd(false, true);
	}
	
	@Test
	public void testAnd_tt() {
		p.logicalAnd(true, true);
	}
	
	@Test
	public void testOr_ff() {
		p.logicalOr(false, false);
	}
	
	@Test
	public void testOr_ft() {
		p.logicalOr(false, true);
	}
	
	@Test
	public void testOr_tt() {
		p.logicalOr(true, true);
	}
	
	@Test
	public void testException() {
		assertThrows(Exception.class, () -> p.foo());
	}
	

}
