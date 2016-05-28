package testunitarios;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import test.Operadores;

public class OperadoresTestMultiplicar extends OperadoresTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testMultiplicar() {
		Operadores op = new Operadores();

		Assert.assertEquals(25, op.multiplicar(5, 5));
	}
}

