package model;

import java.util.ArrayList;

public class Album_Figurinha {
	
	// atributos
	
	private String nome;
	private String copaMundo;
	private ArrayList<Figurinha_FWC> figurinhaFWC;
	private ArrayList<Figurinha_Seleção> figurinhaSeleção;
	
	// construtor
	
	public Album_Figurinha(String nome, String copaMundo) {
		this.nome = nome;
		this.copaMundo = copaMundo;
		this.figurinhaFWC = new ArrayList<>();
		this.figurinhaSeleção = new ArrayList<>();
	}
	
	// metodos
	
	public void cadastrarFigurinha_Seleção(Figurinha_Seleção figurinhaSeleção1) {
		figurinhaSeleção.add(figurinhaSeleção1);
	}
	
	public void cadastrarFigurinha_FWC(Figurinha_FWC figurinhaFWC1) {
		figurinhaFWC.add(figurinhaFWC1);
	}
	
	public String toString() {
		return nome;
	}
	
	// gets e sets
	
	public String getNome () {
		return nome;
	}
	
	public void setNome (String nome){
		this.nome = nome;
	}
	
	public String getCopaMundo () {
		return copaMundo;
	}
	
	public void setCopaMundo (String copaMundo){
		this.copaMundo = copaMundo;
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