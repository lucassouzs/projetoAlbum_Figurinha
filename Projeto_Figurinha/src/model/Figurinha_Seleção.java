package model;

public class Figurinha_Seleção extends Figurinha{
	
	//atributos
	
	private String seleção;
	private String jogador;
	
	// construtor
	
	public Figurinha_Seleção(String sigla, int codigo, String seleção, String jogador) {
		super(sigla, codigo);
		this.seleção = seleção;
		this.jogador = jogador;
	}
	
	// metodos
	
	public String toString() {
		return jogador;
	}
	
	//gets e sets
	
	public String getSeleção () {
		return seleção;
	}
	
	public void setSeleção (String seleção){
		this.seleção = seleção;
	}
	
	public String getJogador () {
		return jogador;
	}
	
	public void setJogador (String jogador){
		this.jogador = jogador;
	}
	
}
