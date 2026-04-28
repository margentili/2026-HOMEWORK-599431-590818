package it.uniroma3.diadia.comandi;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.IO;

public class ComandoAiuto implements Comando {
	
	static final public String[] elencoComandi = {"vai", "aiuto", "fine","prendi","posa","guarda"};
	private IO io;
	private final static String NOME = "aiuto";
	
	@Override
	public void esegui(Partita partita) {
		for(int i=0;i<elencoComandi.length;i++)
			io.mostraMessaggio(elencoComandi[i]+" ");
		io.mostraMessaggio("");
	}
	
	@Override
	public void setParametro(String parametro) {
		
	}
	
	@Override
	public String getParametro() {
		return null;
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
