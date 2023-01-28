	package model;

public class Figurinha_Seleção extends Figurinha{
	
	//atributos
	
	private String seleçãoCopa;
	private String nomesjogador;
	
	// construtor
	
	public Figurinha_Seleção(String sigla, int codigo, String seleção, String jogador) {
		super(sigla, codigo);
		this.seleçãoCopa = seleção;
		this.nomesjogador = jogador;
	}
	
	public void atualizarSelecao(int b) {
		setCodigo(b);
	}
	
	public String toString() {
		String codS = Integer.toString(getCodigo());
		return codS;
	}
	
	//gets e sets
	
	public String getSeleção () {
		return seleçãoCopa;
	}
	
	public void setSeleção (String seleção){
		this.seleçãoCopa = seleção;
	}
	
	public String getJogador () {
		return nomesjogador;
	}
	
	public void setJogador (String jogador){
		this.nomesjogador = jogador;
	}
}
