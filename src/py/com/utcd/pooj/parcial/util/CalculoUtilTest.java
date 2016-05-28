package py.com.utcd.pooj.parcial.util;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import test.Operadores;

public class CalculoUtilTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	public void testpromedio() {
		CalculoUtil op = new CalculoUtil();

		Assert.assertEquals(15, op.calcularPromedio(10, 5, 30));
	}
}
