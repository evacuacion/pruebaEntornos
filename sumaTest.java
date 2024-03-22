package pruebaJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class sumaTest {

	@Test
	public void sumaPositivos() {
		System.out.println("Sumando dos números positivos: ");
		Suma s= new Suma(2,3);
		assertEquals(5, s.sumar());
	}
}
