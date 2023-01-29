package junitTests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import controler.ControleProprietario;

/**
 * Classe designada para testar o metodo utilzado para editar e atualizar o nome do album.
 * 
 * @author Lucas Ribeiro de Souza
 * @author Lucas Victor Ferreira de Araujo
 */
class TestAtualizarAlbum {

	ControleProprietario controle = new ControleProprietario();

	void infos() {
	
		controle.cadastrarProprietario("Lucas", 18, "Masculino");
				
		String Nome = "Meu Album";
		String CopaMundo = "Qatar 2022";
		
		controle.cadastrarAlbum(Nome, CopaMundo);	
	}

	@Test
	void testeCadastrarAlbum() {
		
		infos();
		
		controle.editarAlbum("Nome editado", 0);
		
		String v = "Nome editado";
		String r = ControleProprietario.proprietario.getAlbumFigurinha().get(0).getNome();
		
		assertEquals(v, r);
	}

}