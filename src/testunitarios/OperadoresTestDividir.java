package testunitarios;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import test.Operadores;

public class OperadoresTestDividir extends OperadoresTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testDividir() {
		Operadores op = new Operadores();

		Assert.assertEquals(2, op.dividir(10, 5));
	}
}
