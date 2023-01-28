package model;

import java.util.ArrayList;

import javax.swing.DefaultListModel;

import controler.ControleProprietario;

public class Proprietario {
	
	// atributos
	
	private String nome;
	private int idade;
	private String sexo;
	private ArrayList<Album_Figurinha> albumFigurinha;
	
	// construtor
	
	public Proprietario(String nome, int idade, String sexo){
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.albumFigurinha = new ArrayList<>();
	}
	
	// metodos
	
	public void cadastrarAlbum_Figurinha(Album_Figurinha album1){
		albumFigurinha.add(album1);
	}
	
	public void excluirAlbum_Figurinha(Album_Figurinha nome) {
		albumFigurinha.remove(nome);
	}
	
	public DefaultListModel<String> listarAlbum_Figurinha(){
		DefaultListModel<String> nomes = new DefaultListModel<>();
		int size = ControleProprietario.proprietario.getAlbumFigurinha().size();
		for(int i = 0; i < size ; i++) {
			String nome = ControleProprietario.proprietario.getAlbumFigurinha().get(i).getNome();
			nomes.addElement(nome);
		}
		return nomes;
	}
	
	// gets e sets 
	
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