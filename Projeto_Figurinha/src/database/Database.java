package database;

import java.util.ArrayList;
import java.util.List;

import model.Album_Figurinha;
import model.Figurinha_FWC;
import model.Figurinha_Seleção;

/**
 * Classe responsavel por realizar o armazenamento de todo o projeto.
 * @author Lucas Ribeiro de Souza 
 * @author Lucas Victor Ferreira de Araujo
 * @since 2022
 * @version 1.0
 */
public class Database {
	private static final List<Album_Figurinha> albumFigurinha = new ArrayList<Album_Figurinha>();
	private static final List<Figurinha_FWC> Figurinhas_FWC = new ArrayList<Figurinha_FWC>();
	private static final List<Figurinha_Seleção> Figurinhas_Selecao = new ArrayList<Figurinha_Seleção>();
	
	private static Album_Figurinha album0 = new Album_Figurinha("Qatar 2022", "album0");
	private static Album_Figurinha album1 = new Album_Figurinha("Qatar 2022", "album1");
	private static Album_Figurinha album2 = new Album_Figurinha("Qatar 2022", "album2");
		
	private static Figurinha_FWC FWC00 = new Figurinha_FWC("FWC", 0, "PANINI");
	private static Figurinha_FWC FWC01 = new Figurinha_FWC("FWC", 1, "FIFA");
	private static Figurinha_FWC FWC02 = new Figurinha_FWC("FWC", 2, "TROFEU 1/2");
		
	private static Figurinha_Seleção QAT3 = new Figurinha_Seleção("BRA", 16, "BRASIL", "GABRIEL JESUS");
	private static Figurinha_Seleção QAT4 = new Figurinha_Seleção("BRA", 17, "BRASIL", "NEYMAR JR");
	private static Figurinha_Seleção QAT5 = new Figurinha_Seleção("BRA", 18, "BRASIL", "RAPHINHA");
	
	public static List<Figurinha_FWC> getFigurinhasFwc() {
		return Figurinhas_FWC;
	}
	
	public static List<Figurinha_Seleção> getFigurinhasSelecao() {
		return Figurinhas_Selecao;
	}
	
	public static Figurinha_FWC getFWC00() {
		return FWC00;
	}
	
	public static void setFWC00(Figurinha_FWC fWC00) {
		FWC00 = fWC00;
	}
	
	public static Figurinha_FWC getFWC01() {
		return FWC01;
	}
	
	public static void setFWC01(Figurinha_FWC fWC01) {
		FWC01 = fWC01;
	}
	
	public static Figurinha_FWC getFWC02() {
		return FWC02;
	}
	
	public static void setFWC02(Figurinha_FWC fWC02) {
		FWC02 = fWC02;
	}
	
	public static Figurinha_Seleção getQAT3() {
		return QAT3;
	}
	
	public static void setQAT3(Figurinha_Seleção qAT3) {
		QAT3 = qAT3;
	}
	
	public static Figurinha_Seleção getQAT4() {
		return QAT4;
	}
	
	public static void setQAT4(Figurinha_Seleção qAT4) {
		QAT4 = qAT4;
	}

	public static Figurinha_Seleção getQAT5() {
		return QAT5;
	}

	public static void setQAT5(Figurinha_Seleção qAT5) {
		QAT5 = qAT5;
	}

	public static List<Album_Figurinha> getAlbumfigurinha() {
		return albumFigurinha;
	}

	public static Album_Figurinha getAlbum0() {
		return album0;
	}

	public static void setAlbum0(Album_Figurinha album0) {
		Database.album0 = album0;
	}

	public static Album_Figurinha getAlbum1() {
		return album1;
	}

	public static void setAlbum1(Album_Figurinha album1) {
		Database.album1 = album1;
	}

	public static Album_Figurinha getAlbum2() {
		return album2;
	}

	public static void setAlbum2(Album_Figurinha album2) {
		Database.album2 = album2;
	}
}