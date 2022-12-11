package model;

/*Fifa World Cup (FWC):
- Fifa
- Trofeu
- Bola
- Mascote
- Estadio
- Legends
 */

public class Figurinha_FWC extends Figurinha {
	
	// atributos
	
	private String itensLimitados;
	private int nivelRaridade;
		
	// construtor
	
	public Figurinha_FWC(String sigla, int codigo, String itensLimitados, int nivelRaridade) {
		super(sigla, codigo);
		this.itensLimitados = itensLimitados;
		this.nivelRaridade = nivelRaridade;
	}
	
	//
	
	public String toString() {
		return itensLimitados;
	}
	
	// gets e sets
	
	public String getItensLimitados () {
		return itensLimitados;
	}
	
	public void setItensLimitados (String itensLimitados){
		this.itensLimitados = itensLimitados;	
	}
	
	public int getNivelRaridade() {
		return nivelRaridade;
	}
	
	public void setNivelRaridade (int nivelRaridade){
		this.nivelRaridade = nivelRaridade;
	}
	
}