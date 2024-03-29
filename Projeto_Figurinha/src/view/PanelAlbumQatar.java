package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import controler.ControleProprietario;

/**
 * Classe responsavel por inicializar a tela em que sera 
 * possivel ver todas as listas de figurinhas do propietario.
 * @author Lucas Ribeiro de Souza 
 * @author Lucas Victor Ferreira de Araujo
 * @since 2022
 * @version 1.0
 */
public class PanelAlbumQatar extends JFrame implements ActionListener, ListSelectionListener{
	
	private static final long serialVersionUID = 1L;

	private JPanel jpnVermelho;
	private JPanel jpnBranco;
	private JTextField jtfPesquisar;
	private JButton jbtPesquisar;
	private JPanel jpnListaFigurinhaFWC;
	private JPanel jpnListaFigurinhaSelecao;
	private JButton jbtBack;
	private JLabel jlbCopaMundo;
	private JTextField jtfNome;
	private JButton jbtDell;
	private JButton jbtEdit;
	private JButton jbtCriarFigurinha;
	public JList<String> jltListaFigurinhasFWC;
	public JList<String> jltListaFigurinhasSelecao;
	private ControleProprietario controle = new ControleProprietario();
	public int i;
	
	/**
	 * Metodo construtor no qual recebe os metodos 
	 * e exibe atraves da interface grafica.
	 */
	public PanelAlbumQatar(int i){
		super();
		this.configurarFrame();
		this.configurarPainelVermelho(i);
		this.configurarPainelBranco();
		this.configurarPainelListaFWC();
		this.configurarPainelListaSelecao();
		this.add(this.jpnVermelho);
		this.add(this.jpnBranco);
		this.i=i;
	}
	
	/**
	 * Metodo que cria, estiliza e recebe os componentes
	 * presentes no painel vermelho.
	 * @param i
	 */
	private void configurarPainelVermelho(int i) {
		this.jpnVermelho = new JPanel(null);	
		this.jpnVermelho.setBackground(new Color(136, 22, 55)); 
		this.jpnVermelho.setBounds(0, 0, 1366, 155);
		
		this.configurarDadosMenu(i);
		this.jpnVermelho.add(this.jbtBack);
		this.jpnVermelho.add(this.jlbCopaMundo); 
		this.jpnVermelho.add(this.jtfNome);
		this.jpnVermelho.add(this.jbtDell);
		this.jpnVermelho.add(this.jbtEdit);
		this.jpnVermelho.add(this.jtfPesquisar);
		this.jpnVermelho.add(this.jbtPesquisar);
		this.jpnVermelho.add(this.jbtCriarFigurinha);
	}
	
	/**
	 * Metodo que cria e estiliza o painel branco.
	 */
	private void configurarPainelBranco() {
		this.jpnBranco = new JPanel();	 
		this.jpnBranco.setBackground(new Color(240, 240, 240)); 
		this.jpnBranco.setBounds(0, 155, 1366, 613);
		this.jpnBranco.setLayout(null);	
	}
	
	/*
	 * Metodo que cria e estilizar o painel de exibição da lista de figurinhas FWC.
	 */
	private void configurarPainelListaFWC() {
		
		JScrollPane scrollPane1 = new JScrollPane(this.jltListaFigurinhasFWC);
		
		this.jpnListaFigurinhaFWC = new JPanel();
		this.jpnListaFigurinhaFWC.setBounds(133, 240, 500, 402);
		this.jpnListaFigurinhaFWC.setLayout(new BorderLayout());		
		this.jpnListaFigurinhaFWC.add(this.jltListaFigurinhasFWC);
		this.jpnListaFigurinhaFWC.setBorder(new LineBorder(new Color(240, 240, 240)));
		this.jpnListaFigurinhaFWC.add(scrollPane1, BorderLayout.CENTER);
		this.jpnListaFigurinhaFWC.add(new JScrollPane(this.jltListaFigurinhasFWC));
		
		this.jpnBranco.add(this.jpnListaFigurinhaFWC);
		
	}
	
	/*
	 * Metodo que cria e estilizar o painel de exibição da lista de figurinhas Selecao.
	 */
	private void configurarPainelListaSelecao() {
		
		JScrollPane scrollPane1 = new JScrollPane(this.jltListaFigurinhasSelecao);
		
		this.jpnListaFigurinhaSelecao = new JPanel();
		this.jpnListaFigurinhaSelecao.setBounds(733, 240, 500, 402);
		this.jpnListaFigurinhaSelecao.setLayout(new BorderLayout());		
		this.jpnListaFigurinhaSelecao.add(this.jltListaFigurinhasSelecao);
		this.jpnListaFigurinhaSelecao.setBorder(new LineBorder(new Color(240, 240, 240)));
		this.jpnListaFigurinhaSelecao.add(scrollPane1, BorderLayout.CENTER);
		this.jpnListaFigurinhaSelecao.add(new JScrollPane(this.jltListaFigurinhasSelecao));
		
		this.jpnBranco.add(this.jpnListaFigurinhaSelecao);
	}
	
	/**
	 * Metodo que cria e estiliza os componente presentes no frame.
	 */
	private void configurarDadosMenu(int i) {
		this.jbtBack = new JButton(new ImageIcon("back.png"));
		this.jbtBack.setBackground(new Color(136, 22, 55));
		this.jbtBack.setBorder(new LineBorder(new Color(136, 22, 55)));
		this.jbtBack.setBounds(85, 51, 50, 50);
		this.jbtBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == jbtBack) {
					back();
				}
				}
				});
		
		this.jtfPesquisar = new JTextField();
		this.jtfPesquisar.setBackground(Color.white);
		this.jtfPesquisar.setToolTipText("Pesquisar Figurinha");
		this.jtfPesquisar.setFont(new Font("Arial", Font.PLAIN, 13));
		this.jtfPesquisar.setBorder(new LineBorder(Color.white));
		this.jtfPesquisar.setBounds(950, 65, 190, 30);
		
		this.jbtPesquisar = new JButton(new ImageIcon("search.png"));
		this.jbtPesquisar.setBackground(new Color(136, 22, 55));
		this.jbtPesquisar.setBorder(new LineBorder(new Color(136, 22, 55)));
		this.jbtPesquisar.setBounds(1150, 65, 30, 30);
		this.jbtPesquisar.addActionListener(
			new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(controle.buscarFigurinha(jtfPesquisar.getText().toString(), i)) {
						PanelAlbumQatar.this.dispose();
					} else {
						JOptionPane.showMessageDialog(null, "Nenhuma figurinha encontrada.");
					}
				}
				}
				);
		
		this.jbtCriarFigurinha = new JButton(new ImageIcon("add.png"));
		this.jbtCriarFigurinha.setFont(new Font("Arial", Font.BOLD, 12));
		this.jbtCriarFigurinha.setBackground(new Color(136, 22, 55));
		this.jbtCriarFigurinha.setBorder(new LineBorder(new Color(136, 22, 55)));
		this.jbtCriarFigurinha.setBounds(1230, 51, 50, 50);
		this.jbtCriarFigurinha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == jbtCriarFigurinha) {
					criarFigurinha(i);
				}
				}
				});
		
		this.jbtDell = new JButton(new ImageIcon("dell.png"));
		this.jbtDell.setFont(new Font("Arial", Font.BOLD, 12));
		this.jbtDell.setBackground(new Color(136, 22, 55));
		this.jbtDell.setBorder(new LineBorder(new Color(136, 22, 55)));
		this.jbtDell.setBounds(250, 50, 20, 20);
		this.jbtDell.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == jbtDell) {
					dell(i);
				}
				}
				});
		
		this.jbtEdit = new JButton(new ImageIcon("edit.png"));
		this.jbtEdit.setFont(new Font("Arial", Font.BOLD, 12));
		this.jbtEdit.setBackground(new Color(136, 22, 55));
		this.jbtEdit.setBorder(new LineBorder(new Color(136, 22, 55)));
		this.jbtEdit.setBounds(250, 95, 20, 20);
		this.jbtEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == jbtEdit) {
					edit(i);
				}
				}
				});

		this.jlbCopaMundo = new JLabel("FIFA WORLD CUP QATAR 2022");
		this.jlbCopaMundo.setForeground(Color.white);
		this.jlbCopaMundo.setFont(new Font("Verdana", Font.BOLD, 35));
		this.jlbCopaMundo.setBounds(296, 35, 800, 51);
		
		this.jtfNome = new JTextField();
		this.jtfNome.setText(ControleProprietario.proprietario.getAlbumFigurinha().get(i).getNome());
		this.jtfNome.setBackground(new Color(136, 22, 55));
		this.jtfNome.setToolTipText("Nome do Album (Se quiser altera-lo, digite um novo e aperte no botao 'Edit' ao lado)");
		this.jtfNome.setForeground(Color.white);
		this.jtfNome.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jtfNome.setBorder(new LineBorder(new Color(136, 22, 55)));
		this.jtfNome.setBounds(296, 90, 600, 30);
		
		this.jltListaFigurinhasFWC = new JList<String>();
		this.jltListaFigurinhasFWC.setBackground(new Color(240, 240, 240));
		this.jltListaFigurinhasFWC.setBorder(new LineBorder(new Color(240, 240, 240)));
		this.jltListaFigurinhasFWC.setForeground(Color.black);
		this.jltListaFigurinhasFWC.setModel(controle.listarFigurinhas_FWC(i));
		this.jltListaFigurinhasFWC.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				if(e.getSource() == jltListaFigurinhasFWC) {
					abrirFWC(i, e);
				}
			}
		});
		
		this.jltListaFigurinhasSelecao = new JList<String>();
		this.jltListaFigurinhasSelecao.setBackground(new Color(240, 240, 240));
		this.jltListaFigurinhasSelecao.setBorder(new LineBorder(new Color(240, 240, 240)));
		this.jltListaFigurinhasSelecao.setForeground(Color.black);
		this.jltListaFigurinhasSelecao.setModel(controle.listarFigurinhas_Selecao(i));
		this.jltListaFigurinhasSelecao.addListSelectionListener(this);
		this.jltListaFigurinhasSelecao.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				if(e.getSource() == jltListaFigurinhasSelecao) {
					abrirSelecao(i, e);
				}
			}
		});
	}
	
	/**
	 * Metodo que cria estilizar o frame "MyCup".
	 */
	private void configurarFrame() {
		this.setTitle("MyCup"); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false); 
		this.setSize(1366, 768); 
		this.getContentPane().setBackground(Color.white); 
		this.setLayout(null);
		this.setLayout(new BorderLayout());
		
		ImageIcon logo = new ImageIcon("logo.png"); 
		this.setIconImage(logo.getImage());
	}
	
	/**
	 * Metodo para retorna a tela PanelMeusAlbuns.
	 */
	public void back() {
		new PanelMeusAlbuns().setVisible(true);
		dispose();
	}	
	
	/**
	 * Metodo para abrir a tela PanelCriarFigurinha.
	 * @param i
	 */
	public void criarFigurinha(int i) {
		new PanelCriarFigurinha(i).setVisible(true);
		dispose();
	}	
	
	/**
	 * Metodo para excluir o album de figurinhas selecionado.
	 * @param i
	 */
	public void dell(int i) {	
		int r = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o album?", "Atenção!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
		if(r == JOptionPane.YES_OPTION){
			ControleProprietario excluir = new ControleProprietario();
			excluir.deletarAlbum(ControleProprietario.proprietario.getAlbumFigurinha().get(i));
			new PanelMeusAlbuns().setVisible(true);
			
			PanelAlbumQatar.this.dispose();
		} else if (r == JOptionPane.NO_OPTION) {
		}
	}
	
	/**
	 * Metodo para editar o nome do album de figurinhas selecionado.
	 * @param i
	 */
	public void edit(int i) {	
		JOptionPane.showMessageDialog(null, "Nome alterado com sucesso!");	
		ControleProprietario proprietario = new ControleProprietario();
	    String nome = this.jtfNome.getText().toString();
	    proprietario.editarAlbum(nome, i);
	}	
	
	/**
	 * Metodo para abrir a figurinha FWC dentro da lista e retorna para o metodo
	 * abrirFigurinhaFWC disponivel em {@link controler.ControleProprietario}.
	 * @param i
	 * @param e
	 */
	public void abrirFWC(int i, ListSelectionEvent e) {
		Object src = e.getSource();
		
		if(e.getValueIsAdjusting() && src == this.jltListaFigurinhasFWC) {
			controle.abrirFigurinhaFWC(this.jltListaFigurinhasFWC.getSelectedValue().toString(), i);
				
			dispose();
		}
	}
	
	/**
	 * Metodo para abrir a figurinha Selecao dentro da lista e retorna para o metodo
	 * abrirFigurinhaSelecao disponivel em {@link controler.ControleProprietario}.
	 * @param i
	 * @param e
	 */
	public void abrirSelecao(int i, ListSelectionEvent e){
		Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == this.jltListaFigurinhasSelecao) {
			controle.abrirFigurinhaSelecao(this.jltListaFigurinhasSelecao.getSelectedValue().toString(), i);

			dispose();
		}
	}
	
	/**
	 * Metodo que dispara quando uma acao de clique e executada.
	 */
	public void actionPerformed(ActionEvent e) {
	}
	
	/**
	 * Metodo que dispara quando uma lista e selecionada.
	 */
	@Override
	public void valueChanged(ListSelectionEvent e) {
	}
}