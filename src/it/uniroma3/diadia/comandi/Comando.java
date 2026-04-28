package it.uniroma3.diadia.comandi;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.IO;



public interface Comando {


	/*
    private String nome;
    private String parametro;

    public Comando(String istruzione) {
		Scanner scannerDiParole = new Scanner(istruzione);

		// prima parola: nome del comando
		if (scannerDiParole.hasNext())
			this.nome = scannerDiParole.next(); 

	// seconda parola: eventuale parametro
		if (scannerDiParole.hasNext())
			this.parametro = scannerDiParole.next();
    }

    public String getNome() {
        return this.nome;
   }

public String getParametro() {
return this.parametro;
}

    public boolean sconosciuto() {
        return (this.nome == null);
    }
	 */
	
	
	
	
	/**
	 * esecuzione del comando
	 * @param partita
	 */	
	public void esegui(Partita partita);

	/**
	 * set parametro del comando
	 * @param parametro
	 */
	public void setParametro(String parametro);

	String getParametro();

	public void setIo(IO io);

	public String getNome();
}