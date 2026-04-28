package it.uniroma3.diadia.ambienti;

public class StanzaBuia extends Stanza{
	
	
	private String attrezzoLuminoso;
	
	public StanzaBuia(String nome,String attrezzoLuminoso) {
		super(nome);
		this.attrezzoLuminoso = attrezzoLuminoso;
	}
	
	
	@Override
	public String getDescrizione() {
		String buio = "\nQui c'è buio pesto..., servirebbe qualcosa per vedere meglio...";
		if(!this.hasAttrezzo(attrezzoLuminoso))
			return super.getDescrizione() + buio;
		return super.getDescrizione();
	}
	
	
	
	
}
