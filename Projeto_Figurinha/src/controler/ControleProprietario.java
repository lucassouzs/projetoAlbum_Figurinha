package controler;

import javax.swing.DefaultListModel;
import model.Album_Figurinha;
import model.Figurinha_FWC;
import model.Figurinha_Seleção;
import model.Proprietario;
import view.PanelAlbumQatar;
import view.PanelEditarFigurinhaFWC;
import view.PanelEditarFigurinhaSelecao;
import view.PanelMeusAlbuns;

public class ControleProprietario {
	
	public static Proprietario proprietario;
	public static Album_Figurinha albumFigurinha;
	public static Figurinha_FWC figurinhaFWC;
	public static Figurinha_Seleção figurinhaSelecao;
	public int i;
	
	public void cadastrarProprietario(String nome, int idade, String sexo) {
		
		proprietario = new Proprietario(nome, idade, sexo);
		System.out.println("Dados do Proprietario:");
		System.out.println("Nome: " + proprietario.getNome());
		System.out.println("Idade: " + proprietario.getIdade());
		System.out.println("Sexo: " + proprietario.getSexo());
		
		new PanelMeusAlbuns().setVisible(true);
	}
	
	public void cadastrarAlbum(String copaMundo, String nome) {
		
		Album_Figurinha albumFigurinha = new Album_Figurinha(copaMundo, nome);
		proprietario.cadastrarAlbum_Figurinha(albumFigurinha);
		
		System.out.println("");
		System.out.println("Dados do Album:");
		System.out.println("Copa do mundo: " + albumFigurinha.getCopaMundo());
		System.out.println("Nome do Album: " + albumFigurinha.getNome());
	}
	
	public void cadastrarFigurinhaFWC(String sigla, int cod, String item, int i) {
		
		Figurinha_FWC figurinhaFWC = new Figurinha_FWC(sigla, cod, item);
		proprietario.getAlbumFigurinha().get(i).cadastrarFigurinha_FWC(figurinhaFWC);
		
		System.out.println("");
		System.out.println("Dados da Figurinha Fifa World Cup:");
		System.out.println("Sigla: " + figurinhaFWC.getSigla());
		System.out.println("Codigo: " + figurinhaFWC.getCodigo());
		System.out.println("Item: " + figurinhaFWC.getItensLimitados());
		
	}
	
	public void cadastrarFigurinhaSelecao(String sigla, int cod, String selecao, String jogador, int i) {
		
		Figurinha_Seleção figurinhaSelecao = new Figurinha_Seleção(sigla, cod, selecao, jogador);
		proprietario.getAlbumFigurinha().get(i).cadastrarFigurinha_Seleção(figurinhaSelecao);
		
		System.out.println("");
		System.out.println("Dados da Figurinha Selecao:");
		System.out.println("Sigla: " + figurinhaSelecao.getSigla());
		System.out.println("Codigo: " + figurinhaSelecao.getCodigo());
		System.out.println("Selecao: " + figurinhaSelecao.getSeleção());
		System.out.println("Jogador: " + figurinhaSelecao.getJogador());
		
	}
	
	public DefaultListModel<String> listarAlbum_Figurinha(){
		DefaultListModel<String> nomes = new DefaultListModel<>();
		int size = proprietario.getAlbumFigurinha().size();
		for(int i = 0; i < size ; i++) {
			String nome = proprietario.getAlbumFigurinha().get(i).getNome();
			nomes.addElement(nome);
			}
		return nomes;
	}
	
	public DefaultListModel<String> listarFigurinhas_FWC(){
		DefaultListModel<String> figurinhas = new DefaultListModel<>();
		int size = proprietario.getAlbumFigurinha().get(i).getFigurinhaFWC().size();
		for(int k = 0; k < size ; k++) {
			String figurinha = proprietario.getAlbumFigurinha().get(i).getFigurinhaFWC().get(k).getItensLimitados();
			figurinhas.addElement(figurinha);
			}
		return figurinhas;
	}
	
	public DefaultListModel<String> listarFigurinhas_Selecao(){
		DefaultListModel<String> figurinhas = new DefaultListModel<>();
		int size = proprietario.getAlbumFigurinha().get(i).getFigurinhaSeleção().size();
		for(int k = 0; k < size ; k++) {
			String jogador = proprietario.getAlbumFigurinha().get(i).getFigurinhaSeleção().get(k).getJogador();
			figurinhas.addElement(jogador);
			}
		return figurinhas;
	}
	
	public void abrirAlbum(String nome) {
		for(i = 0; i < proprietario.getAlbumFigurinha().size(); i++) {
			if(proprietario.getAlbumFigurinha().get(i).getNome().equals(nome)) {
				if(proprietario.getAlbumFigurinha().get(i).getCopaMundo() == "Qatar 2022") {
					new PanelAlbumQatar(i).setVisible(true);
				}
			}
		}
	}
	
	public void abrirFigurinhaFWC(String nome, int i) {
		for (int k = 0; k < proprietario.getAlbumFigurinha().get(i).getFigurinhaFWC().size(); k++) {
			if(proprietario.getAlbumFigurinha().get(i).getFigurinhaFWC().get(k).getItensLimitados().equals(nome)) {
				new PanelEditarFigurinhaFWC(i, k).setVisible(true);
			}
		}
	}
	
	public void abrirFigurinhaSelecao(String nome, int j) {
		for (int k = 0; k < proprietario.getAlbumFigurinha().get(i).getFigurinhaSeleção().size(); k++) {
			if(proprietario.getAlbumFigurinha().get(i).getFigurinhaSeleção().get(k).getJogador().equals(nome)) {
				new PanelEditarFigurinhaSelecao(i, k).setVisible(true);
			}
		}
	}
	
	public class ControleInformacoesPessoais {
		
		public static boolean checkIdade(String valor) {
			if(valor.matches("[0-9]+"))
				return true ;
			else
				return false ;
		}
	}
	
	public void editarAlbum(String nome, int k) {
		proprietario.getAlbumFigurinha().get(k).setNome(nome);
	}
	
	public void deletarAlbum(Album_Figurinha nome) {
		proprietario.excluirAlbum_Figurinha(nome);
	}
	
	public void excluirFigurinha_FWC(Figurinha_FWC nome, int i) {
		proprietario.getAlbumFigurinha().get(i).excluirFigurinha_FWC(nome);
	}
	
	public void excluirFigurinha_Selecao(Figurinha_Seleção nome, int i) {
		proprietario.getAlbumFigurinha().get(i).excluirFigurinha_Seleção(nome);
	}
	
	public void editarFigurinha_FWC(int posAlbum, int posFig, int codigo, String item) {
		proprietario.getAlbumFigurinha().get(posAlbum).getFigurinhaFWC().get(posFig).atualizar(codigo);
		proprietario.getAlbumFigurinha().get(posAlbum).getFigurinhaFWC().get(posFig).setItensLimitados(item);;
	}
	
	public void editarFigurinha_Selecao(int posAlbum, int posFig, String sigla, int codigo, String selecao, String jogador) {
		proprietario.getAlbumFigurinha().get(posAlbum).getFigurinhaSeleção().get(posFig).setSigla(sigla);;
		proprietario.getAlbumFigurinha().get(posAlbum).getFigurinhaSeleção().get(posFig).atualizarSelecao(codigo);
		proprietario.getAlbumFigurinha().get(posAlbum).getFigurinhaSeleção().get(posFig).setSeleção(selecao);;
		proprietario.getAlbumFigurinha().get(posAlbum).getFigurinhaSeleção().get(posFig).setJogador(jogador);;
	}
}
