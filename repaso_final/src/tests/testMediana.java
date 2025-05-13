package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class testMediana {

	static float notas [];
	@BeforeAll
	static void setup() {
		notas = new float [] {7.5f,8f, 6.5f,2f};
	}
	
	@Test
	void testMedianaNotas() {
		float resultadoObtenido = MisArrays.medianaNotas(notas);
		
		float resultadoEsperado = 7;
		
		assertEquals(resultadoObtenido,resultadoEsperado);
	}

}
