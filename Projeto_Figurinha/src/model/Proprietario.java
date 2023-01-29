package model;

import java.util.ArrayList;

import javax.swing.DefaultListModel;

import controler.ControleProprietario;

/**
 * Classe que define o proprietario pelo album, o proprietario
 *  cadastrado controlara as outras classes.
 * @author Lucas Ribeiro de Souza 
 * @author Lucas Victor Ferreira de Araújo
 * @since 2022
 * @version 1.0
 */
public class Proprietario {
		
	private String nome;
	private int idade;
	private String sexo;
	private ArrayList<Album_Figurinha> albumFigurinha;
		
	/**
	 * Metodo construtor padrao para registrar um proprietario.
	 * @param nome String Nome do proprietario.
	 * @param idade int Idade do proprietario.
	 * @param sexo	String sexo do proprietario.
	 */
	public Proprietario(String nome, int idade, String sexo){
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.albumFigurinha = new ArrayList<>();
	}
		
	/**
	 * Metodo para cadastrar um album para um proprietario.
	 * @param album1 Album que sera cadastrado.
	 */
	public void cadastrarAlbum_Figurinha(Album_Figurinha album1){
		albumFigurinha.add(album1);
	}
	
	/**
	 * Metodo para excluir um album de um proprietario.
	 * @param nome Album que sera excluido.
	 */
	public void excluirAlbum_Figurinha(Album_Figurinha nome) {
		albumFigurinha.remove(nome);
	}
	
	/**
	 * Metodo para listar os albuns do proprietario.
	 * @return Retorna os nomes criados para os abuns.
	 */
	public DefaultListModel<String> listarAlbum_Figurinha(){
		DefaultListModel<String> nomes = new DefaultListModel<>();
		int size = ControleProprietario.proprietario.getAlbumFigurinha().size();
		for(int i = 0; i < size ; i++) {
			String nome = ControleProprietario.proprietario.getAlbumFigurinha().get(i).getNome();
			nomes.addElement(nome);
		}
		return nomes;
	}
		
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getSexo() {
		return sexo;
	}	
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public ArrayList<Album_Figurinha> getAlbumFigurinha() {
		return albumFigurinha;
	}

	public void setAlbum_Figurinhas(ArrayList<Album_Figurinha>  albumFigurinha) {
		this.albumFigurinha =  albumFigurinha;
	}
}