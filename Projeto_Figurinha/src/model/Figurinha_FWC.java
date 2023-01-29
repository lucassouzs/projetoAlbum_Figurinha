package model;

/**
 * Classe herdeira de {@link model.Figurinha} que armazena as informacoes
 * de uma figurinha FWC.
 * @author Lucas Ribeiro de Souza 
 * @author Lucas Victor Ferreira de Araújo
 * @since 2022
 * @version 1.0
 */
public class Figurinha_FWC extends Figurinha {
		
	private String descricaoItens;
		
	/**
	 * Metodo construtor no qual recebe os metodos que 
	 * serao utilizados na classe. 
	 * @param sigla String Recebe o valor da sigla.
	 * @param codigo int Recebe o valor  do codigo. 
	 * @param itensLimitados String Recebe o valor do itensLimitados.
	 */
	public Figurinha_FWC(String sigla, int codigo, String itensLimitados) {
		super(sigla, codigo);
		this.descricaoItens = itensLimitados;
	}
	
	/**
	 * Metodo abstrado que sera implementado nas classes filhas e 
	 * servira para alterar um dos atributos do codigo.
	 */
	public String toString() {
		String cod = Integer.toString(getCodigo());
		return cod;
	}
	
	/**
	 * Metodo herdeiro de {@link model.Figurinha}, atualiza o codigo da figurinha FWC.
	 * @param c int Valor que sera setado no codigo da figurinha FWC.
	 */
	public void atualizarFWC(int c) {
		setCodigo(c);
	}
		
	public String getItensLimitados () {
		return descricaoItens;
	}
	
	public void setItensLimitados (String itensLimitados){
		this.descricaoItens = itensLimitados;	
	}
}