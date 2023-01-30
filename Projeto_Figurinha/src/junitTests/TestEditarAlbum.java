package junitTests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import controler.ControleProprietario;

/**
 * Classe designada para testar o metodo utilzado para editar e atualizar o nome do album.
 * @author Lucas Ribeiro de Souza
 * @author Lucas Victor Ferreira de Araujo
 */
class TestEditarAlbum {

	/**
	 * Metodo para editar o nome do album cadastrado 
	 */
	@Test
	public void testeCadastrarAlbum() {
		ControleProprietario controle = new ControleProprietario();
		
		controle.cadastrarProprietario("Lucas", 18, "Masculino");
		controle.cadastrarAlbum("Meu Album", "Qatar 2022");	
		
		controle.editarAlbum("Nome editado", 0);
		
		String v = "Nome editado";
		String r = ControleProprietario.proprietario.getAlbumFigurinha().get(0).getNome();
		
		assertEquals(v, r);
	}
}