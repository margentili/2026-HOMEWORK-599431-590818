package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class ComandoPrendi implements Comando{

	private IO io;
	private String nomeAttrezzo;
	private final static String NOME = "prendi";



	@Override
	public void esegui(Partita partita) {
		if (partita.getStanzaCorrente().hasAttrezzo(nomeAttrezzo)==false){
			io.mostraMessaggio("L'attrezzo [" + nomeAttrezzo + "] non esiste");
		}else {
			Attrezzo attrezzoDaPrendere = partita.getStanzaCorrente().getAttrezzo(nomeAttrezzo);
			if(partita.getGiocatore().addAttrezzoInBorsa(attrezzoDaPrendere)) {
				if(partita.getStanzaCorrente().removeAttrezzo(nomeAttrezzo)) { 
					io.mostraMessaggio("Hai preso "+ attrezzoDaPrendere.getNome().toUpperCase() + "!");
				}
			}
			else {
				io.mostraMessaggio("Borsa Piena o troppo pesante!");}
		}
	}


	@Override
	public void setParametro(String parametro) {
		this.nomeAttrezzo = parametro;
	}

	@Override
	public String getParametro() {
		return this.nomeAttrezzo;}

	@Override
	public void setIo(IO io) {
		this.io = io;

	}

	@Override
	public String getNome() {
		return NOME;	
	}
}
