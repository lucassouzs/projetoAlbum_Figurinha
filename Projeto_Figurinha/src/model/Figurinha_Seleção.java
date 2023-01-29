package model;

/**
 * Classe herdeira de {@link model.Figurinha} que armazena as informacoes
 * de uma figurinha Selecao.
 * @author Lucas Ribeiro de Souza 
 * @author Lucas Victor Ferreira de Araújo
 * @since 2022
 * @version 1.0
 */
public class Figurinha_Seleção extends Figurinha{
		
	private String seleçãoCopa;
	private String nomesjogador;
		
	/**
	 * Metodo construtor no qual recebe os metodos que 
	 * serao utilizados na classe.
	 * @param sigla	String Recebe o valor da sigla.
	 * @param codigo int Recebe o valor do codigo.
	 * @param seleção String Recebe o valor da selecao.
	 * @param jogador String Recebe o valor do jogador.
	 */
	public Figurinha_Seleção(String sigla, int codigo, String seleção, String jogador) {
		super(sigla, codigo);
		this.seleçãoCopa = seleção;
		this.nomesjogador = jogador;
	}
	
	/**
	 * * Metodo herdeiro de {@link model.Figurinha}, atualiza o codigo da figurinha Selecao.
	 * @param b	int Valor que sera setado no codigo da figurinha FWC.
	 */
	public void atualizarSelecao(int b) {
		setCodigo(b);
	}
	
	/**
	 * Metodo abstrado que sera implementado nas classes filhas e 
	 * servira para alterar um dos atributos do codigo.
	 */
	public String toString() {
		String codS = Integer.toString(getCodigo());
		return codS;
	}
		
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
