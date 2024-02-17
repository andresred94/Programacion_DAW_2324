package operacionejecicio;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
class TestOperaciones {
	private static Suma suma;
	private static Resta resta;
	@BeforeAll
	public static void init() {
		suma = new Suma();
		resta = new Resta();
	}
	
	@ParameterizedTest
	@CsvSource({
		"1,2,3"
	})
	void testSuma(int valor1, int valor2, int resultadoEsperado) {
		suma.cargar1(valor1);
		suma.carga2(valor2);
		suma.operar();
		int resultadoFuncion = suma.mostrarResultado();
		assertEquals(resultadoEsperado,resultadoFuncion);
		
	}
	@ParameterizedTest
	@CsvSource({
		"1,2,-1"
	})
	void testResta(int valor1, int valor2, int resultadoEsperado) {
		resta.cargar1(valor1);
		resta.carga2(valor2);
		resta.operar();
		int resultadofuncion = resta.mostrarResultado();
		assertEquals(resultadoEsperado, resultadofuncion);
	}
	@AfterAll
	static void TearDown() {} 

}
