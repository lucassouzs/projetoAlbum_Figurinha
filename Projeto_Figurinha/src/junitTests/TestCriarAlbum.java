package junitTests;

import static org.junit.jupiter.api.Assertions.*;
import controler.*;
import org.junit.jupiter.api.Test;

/**
 * Classe designada para testar o metodo utilizado para criar um album e 
 * adicionar este album no ArrayList de albuns do proprietario.
 * 
 * @author Lucas Ribeiro de Souza
 * @author Lucas Victor Ferreira de Araujo
 */
public class TestCriarAlbum {

	@Test
	public void testeCadastrarAlbum() {
		ControleProprietario controle = new ControleProprietario();
		
		controle.cadastrarProprietario("Lucas", 18, "Masculino");
		controle.cadastrarAlbum("Meu Album", "Qatar 2022");
	
		boolean resultado = ControleProprietario.proprietario.getAlbumFigurinha().isEmpty();
		assertFalse(resultado);
	}
}