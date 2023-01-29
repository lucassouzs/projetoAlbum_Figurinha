package junitTests;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertTrue;
import controler.*;
import org.junit.jupiter.api.Test;

/**
 * Classe designada para testar o metodo utilizado para excluir um album da ArrayList de albuns do proprietario.
 * 
 * @author Lucas Ribeiro de Souza
 * @author Lucas Victor Ferreira de Araujo
 */
class TestExcluirAlbum {

	ControleProprietario controle = new ControleProprietario();

	void infos() {
		controle.cadastrarProprietario("Lucas", 18, "Masculino");
		controle.cadastrarAlbum("Meu Album", "Qatar 2022");
	}

	@Test
	void testeCadastrarAlbum() {
		
		infos();
		
		controle.deletarAlbum(ControleProprietario.proprietario.getAlbumFigurinha().get(0));
		
		assertTrue(ControleProprietario.proprietario.getAlbumFigurinha().isEmpty());

	}
}