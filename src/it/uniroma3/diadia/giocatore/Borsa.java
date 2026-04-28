package it.uniroma3.diadia.giocatore;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class Borsa {
	public final static int DEFAULT_PESO_MAX_BORSA = 10;
	private Attrezzo[] attrezzi;
	private int numeroAttrezzi;
	private int pesoMax;
	
	public Borsa() {
		this(DEFAULT_PESO_MAX_BORSA);
	}
	public Borsa(int pesoMax) {
		this.pesoMax = pesoMax;
		this.attrezzi = new Attrezzo[10];
		this.numeroAttrezzi = 0;
	}
	
	/**
	 * Restituisce true solo se l'attrezzo è stato aggiunto
	 * @return true solo se l'attrezzo è stato aggiunto
	 */
	public boolean addAttrezzo(Attrezzo attrezzo) {
		if(attrezzo == null) 
			return false;
		if(this.getPeso()+attrezzo.getPeso()>this.getPesoMax())
			return false;
		if(this.numeroAttrezzi == 10)
			return false;
		this.attrezzi[this.numeroAttrezzi] = attrezzo;
		this.numeroAttrezzi++;
		return true;
	}
	
	/**
	 * Ritorna il riferimento all'attrezzo rimosso
	 * @param nomeAttrezzo
	 * @return riferimento all'attrezzo rimosso, null se vuoto
	 */
	public Attrezzo removeAttrezzo(String nomeAttrezzo) {
	    Attrezzo a = null;
	    if(this.numeroAttrezzi != 0 && this.hasAttrezzo(nomeAttrezzo)) {
	        for(int i = 0; i < this.numeroAttrezzi; i++) {
	            if(this.attrezzi[i] != null && this.attrezzi[i].getNome().equals(nomeAttrezzo)) {
	                a = this.attrezzi[i];
	                this.attrezzi[i] = this.attrezzi[this.numeroAttrezzi - 1];
	                this.attrezzi[this.numeroAttrezzi - 1] = null;
	                this.numeroAttrezzi--;
	                break; 
	            }
	        }
	    }
	    return a;
	}

	/**
	 * Restituisce l'attrezzo indicato con il nome
	 * @return un riferimento all'attrezzo indicato con il nome
	 */
	public Attrezzo getAttrezzo(String nomeAttrezzo) {
		Attrezzo a = null;
		for(int i=0;i<this.numeroAttrezzi;i++)
			if(this.attrezzi[i].getNome().equals(nomeAttrezzo))
				a = attrezzi[i];
		return a;
	}
	
	public boolean hasAttrezzo(String nomeAttrezzo) {
		return this.getAttrezzo(nomeAttrezzo)!=null;
	}
	
	public int getPesoMax() {
		return pesoMax;
	}
	
	
	public int getPeso() {
		int peso = 0;
		for(int i=0; i<this.numeroAttrezzi;i++)
			peso += this.attrezzi[i].getPeso();
		return peso;
	}
	
	public boolean isEmpty() {
		return this.numeroAttrezzi == 0;
	}

	
	public String toString() {
		StringBuilder s = new StringBuilder();
		if(!this.isEmpty()) {
			s.append("Contenuto borsa ("+this.getPeso()+"kg/"+this.getPesoMax()+"kg): ");
			for(int i=0; i<this.numeroAttrezzi;i++)
				s.append(attrezzi[i].toString()+" ");
		}
		else
			s.append("Borsa vuota");
		return s.toString();
	}
	
	
	
	
	
	
	
	
	
	
}
	
	
	

