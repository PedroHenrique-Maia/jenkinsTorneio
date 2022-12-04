package com.training.Tenis.Torneio;

import static org.junit.Assert.*;

import org.junit.Test;

public class TorneioTest {
	@Test
	public void testVitoria() {
		TorneioTenis tenis = new TorneioTenis();
		char[] Partidas = {'V','V','P','P','P','V'};
		int resp = tenis.Torneio(Partidas);
		assertTrue(resp == 2);
	}
	
}
