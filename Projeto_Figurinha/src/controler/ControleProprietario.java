package controler;

import javax.swing.DefaultListModel;
import model.Album_Figurinha;
import model.Figurinha_FWC;
import model.Figurinha_Seleção;
import model.Proprietario;
import view.PanelAlbumQatar;
import view.PanelEditarFigurinhaFWC;
import view.PanelEditarFigurinhaSelecao;

/**
 * Classe intermediaria que servira para ligar as telas disponiveis no 
 * package view com as classes disponiveis na package controller.
 * @author Lucas Ribeiro de Souza 
 * @author Lucas Victor Ferreira de Araujo
 * @since 2022
 * @version 1.0
 */
public class ControleProprietario {
	
	public static Proprietario proprietario;
	public Album_Figurinha albumFigurinha;
	public static Figurinha_FWC figurinhaFWC;
	public static Figurinha_Seleção figurinhaSelecao;
	public static int i;
	
	/**
	 * Metodo responsavel por receber a entrada de dados do usuario na view e instanciar um objeto do tipo Proprietario.
	 * @param nome Nome do proprietario.
	 * @param idade Idade do proprietario.
	 * @param sexo Sexo do proprietario.
	 */
	public void cadastrarProprietario(String nome, int idade, String sexo) {
		proprietario = new Proprietario(nome, idade, sexo);
		System.out.println("Dados do Proprietario: ");
		System.out.println("Nome: " + proprietario.getNome());
		System.out.println("Idade: " + proprietario.getIdade());
		System.out.println("Sexo: " + proprietario.getSexo());
	}
	
	/**
	 * Metodo responsavel por pre cadastrar dados pro usuario.
	 */
	public void preCadastroObjetos() {
		cadastrarAlbum("album0", "Qatar 2022");
		cadastrarAlbum("album1", "Qatar 2022");
		cadastrarAlbum("album2", "Qatar 2022");
		
		cadastrarFigurinhaFWC("FWC", 0, "PANINI", 0);
		cadastrarFigurinhaFWC("FWC", 1, "FIFA", 1);
		cadastrarFigurinhaFWC("FWC", 2, "TROFEU 1/2", 2);
		
		cadastrarFigurinhaSelecao("BRA", 16, "BRASIL", "GABRIEL JESUS", 0);
		cadastrarFigurinhaSelecao("BRA", 17, "BRASIL", "NEYMAR JR", 1);
		cadastrarFigurinhaSelecao("BRA", 18, "BRASIL", "RAPHINHA", 2);
	}
	
	/**
	 * Metodo responsavel por receber a entrada de dados do usuario na view e instanciar um objeto do tipo Album.
	 * @param copaMundo Copa do mundo do album.
	 * @param nome Nome do album.
	 */
	public void cadastrarAlbum(String copaMundo, String nome) {
		Album_Figurinha albumFigurinha = new Album_Figurinha(copaMundo, nome);
		proprietario.cadastrarAlbum_Figurinha(albumFigurinha);
		System.out.println("");
		System.out.println("Dados do Album:");
		System.out.println("Copa do mundo: " + albumFigurinha.getCopaMundo());
		System.out.println("Nome do Album: " + albumFigurinha.getNome());
	}
	
	/**
	 * Metodo responsavel por gerar um DefaultListModel com os elementos que estao no ArrayList de album do proprietario.
	 * @return Nomes dos albuns cadastrados.
	 */
	public DefaultListModel<String> listarAlbum_Figurinha(){
		DefaultListModel<String> nomes = new DefaultListModel<>();
		int size = proprietario.getAlbumFigurinha().size();
		for(int i = 0; i < size ; i++) {
			String nome = proprietario.getAlbumFigurinha().get(i).getNome();
			nomes.addElement(nome);
		}
		return nomes;
	}
	
	/**
	 * Metodo responsavel por abrir um album na ArrayList de albuns do proprietario.
	 * @param nome Nome do album que deseja abrir.
	 */
	public void abrirAlbum(String nome) {
		for(i = 0; i < proprietario.getAlbumFigurinha().size(); i++) {
			if(proprietario.getAlbumFigurinha().get(i).getNome().equals(nome)) {
				new PanelAlbumQatar(i).setVisible(true);
			}
		}
	}
	
	/**
	 * Metodo responsavel por editar o valor dos atributos de um objeto Album.
	 * @param nome Nome do album.
	 * @param i Index do album no ArrayList de albuns do proprietario.
	 */
	public void editarAlbum(String nome, int i) {
		proprietario.getAlbumFigurinha().get(i).setNome(nome);
		System.out.println("");
		System.out.println("Novo nome: " + nome);
	}
	
	/**
	 * Metodo responsavel por dar funcionalidade ao botao de excluir um album.
	 * @param nome Nome do album.
	 */
	public void deletarAlbum(Album_Figurinha nome) {
		proprietario.excluirAlbum_Figurinha(nome);
	}
		
	/**
	 * Metodo responsavel por receber a entrada de dados do usuario na view e instanciar um objeto do tipo FigurinhaFWC.
	 * @param sigla Sigla da FigurinhaFWC.
	 * @param cod Codigo da FigurinhaFWC.
	 * @param item Descricao do item presente na FigurinhaFWC.
	 * @param i Index do album no ArrayList de albuns do proprietario.
	 */
	public void cadastrarFigurinhaFWC(String sigla, int cod, String item, int i) {
		Figurinha_FWC figurinhaFWC = new Figurinha_FWC(sigla, cod, item);
		proprietario.getAlbumFigurinha().get(i).getFigurinhaFWC().add(figurinhaFWC);
		System.out.println("");
		System.out.println("Dados da Figurinha Fifa World Cup:");
		System.out.println("Sigla: " + figurinhaFWC.getSigla());
		System.out.println("Codigo: " + figurinhaFWC.getCodigo());
		System.out.println("Item: " + figurinhaFWC.getItensLimitados());
	}
	
	/**
	 * Metodo responsavel por gerar um DefaultListModel com os elementos que estao 
	 * no ArrayList de FiguinhaFWC do album do proprietario.
	 * @param i Index do album no ArrayList de albuns do proprietario.
	 * @return Descricao do item presente na FigurinhaFWC.
	 */
	public DefaultListModel<String> listarFigurinhas_FWC(int i){
		DefaultListModel<String> figurinhas = new DefaultListModel<>();
		int size = proprietario.getAlbumFigurinha().get(i).getFigurinhaFWC().size();
		for(int k = 0; k < size ; k++) {
			String figurinha = proprietario.getAlbumFigurinha().get(i).getFigurinhaFWC().get(k).getItensLimitados();
			figurinhas.addElement(figurinha);
		}
		return figurinhas;
	}
	
	/**
	 * Metodo responsavel por abrir uma FigurinhaFWC na ArrayList de FigurinhaFWC no album do proprietario.
	 * @param nome Nome da FigurinhaFWC.
	 * @param i Index do album no ArrayList de albuns do proprietario.
	 */
	public void abrirFigurinhaFWC(String nome, int i) {
		for (int k = 0; k < proprietario.getAlbumFigurinha().get(i).getFigurinhaFWC().size(); k++) {
			if(proprietario.getAlbumFigurinha().get(i).getFigurinhaFWC().get(k).getItensLimitados().equals(nome)) {
				new PanelEditarFigurinhaFWC(i, k).setVisible(true);
			}
		}
	}
	
	/**
	 * Metodo responsavel por editar o valor dos atributos de um objeto FigurinhaFWC.
	 * @param codigo Codigo da FigurinhaFWC.
	 * @param item Descricao do item presente na FigurinhaFWC.
	 */
	public void editarFigurinha_FWC(int posAlbum, int posFig, int codigo, String item) {
		proprietario.getAlbumFigurinha().get(posAlbum).getFigurinhaFWC().get(posFig).atualizarFWC(codigo);
		proprietario.getAlbumFigurinha().get(posAlbum).getFigurinhaFWC().get(posFig).setItensLimitados(item);;
	}
	
	/**
	 * Metodo responsavel por dar funcionalidade ao botao de excluir uma FigurinhaFWC.
	 * @param nome Nome da FigurinhaFWC.
	 * @param i Index do album no ArrayList de albuns do proprietario.
	 */
	public void excluirFigurinha_FWC(Figurinha_FWC nome, int i) {
		proprietario.getAlbumFigurinha().get(i).excluirFigurinha_FWC(nome);
	}
	
	/**
	 * Metodo responsavel por receber a entrada de dados do usuario na view e instanciar um objeto do tipo FigurinhaSelecao.
	 * @param sigla Sigla da FiguinhaSelecao.
	 * @param cod Codigo da FiguinhaSelecao.
	 * @param selecao Selecao da FiguinhaSelecao.
	 * @param jogador Jogador da FiguinhaSelecao.
	 * @param i Index do album no ArrayList de albuns do proprietario.
	 */
	public void cadastrarFigurinhaSelecao(String sigla, int cod, String selecao, String jogador, int i) {
		Figurinha_Seleção figurinhaSelecao = new Figurinha_Seleção(sigla, cod, selecao, jogador);
		proprietario.getAlbumFigurinha().get(i).getFigurinhaSeleção().add(figurinhaSelecao);
		System.out.println("");
		System.out.println("Dados da Figurinha Selecao:");
		System.out.println("Sigla: " + figurinhaSelecao.getSigla());
		System.out.println("Codigo: " + figurinhaSelecao.getCodigo());
		System.out.println("Selecao: " + figurinhaSelecao.getSeleção());
		System.out.println("Jogador: " + figurinhaSelecao.getJogador());
	}
	
	/**
	 * Metodo responsavel por gerar um DefaultListModel com os elementos que estao 
	 * no ArrayList de FiguinhaSelecao do album do proprietario.
	 * @param i Index do album no ArrayList de albuns do proprietario.
	 * @return Jogador da FigurinhaSelecao.
	 */
	public DefaultListModel<String> listarFigurinhas_Selecao(int i){
		DefaultListModel<String> figurinhas = new DefaultListModel<>();
		int size = proprietario.getAlbumFigurinha().get(i).getFigurinhaSeleção().size();
		for(int k = 0; k < size ; k++) {
			String jogador = proprietario.getAlbumFigurinha().get(i).getFigurinhaSeleção().get(k).getJogador();
			figurinhas.addElement(jogador);
		}
		return figurinhas;
	}
	
	/**
	 * Metodo responsavel por abrir uma FigurinhaSelecao na ArrayList de FigurinhaSelecao no album do proprietario.
	 * @param nome Nome da FigurinhaSelecao.
	 * @param i Index do album no ArrayList de albuns do proprietario.
	 */
	public void abrirFigurinhaSelecao(String nome, int i) {
		for (int k = 0; k < proprietario.getAlbumFigurinha().get(i).getFigurinhaSeleção().size(); k++) {
			if(proprietario.getAlbumFigurinha().get(i).getFigurinhaSeleção().get(k).getJogador().equals(nome)) {
				new PanelEditarFigurinhaSelecao(i, k).setVisible(true);
			}
		}
	}
	
	/**
	 * Metodo responsavel por editar o valor dos atributos de um objeto FigurinhaSelecao.
	 * @param sigla Sigla da FigurinhaSelecao.
	 * @param codigo Codigo da FigurinhaSelecao.
	 * @param selecao Selecao da FigurinhaSelecao.
	 * @param jogador Jogador da FigurinhaSelecao.
	 */
	public void editarFigurinha_Selecao(int posAlbum, int posFig, String sigla, int codigo, String selecao, String jogador) {
		proprietario.getAlbumFigurinha().get(posAlbum).getFigurinhaSeleção().get(posFig).setSigla(sigla);;
		proprietario.getAlbumFigurinha().get(posAlbum).getFigurinhaSeleção().get(posFig).atualizarSelecao(codigo);
		proprietario.getAlbumFigurinha().get(posAlbum).getFigurinhaSeleção().get(posFig).setSeleção(selecao);;
		proprietario.getAlbumFigurinha().get(posAlbum).getFigurinhaSeleção().get(posFig).setJogador(jogador);;
	}
	
	/**
	 * Metodo responsavel por dar funcionalidade ao botao de excluir uma FigurinhaSelecao.
	 * @param nome Nome da FigurinhaSelecao.
	 * @param i Index do album no ArrayList de albuns do proprietario.
	 */
	public void excluirFigurinha_Selecao(Figurinha_Seleção nome, int i) {
		proprietario.getAlbumFigurinha().get(i).excluirFigurinha_Seleção(nome);
	}
		
	/**
	 * Metodo responsavel por buscar uma Figurinha na ArrayList de FigurinhaFWC e FigurinhaSelecao no album do proprietario.
	 * @param string Nome da FigurinhaFWC e FiguinhaSelecao pesquisado.
	 * @param i Index do album no ArrayList de albuns do proprietario.
	 * @return Descricao do item na FigurinhaFWC e Jogador na FigurinhaSelecao.
	 */
	public boolean buscarFigurinha(String string, int i) {
		for (int k = 0; k < proprietario.getAlbumFigurinha().get(i).getFigurinhaFWC().size(); k++) {
			if(proprietario.getAlbumFigurinha().get(i).getFigurinhaFWC().get(k).getItensLimitados().equals(string)) {
				new PanelEditarFigurinhaFWC(i, k).setVisible(true);
				return true;
			} 
		} 
		for (int k = 0; k < proprietario.getAlbumFigurinha().get(i).getFigurinhaSeleção().size(); k++) {
			if(proprietario.getAlbumFigurinha().get(i).getFigurinhaSeleção().get(k).getJogador().equals(string)) {
				new PanelEditarFigurinhaSelecao(i, k).setVisible(true);
				return true;
			} 
		}
		return false;
	}
		
	/**
	 * Metodo responsavel por checar se o usuario esta inserindo apenas numeros.
	 */
	public class ControleInformacoesPessoais {
		public static boolean checkNumero(String valor) {
			if(valor.matches("[0-9]+"))
				return true ;
			else
				return false ;
		}
	}
}
