package model;

import java.util.ArrayList;

import javax.swing.DefaultListModel;

import controler.ControleProprietario;

/**
 * Classe que armazena as informacoes de cada album de figurinha
 * @author Lucas Ribeiro de Souza 
 * @author Lucas Victor Ferreira de Araújo
 * @since 2022
 * @version 1.0
 */
public class Album_Figurinha {
		
	public static Object albumFigurinha;
	private String nome;
	private String copaMundo;
	private ArrayList<Figurinha_FWC> figurinhaFWC;
	private ArrayList<Figurinha_Seleção> figurinhaSeleção;
		
	/**
	 * Metodo construtor  
	 * @param nome recebera o nome do album.
	 * @param copaMundo Recebera o tipo (Qatar 2022) da copa.
	 */
	public Album_Figurinha(String nome, String copaMundo) {
		this.copaMundo = copaMundo;
		this.nome = nome;
		this.figurinhaFWC = new ArrayList<>();
		this.figurinhaSeleção = new ArrayList<>();
	}
	
	/**
	 * Metodo responsavel por cadastrar uma FigurinhaSelecao.
	 * @param figurinhaSeleção1 Refere a figurinha que sera cadastrada.
	 */
	public void cadastrarFigurinha_Seleção(Figurinha_Seleção figurinhaSeleção1) {
		figurinhaSeleção.add(figurinhaSeleção1);
	}
	
	/**
	 * Metodo responsavel por excluir uma FigurinhaSelecao.
	 * @param nome Utiliza o "nome" para executar a exclusao.
	 */
	public void excluirFigurinha_Seleção(Figurinha_Seleção nome) {
		figurinhaSeleção.remove(nome);
	}
	
	/**
	 * Metodo para listar as FigurinhaSelecao.
	 * @param i Index do album no ArrayList de albuns do propietario
	 * @return
	 */
	public DefaultListModel<String> listarFigurinhas_Selecao(int i){
		DefaultListModel<String> figurinhas = new DefaultListModel<>();
		int size = ControleProprietario.proprietario.getAlbumFigurinha().get(i).getFigurinhaSeleção().size();
		for(int k = 0; k < size ; k++) {
			String jogador = ControleProprietario.proprietario.getAlbumFigurinha().get(i).getFigurinhaSeleção().get(k).getJogador();
			figurinhas.addElement(jogador);
		}
		return figurinhas;
	}
	
	/**
	 * Metodo responsavel por cadastrar uma FigurinhaFWC.
	 * @param figurinhaFWC1 Pega a figurinha criada e coloca ela na lista.
	 */
	public void cadastrarFigurinha_FWC(Figurinha_FWC figurinhaFWC1) {
		figurinhaFWC.add(figurinhaFWC1);
	}
	
	/**
	 * Metodo responsavel por excluir uma FigurinhaFWC.
	 * @param nome Utiliza o "nome" para executar a exclusao.
	 */
	public void excluirFigurinha_FWC(Figurinha_FWC nome) {
		figurinhaFWC.remove(nome);
	}
	
	/**
	 * Metodo para listar as FigurinhaFWC.
	 * @param i Index do album no ArrayList de albuns do propietario
	 * @return figurinha
	 */
	public DefaultListModel<String> listarFigurinhas_FWC(int i){
		DefaultListModel<String> figurinhas = new DefaultListModel<>();
		int size = ControleProprietario.proprietario.getAlbumFigurinha().get(i).getFigurinhaFWC().size();
		for(int k = 0; k < size ; k++) {
			String figurinha = ControleProprietario.proprietario.getAlbumFigurinha().get(i).getFigurinhaFWC().get(k).getItensLimitados();
			figurinhas.addElement(figurinha);
		}
		return figurinhas;
	}
	
	/**
	 * Metodo para buscar as figurinhas.
	 * @param nome Nome da figurinha que sera buscada
	 */
	public void buscarFigurinha(String nome) {
		for (int i = 0; i < figurinhaFWC.size(); i++) {
			if(figurinhaFWC.get(i).getItensLimitados().equals(nome)) {
				System.out.println(figurinhaFWC.get(i).getItensLimitados() + " || " 
					+ figurinhaFWC.get(i).getSigla() + " || " 
					+ figurinhaFWC.get(i).getCodigo());
			}
		}
		for (int i = 0; i < figurinhaSeleção.size(); i++) {
			if(figurinhaSeleção.get(i).getJogador().equals(nome)) {
				System.out.println(figurinhaSeleção.get(i).getJogador() + " || " 
					+ figurinhaSeleção.get(i).getSeleção() + " || " 
					+ figurinhaSeleção.get(i).getSigla() + " || " 
					+ figurinhaSeleção.get(i).getCodigo());
			}
		}
	}
	
	/**
	 * Metodo abstrado que sera implementado nas classes filhas e 
	 * servira para alterar um dos atributos das figurinhas.
	 */
	public String toString() {
		return nome;
	}
		
	public String getNome () {
		return nome;
	}
	
	public void setNome (String nome){
		this.nome = nome;
	}
	
	public String getCopaMundo () {
		return copaMundo;
	}
	
	public void setCopaMundo (String CopaMundo){
		this.copaMundo = CopaMundo;
	}
	
	public ArrayList<Figurinha_Seleção> getFigurinhaSeleção(){
		return figurinhaSeleção;
	}
	
	public void setFigurinha_Selecao(ArrayList<Figurinha_Seleção> figurinhaSeleção) {
		this.figurinhaSeleção = figurinhaSeleção;
	}
	
	public ArrayList<Figurinha_FWC> getFigurinhaFWC(){
		return figurinhaFWC;
	}
	
	public void setFigurinha_FWC(ArrayList<Figurinha_FWC> figurinhaFWC) {
		this.figurinhaFWC = figurinhaFWC;
	}
}