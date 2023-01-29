package junitTests;

import static org.junit.jupiter.api.Assertions.*;
import controler.*;
import model.*;
import org.junit.jupiter.api.Test;

public class TestCriarAlbum {

	ControleProprietario controle = new ControleProprietario();
	
void infos() {
	
	controle.cadastrarAlbum("Qatar 2022", "Meu Album 2022");
	
}

@Test
void testeCadastrarAlbum() {
	
	infos();
	
	Album_Figurinha albumFigurinha;
	
	String cM = "Qatar 2022";
	String nA = "Meu Album 2022";
	
	controle.cadastrarAlbum(cM, nA);
	
	//Retorna falso se a lista de animais do responsável estiver vazia
	
	assertFalse(ControleProprietario.proprietario.getAlbumFigurinha().isEmpty());

}
}


