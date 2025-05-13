package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.MisArrays;

class testMaximo {

	
	static float notas [];
	@BeforeAll
	static void setup() {
		notas = new float [] {7.5f,8f, 6.5f,2f};
	}
	@Test
	void testMaximaNota() {
		float resultadoEsperado = MisArrays.maximaNota(notas);
		
		float resultadoObtenido = 8;
		
		
		assertEquals (resultadoObtenido,resultadoEsperado);
	}
}
