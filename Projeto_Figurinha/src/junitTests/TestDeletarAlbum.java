package junitTests;

import static org.junit.jupiter.api.Assertions.*;
import controler.*;
import org.junit.jupiter.api.Test;

/**
 * Classe designada para testar o metodo utilizado para deletar um album da ArrayList de albuns do proprietario.
 * @author Lucas Ribeiro de Souza
 * @author Lucas Victor Ferreira de Araujo
 */
public class TestDeletarAlbum {
	
	/**
	 * Metodo para testar se o album cadastrado esta sendo deletado ou nao
	 */
	@Test
	public void testeCadastrarAlbum() {
		ControleProprietario controle = new ControleProprietario();
		
		controle.cadastrarProprietario("Lucas", 18, "Masculino");
		controle.cadastrarAlbum("Meu Album", "Qatar 2022");
		
		controle.deletarAlbum(ControleProprietario.proprietario.getAlbumFigurinha().get(0));
		
		assertTrue(ControleProprietario.proprietario.getAlbumFigurinha().isEmpty());
	}
}