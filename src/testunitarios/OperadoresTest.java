package testunitarios;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import test.Operadores;

public class OperadoresTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testSumar() {
		Operadores op = new Operadores();
		Assert.assertEquals(10, op.sumar(5, 5));
	}
//si muestra error en @test es por que deves agregar el public
	@Test
	public void testrestar() {

	}
}
