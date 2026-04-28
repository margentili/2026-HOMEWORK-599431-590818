package it.uniroma3.diadia.giocatore;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class Giocatore {
	private int cfu;
	private Borsa borsa;
	
	public Giocatore() {
		this.borsa = new Borsa();
	}

	public void setBorsa(Borsa borsa) {
		this.borsa = borsa;
	}

	public Borsa getBorsa() {
		return this.borsa;
	}
	
	public void setCfu(int cfu) {
		this.cfu=cfu;
	}
	
	public int getCfu() {
		return this.cfu;
	}
	
	public boolean addAttrezzoInBorsa(Attrezzo attrezzo) {
		return this.borsa.addAttrezzo(attrezzo);
	}
	public Attrezzo removeAttrezzoDallaBorsa(String nomeAttrezzo) {
		return this.borsa.removeAttrezzo(nomeAttrezzo);
	}



}



