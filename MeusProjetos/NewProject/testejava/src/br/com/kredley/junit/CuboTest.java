package br.com.kredley.junit;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import br.com.kredley.heranca.Cubo;

public class CuboTest {
	
	Cubo cubo;
	

	@Before
	public void setUp() throws Exception {
		cubo = new Cubo(10);
	}

	@Test
	public void testCalcularVolume() {
		assertEquals(600, cubo.calcularVolume(), 0);
	}

	@Test
	public void testCalculaArea() {
		assertEquals(1000, cubo.calculaArea(), 0);
	}

}
