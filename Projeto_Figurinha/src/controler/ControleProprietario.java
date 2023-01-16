package controler;

import model.Album_Figurinha;
import model.Proprietario;
import view.PanelCriarAlbum;
import view.PanelMenu;
import view.PanelMeusAlbuns;

public class ControleProprietario {
	
	public static Proprietario proprietario;
	public static Album_Figurinha albumFigurinha;
	
	public void cadastrarProprietario(String nome, int idade, String sexo) {
		
		proprietario = new Proprietario(nome, idade, sexo);
		System.out.println("Dados do Proprietario:");
		System.out.println("Nome: " + proprietario.getNome());
		System.out.println("Idade: " + proprietario.getIdade());
		System.out.println("Sexo: " + proprietario.getSexo());
		
		new PanelMeusAlbuns().setVisible(true);
	}
	
	public void cadastrarAlbum(String copaMundo, String nome) {
		
		Album_Figurinha albumFigurinha = new Album_Figurinha(copaMundo, nome);
		proprietario.cadastrarAlbum_Figurinha(albumFigurinha);
		System.out.println("");
		System.out.println("Dados do Album:");
		System.out.println("Copa do mundo: " + albumFigurinha.getCopaMundo());
		System.out.println("Nome do Album: " + albumFigurinha.getNome());
	}
	
	public void controlePerfil() {
		new PanelMenu().setVisible(true);
	}
	
	public void controleCriarAlbum() {
		new PanelCriarAlbum().setVisible(true);
	}
}
