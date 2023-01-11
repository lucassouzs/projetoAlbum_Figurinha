package controler;

import model.Proprietario;
import view.PanelMeusAlbuns;

public class ControleProprietario {
	
	public static Proprietario proprietario;
	
	public void cadastrarProprietario(String nome, int idade, String sexo) {
		
		proprietario = new Proprietario(nome, idade, sexo);
		System.out.println(proprietario.getNome());
		
		new PanelMeusAlbuns().setVisible(true);
		
	}
}
