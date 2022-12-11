package model;

public abstract class Figurinha {
	
	// atributos
	
	private String sigla;
	private int codigo;
	
	// construtor
	
	public Figurinha(String sigla, int codigo) {
		this.sigla = sigla;
		this.codigo = codigo;
	}
	
	// gets sets
	
	public String getSigla() {
		return sigla;
	}
	
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
}