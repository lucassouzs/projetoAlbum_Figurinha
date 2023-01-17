package database;

import java.util.ArrayList;
import java.util.List;
import model.Figurinha_FWC;
import model.Figurinha_Seleção;

public class Database {
	private static final List<Figurinha_FWC> Figurinhas_FWC = new ArrayList<Figurinha_FWC>();
	private static final List<Figurinha_Seleção> Figurinhas_Selecao = new ArrayList<Figurinha_Seleção>();

	private static Figurinha_FWC FWC00 = new Figurinha_FWC("FWC", 00, "PAINI", 0);
	private static Figurinha_FWC FWC01 = new Figurinha_FWC("FWC", 01, "FIFA", 1);
	private static Figurinha_FWC FWC02 = new Figurinha_FWC("FWC", 02, "MASCOTE1", 2);
	private static Figurinha_FWC FWC03 = new Figurinha_FWC("FWC", 03, "MASCOTE2", 3);
	
	private static Figurinha_Seleção QAT1 = new Figurinha_Seleção("QAT", 1, "QATAR", "POSE");
	private static Figurinha_Seleção QAT2 = new Figurinha_Seleção("QAT", 2, "QATAR", "ESCUDO");
	private static Figurinha_Seleção QAT3 = new Figurinha_Seleção("QAT", 3, "QATAR", "SAAD AL SHEEB");
	private static Figurinha_Seleção QAT4 = new Figurinha_Seleção("QAT", 4, "QATAR", "MESHAAL BARSHAM");
	
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
}