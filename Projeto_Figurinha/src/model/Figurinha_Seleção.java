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
	
	// metodos
	
	public String toString() {
		return nomesjogador;
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
