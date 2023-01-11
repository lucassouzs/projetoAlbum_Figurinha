package model;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// instancias
		
		Proprietario proprietario1 = new Proprietario("Lucas Victor", 19, "Masculino");
		
		Album_Figurinha albumFigurinha = new Album_Figurinha("Meu album 2022", "Copa do Mundo 2022");
		
		Figurinha_Seleção figurinhaSeleção = new Figurinha_Seleção("JPN", 3, "Japao" ,"Shui Gonda");
		
		Figurinha_FWC figurinhaFWC = new Figurinha_FWC("FWC", 2, "Mascote", 3);
		
		// cadastros
		
		proprietario1.cadastrarAlbum_Figurinha(albumFigurinha); 
		
		albumFigurinha.cadastrarFigurinha_Seleção(figurinhaSeleção);
		
		albumFigurinha.cadastrarFigurinha_FWC(figurinhaFWC);
		
		// print
		
		System.out.println(proprietario1.getNome() + ", voce colou a figurinha: " 
		+ figurinhaSeleção.getSigla() + " " + figurinhaSeleção.getCodigo() + " " 
		+ albumFigurinha.getFigurinhaSeleção() + " e " + figurinhaFWC.getSigla() + " " 
		+ figurinhaFWC.getCodigo() + " " + albumFigurinha.getFigurinhaFWC() + ", no Album " 
		+ proprietario1.getAlbumFigurinha());
		 
	}

}
