package controler;

import model.Proprietario;
import view.PanelCriarAlbum;
import view.PanelMenu;
import view.PanelMeusAlbuns;

public class ControleProprietario {
	
	public static Proprietario proprietario;
	
	public void cadastrarProprietario(String nome, int idade, String sexo) {
		
		proprietario = new Proprietario(nome, idade, sexo);
		System.out.println("Dados do Proprietario");
		System.out.println("Nome: " + proprietario.getNome());
		System.out.println("Idade: " + proprietario.getIdade());
		System.out.println("Sexo: " + proprietario.getSexo());
		
		new PanelMeusAlbuns().setVisible(true);
	}
	
	public void controlePerfil() {
		new PanelMenu().setVisible(true);
	}
	
	public void controleCriarAlbum() {
		new PanelCriarAlbum().setVisible(true);
	}
	
	public void controleRetornar() {
		new PanelMeusAlbuns().setVisible(true);
	}
}
