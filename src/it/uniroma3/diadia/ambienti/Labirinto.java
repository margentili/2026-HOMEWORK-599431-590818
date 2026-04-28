package it.uniroma3.diadia.ambienti;
import it.uniroma3.diadia.attrezzi.*;

public class Labirinto {
	private Stanza stanzaIniziale;
	private Stanza stanzaFinale;
	
	
	public Labirinto() {
		creaStanze();
	}
	
    /**
     * Crea tutte le stanze e le porte di collegamento
     */
    private void creaStanze() {

		/* crea gli attrezzi */
    	Attrezzo lanterna = new Attrezzo("lanterna",3);
		Attrezzo osso = new Attrezzo("osso",1);
		Attrezzo pesca = new Attrezzo("pesca",5);
		Attrezzo spada = new Attrezzo("spada",8);
    	Attrezzo marmitta = new Attrezzo("marmitta",4);
		
		
		/* crea stanze del labirinto */
		Stanza atrio = new Stanza("Atrio");
		Stanza aulaN11 = new StanzaMagica("Aula N11");
		Stanza aulaN10 = new StanzaBloccata("Aula N10","est","marmitta");
		Stanza laboratorio = new StanzaBuia("Laboratorio Campus","lanterna");
		Stanza biblioteca = new Stanza("Biblioteca");
		
		/* collega le stanze */
		atrio.impostaStanzaAdiacente("nord", biblioteca);
		atrio.impostaStanzaAdiacente("est", aulaN11);
		atrio.impostaStanzaAdiacente("sud", aulaN10);
		atrio.impostaStanzaAdiacente("ovest", laboratorio);
		aulaN11.impostaStanzaAdiacente("est", laboratorio);
		aulaN11.impostaStanzaAdiacente("ovest", atrio);
		aulaN10.impostaStanzaAdiacente("nord", atrio);
		aulaN10.impostaStanzaAdiacente("est", aulaN11);
		aulaN10.impostaStanzaAdiacente("ovest", laboratorio);
		laboratorio.impostaStanzaAdiacente("est", atrio);
		laboratorio.impostaStanzaAdiacente("ovest", aulaN11);
		biblioteca.impostaStanzaAdiacente("sud", atrio);

        /* pone gli attrezzi nelle stanze */
		aulaN10.addAttrezzo(lanterna);
		atrio.addAttrezzo(osso);
		laboratorio.addAttrezzo(spada);
		aulaN10.addAttrezzo(pesca);
		aulaN11.addAttrezzo(marmitta);

		// il gioco comincia nell'atrio
        stanzaIniziale = atrio;  
		stanzaFinale = biblioteca;
    }
	public Stanza getStanzaFinale() {
		return this.stanzaFinale;
	}

	public Stanza getStanzaIniziale() {
		return this.stanzaIniziale;
	}
}
