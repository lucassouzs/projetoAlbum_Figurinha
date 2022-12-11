package model;

import java.util.ArrayList;

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