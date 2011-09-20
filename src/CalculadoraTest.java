import static org.junit.Assert.*;

import org.junit.Test;



public class CalculadoraTest {

	@Test
	public void deveSomarUmMaisUm() {
		int resultado = Calculadora.somar(1,1);
		assertEquals(2, resultado );
	}
}
