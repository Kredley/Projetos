package br.com.kredley.junit;

import static org.junit.Assert.fail;
import static junit.framework.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.kredley.teste.Matematica;

public class MatematicaTest {
	
	Matematica m;

	@Before
	public void setUp() throws Exception {
		m = new Matematica();
	}

	@Test
	public void testRaiz() {
		assertEquals(4, m.raiz(16));
		
	}

	@Test
	public void testMaior() {
		assertEquals(20, m.maior(10, 20));
	}

	@Test
	public void testSoma() {
		assertEquals(3.0, m.soma("1", "2"));
	}

}
