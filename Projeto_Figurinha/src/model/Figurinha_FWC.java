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
	
	private String descricaoItens;
	private int nivelRaridade;
		
	// construtor
	
	public Figurinha_FWC(String sigla, int codigo, String itensLimitados, int nivelRaridade) {
		super(sigla, codigo);
		this.descricaoItens = itensLimitados;
		this.nivelRaridade = nivelRaridade;
	}
	
	//
	
	public String toString() {
		return descricaoItens;
	}
	
	// gets e sets
	
	public String getItensLimitados () {
		return descricaoItens;
	}
	
	public void setItensLimitados (String itensLimitados){
		this.descricaoItens = itensLimitados;	
	}
	
	public int getNivelRaridade() {
		return nivelRaridade;
	}
	
	public void setNivelRaridade (int nivelRaridade){
		this.nivelRaridade = nivelRaridade;
	}
	
}