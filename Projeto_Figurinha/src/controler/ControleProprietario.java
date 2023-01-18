package controler;

import javax.swing.DefaultListModel;
import model.Album_Figurinha;
import model.Proprietario;
import view.PanelAlbumQatar;
import view.PanelAlbumRussia;
import view.PanelCriarAlbum;
import view.PanelMenu;
import view.PanelMeusAlbuns;

public class ControleProprietario {
	
	public static Proprietario proprietario;
	public static Album_Figurinha albumFigurinha;
	public int i;
	
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
			String nome = proprietario.getAlbumFigurinha().get(i).getNome();
			nomes.addElement(nome);
			}
		return nomes;
	}
	
	public void abrirAlbum(String nome) {
		for(i = 0; i < proprietario.getAlbumFigurinha().size(); i++) {
			if(proprietario.getAlbumFigurinha().get(i).getNome().equals(nome)) {
				if(proprietario.getAlbumFigurinha().get(i).getCopaMundo() == "Qatar 2022") {
					new PanelAlbumQatar().setVisible(true);
				} else if (proprietario.getAlbumFigurinha().get(i).getCopaMundo() == "Russia 2018") {
					new PanelAlbumRussia().setVisible(true);
				}
			}
		}
	}
	
	public class ControleInformacoesPessoais {
		
		public static boolean checkIdade(String valor) {
			if(valor.matches("[0-9]+"))
				return true ;
			else
				return false ;
		}
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
