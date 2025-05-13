package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class testMedia {

	static float notas [];
	@BeforeAll
	static void setup() {
		notas = new float [] {7.5f,8f, 6.5f,2f};
	}
	@Test
	void testMediaNotas() {
		
		float resultadoObtenido = MisArrays.mediaNotas(notas);
		float resultadoEsperado = 6;
		
		assertEquals(resultadoObtenido, resultadoEsperado);
	}

}
