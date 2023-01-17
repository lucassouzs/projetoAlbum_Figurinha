package controler;

import javax.swing.DefaultListModel;

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
	
	public DefaultListModel<String> listarAlbum_Figurinha(){
		DefaultListModel<String> nomes = new DefaultListModel<>();
		int size = proprietario.getAlbumFigurinha().size();
		
		for(int i = 0; i < size ; i++) {
			String copaMundo = proprietario.getAlbumFigurinha().get(i).getCopaMundo();
			String nome = proprietario.getAlbumFigurinha().get(i).getNome();
			nomes.addElement("Nome do Album: " + nome + "   |   Copa do Mundo: " + copaMundo);
			}
		return nomes;
	}
	
	public void controlePerfil() {
		new PanelMenu().setVisible(true);
	}
	
	public void controleCriarAlbum() {
		new PanelCriarAlbum().setVisible(true);
	}
	
	public void voltarMeusAlbuns() {
		new PanelMeusAlbuns().setVisible(true);
	}
}
