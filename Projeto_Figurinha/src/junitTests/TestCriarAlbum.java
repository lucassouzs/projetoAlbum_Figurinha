package junitTests;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import controler.*;
import database.Database;
import model.*;
import org.junit.jupiter.api.Test;

public class TestCriarAlbum {

	public void cadastrarFigurinha_Seleção() {
		Figurinha_Seleção figurinhaSelecao = new Figurinha_Seleção("Bra", 0, "Brasil", "Neymar");
		
		Database.getFigurinhasSelecao().add(figurinhaSelecao);
		Database.setQAT3(figurinhaSelecao);
		
	}

@Test
public void testeCadastrarAlbum() {
	ControleProprietario controler= new ControleProprietario();
	controler.cadastrarProprietario("Lucas", 18, "Masculino");
	controler.cadastrarAlbum("Qatar", "Brasa");
	
	boolean resultado= controler.proprietario.getAlbumFigurinha().isEmpty();
	assertFalse(resultado);

	
	
	
	
	
    
	
	
	

}
}


