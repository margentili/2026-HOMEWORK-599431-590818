package it.uniroma3.diadia.giocatore;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


import org.junit.Test;

import it.uniroma3.diadia.Partita;

public class GiocatoreTest {
	Partita p = new Partita();
	Giocatore g = new Giocatore();
	
	@Test
	public void testGetCfuDefault() {
		assertEquals(20, p.getGiocatore().getCfu());
	}
	
	@Test
	public void testSetCfu() {
		g.setCfu(3);
		assertEquals(3, g.getCfu());
	}

	@Test
	public void testGetBorsaDefault() {
		assertNotNull(g.getBorsa());
	}

}
