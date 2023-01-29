package model;

/**
 * Classe armazena as informacoes das figurinhas.
 * @author Lucas Ribeiro de Souza 
 * @author Lucas Victor Ferreira de Araujo
 * @since 2022
 * @version 1.0
 */
public abstract class Figurinha {
		
	private String sigla;
	private int codigo;
	
	/**
	 * Metodo construtor no qual recebe os metodos que 
	 * serao utilizados na classe.
	 * @param sigla String Recebe o valor da sigla.
	 * @param codigo int Recebe o valor do codigo.
	 */
	public Figurinha(String sigla, int codigo) {
		this.sigla = sigla;
		this.codigo = codigo;
	}
	
	/**
	 * Metodo toStirng que retorna a sigla da figurinha
	 */
	public abstract String toString();
	
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