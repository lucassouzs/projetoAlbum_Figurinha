package projeto_figurinha;
import java.util.ArrayList;

public class Album_Figurinha {
	private String nome;
	private String copaMundo;
	private ArrayList<Figurinhas_FWC> figurinhasFWC;
	private ArrayList<Figurinhas_Seleção> figurinhasSeleção;
	
	//Metodos
	
	public String getNome () {
		return nome;
	}
	public void setNome (){
		this.nome = nome;
	}
	public String getCopaMundo () {
		return copaMundo;
	}
	public void setCopaMundo (){
		this.copaMundo = copaMundo;
	}
}
