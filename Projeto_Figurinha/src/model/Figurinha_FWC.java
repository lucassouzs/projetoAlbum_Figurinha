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
		
	// construtor
	
	public Figurinha_FWC(String sigla, int codigo, String itensLimitados) {
		super(sigla, codigo);
		this.descricaoItens = itensLimitados;
	}
	
	public String toString() {
		String cod = Integer.toString(getCodigo());
		return cod;
	}
	
	public void atualizar(int c) {
		setCodigo(c);
	}
	
	// gets e sets
	
	public String getItensLimitados () {
		return descricaoItens;
	}
	
	public void setItensLimitados (String itensLimitados){
		this.descricaoItens = itensLimitados;	
	}
}