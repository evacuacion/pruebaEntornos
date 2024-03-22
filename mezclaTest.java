package pruebaJunit;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class mezclaTest {

	@Test
	public void testPosNeg() {
		System.out.println("Suma de positivos y negativos");
		Suma s= new Suma(2,3);
		assertEquals(5, s.sumar());
		SumaNeg n= new SumaNeg(-10, -5);
		assertEquals(-15, n.sumarNegativos());
	}

}
