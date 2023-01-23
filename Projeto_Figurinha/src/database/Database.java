package database;

import java.util.ArrayList;
import java.util.List;

import controler.ControleProprietario;
import model.Figurinha_FWC;
import model.Figurinha_Seleção;

public class Database {
	private static final List<Figurinha_FWC> Figurinhas_FWC = new ArrayList<Figurinha_FWC>();
	private static final List<Figurinha_Seleção> Figurinhas_Selecao = new ArrayList<Figurinha_Seleção>();

	// Figurinhas FWC de ambos os Albuns
	
	private static Figurinha_FWC FWC00 = new Figurinha_FWC("FWC", 0, "PANINI", 0);
	private static Figurinha_FWC FWC01 = new Figurinha_FWC("FWC", 1, "FIFA", 1);
	private static Figurinha_FWC FWC02 = new Figurinha_FWC("FWC", 2, "TROFEU 1/2", 2);
	private static Figurinha_FWC FWC03 = new Figurinha_FWC("FWC", 3, "TROFEU 2/2", 3);
	private static Figurinha_FWC FWC04 = new Figurinha_FWC("FWC", 4, "MASCOTE 1/2", 3);
	
	// Figurinhas do Album do Qatar 2022
	
	private static Figurinha_Seleção QAT1 = new Figurinha_Seleção("QAT", 1, "QATAR", "EQUIPE - QATAR");
	private static Figurinha_Seleção QAT2 = new Figurinha_Seleção("QAT", 2, "QATAR", "ESCUDO - QATAR");
	private static Figurinha_Seleção QAT3 = new Figurinha_Seleção("QAT", 3, "QATAR", "SAAD AL SHEEB");
	private static Figurinha_Seleção QAT4 = new Figurinha_Seleção("QAT", 4, "QATAR", "MESHAAL BARSHAM");
	private static Figurinha_Seleção QAT5 = new Figurinha_Seleção("QAT", 5, "QATAR", "HOMAM AHMED");
	
	// Figurinhas do Album da Russia 2018

	private static Figurinha_Seleção RUS1 = new Figurinha_Seleção("RUS", 1, "RUSSIA", "ESCUDO - RUS");
	private static Figurinha_Seleção RUS2 = new Figurinha_Seleção("RUS", 2, "RUSSIA", "EQUIPE - RUS");
	private static Figurinha_Seleção RUS3 = new Figurinha_Seleção("RUS", 3, "RUSSIA", "IGOR AKINFEEV");
	private static Figurinha_Seleção RUS4 = new Figurinha_Seleção("RUS", 4, "RUSSIA", "IGOR SMOLNIKOV");
	private static Figurinha_Seleção RUS5 = new Figurinha_Seleção("RUS", 5, "RUSSIA", "VIKTOR VASIN");
	
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
	
	public static Figurinha_FWC getFWC03() {
		return FWC03;
	}
	
	public static void setFWC03(Figurinha_FWC fWC03) {
		FWC03 = fWC03;
	}
	
	public static Figurinha_Seleção getQAT1() {
		return QAT1;
	}
	
	public static void setQAT1(Figurinha_Seleção qAT1) {
		QAT1 = qAT1;
	}
	
	public static Figurinha_Seleção getQAT2() {
		return QAT2;
	}
	
	public static void setQAT2(Figurinha_Seleção qAT2) {
		QAT2 = qAT2;
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

	public static Figurinha_FWC getFWC04() {
		return FWC04;
	}

	public static void setFWC04(Figurinha_FWC fWC04) {
		FWC04 = fWC04;
	}

	public static Figurinha_Seleção getQAT5() {
		return QAT5;
	}

	public static void setQAT5(Figurinha_Seleção qAT5) {
		QAT5 = qAT5;
	}

	public static Figurinha_Seleção getRUS1() {
		return RUS1;
	}

	public static void setRUS1(Figurinha_Seleção rUS1) {
		RUS1 = rUS1;
	}

	public static Figurinha_Seleção getRUS2() {
		return RUS2;
	}

	public static void setRUS2(Figurinha_Seleção rUS2) {
		RUS2 = rUS2;
	}

	public static Figurinha_Seleção getRUS3() {
		return RUS3;
	}

	public static void setRUS3(Figurinha_Seleção rUS3) {
		RUS3 = rUS3;
	}

	public static Figurinha_Seleção getRUS4() {
		return RUS4;
	}

	public static void setRUS4(Figurinha_Seleção rUS4) {
		RUS4 = rUS4;
	}

	public static Figurinha_Seleção getRUS5() {
		return RUS5;
	}

	public static void setRUS5(Figurinha_Seleção rUS5) {
		RUS5 = rUS5;
	}
}