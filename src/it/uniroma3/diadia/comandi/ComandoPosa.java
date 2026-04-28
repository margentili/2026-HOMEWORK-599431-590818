package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class ComandoPosa implements Comando{

	private IO io;
	private String nomeAttrezzo;
	private final static String NOME = "posa";

	@Override
	public void esegui(Partita partita) {
		if(partita.getGiocatore().getBorsa().hasAttrezzo(nomeAttrezzo)==false) {
			io.mostraMessaggio("Non hai questo attrezzo in borsa");
		}
		else {
			Attrezzo attrezzoDaPosare = partita.getGiocatore().getBorsa().getAttrezzo(nomeAttrezzo);
			if(partita.getStanzaCorrente().addAttrezzo(attrezzoDaPosare)) {

				partita.getGiocatore().removeAttrezzoDallaBorsa(nomeAttrezzo);
				io.mostraMessaggio("Attrezzo "+attrezzoDaPosare.getNome().toUpperCase() + " posato!");
			}
			else {
				io.mostraMessaggio("Non c'è più spazio dentro questa stanza per posare attrezzi");
			} 
		}
	}

	@Override
	public void setParametro(String parametro) {
		this.nomeAttrezzo = parametro;
	}

	@Override
	public String getParametro() {
		return this.nomeAttrezzo;
	}

	@Override
	public void setIo(IO io) {
		this.io = io;
	}

	@Override
	public String getNome() {
		return NOME;
	}
}
