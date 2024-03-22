package pruebaJunit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class sumaNegTest {

	@Test
	public void sumaNegativos() {
		System.out.println("Sumando dos números negativos: ");
		SumaNeg n= new SumaNeg(-10, -5);
		assertEquals(-15, n.sumarNegativos());
	}

}
