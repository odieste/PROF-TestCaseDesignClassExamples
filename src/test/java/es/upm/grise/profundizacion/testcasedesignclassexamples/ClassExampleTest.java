package es.upm.grise.profundizacion.testcasedesignclassexamples;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ClassExampleTest {
	
	private ClassExample programToTest;

	@BeforeEach
	public void setup() {
		programToTest = new ClassExample();
	}
	
	static Stream<Object[]>data() {
		return Stream.of(new Object[] { new char[] {65, 27} }, // Para salir del do..while. De lo contrario, el test no termina
                                                               // En la práctica, son 2 casos de prueba
				         new Object[] { new char[] {13} },
				         new Object[] { new char[] {255, 27} }
		                );
	}

	@ParameterizedTest(name = "Test {index}: {0}")
	@DisplayName("Estamos testeando el código del ejemplo de clase")
	@MethodSource("data")
	//@ValueSource(ints = { 1, 2, 3, .....} )
	public void test(char chars[]) {
		Utils.initialize(chars);
		programToTest.exampleInTheSlides();
	}

}
