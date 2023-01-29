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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import controler.ControleProprietario;

/**
 * Classe responsavel por inicializar a tela em que sera 
 * possivel ir para o PanelCriarAlbum, PanelMenu e
 * também ver todos albuns criados.
 * @author Lucas Ribeiro de Souza 
 * @author Lucas Victor Ferreira de Araujo
 * @since 2022
 * @version 1.0
 */
public class PanelMeusAlbuns extends JFrame implements ActionListener, ListSelectionListener{
	
	private static final long serialVersionUID = 1L;

	private JPanel jpnVermelho;
	private JPanel jpnBranco;
	private JPanel jpnLista;
	private JButton jbtMenu;
	private JLabel jlbMeusAlbuns;
	private JButton jbtAdd;
	public JList<String> jltLista;
	private ControleProprietario controle = new ControleProprietario();
	public int i;
	
	/**
	 * Metodo construtor no qual recebe os metodos 
	 * e exibe atraves da interface grafica.
	 */
	public PanelMeusAlbuns(){
		super();
		this.configurarFrame();
		this.configurarPainelVermelho();
		this.configurarPainelBranco();
		this.configurarPainelLista();
		this.add(this.jpnVermelho);
		this.add(this.jpnBranco);
	}
	
	/**
	 * Metodo que cria, estilizar e recebe os componentes
	 * presentes no painel vermelho.
	 */
	private void configurarPainelVermelho() {
		this.jpnVermelho = new JPanel(null);	
		this.jpnVermelho.setBackground(new Color(136, 22, 55)); 
		this.jpnVermelho.setBounds(0, 0, 1366, 155);
		
		this.configurarDadosMenu();
		this.jpnVermelho.add(this.jbtMenu);
		this.jpnVermelho.add(this.jlbMeusAlbuns); 
		this.jpnVermelho.add(this.jbtAdd);
	}
	
	/**
	 * Metodo que cria, estilizar e recebe os componentes presentes 
	 * no painel branco.
	 */
	private void configurarPainelBranco() {
		this.jpnBranco = new JPanel();	 
		this.jpnBranco.setBackground(new Color(240, 240, 240)); 
		this.jpnBranco.setBounds(0, 155, 1366, 613);
		this.jpnBranco.setLayout(null);		
	}
	
	/**
	 * Metodo que cria e estilizar o painel de exibição da lista de albuns.
	 */
	private void configurarPainelLista() {
		
		JScrollPane scrollPane1 = new JScrollPane(this.jltLista);
		
		this.jpnLista = new JPanel();
		this.jpnLista.setBounds(133, 240, 1100, 402);
		this.jpnLista.setLayout(new BorderLayout());		
		this.jpnLista.add(this.jltLista);
		this.jpnLista.setBorder(new LineBorder(new Color(240, 240, 240)));
		this.jpnLista.add(scrollPane1, BorderLayout.CENTER);
		this.jpnLista.add(new JScrollPane(this.jltLista));
		
		this.jpnBranco.add(this.jpnLista);
	}
	
	/**
	 * Metodo que cria e estilizar os componente presente no Painel vermelho.
	 */
	private void configurarDadosMenu() {
		this.jbtMenu = new JButton(new ImageIcon("menu.png"));
		this.jbtMenu.setFont(new Font("Arial", Font.BOLD, 12));
		this.jbtMenu.setBackground(new Color(136, 22, 55));
		this.jbtMenu.setBorder(new LineBorder(new Color(136, 22, 55)));
		this.jbtMenu.setBounds(85, 51, 50, 50);
		this.jbtMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == jbtMenu) {
					menu();
				}
				}
				});

		this.jlbMeusAlbuns = new JLabel("Meus Albuns");
		this.jlbMeusAlbuns.setForeground(Color.white);
		this.jlbMeusAlbuns.setFont(new Font("Verdana",Font.BOLD,35));
		this.jlbMeusAlbuns.setBounds(296, 51, 296,51);

		this.jbtAdd = new JButton(new ImageIcon("add.png"));
		this.jbtAdd.setFont(new Font("Arial", Font.BOLD, 12));
		this.jbtAdd.setBackground(new Color(136, 22, 55));
		this.jbtAdd.setBorder(new LineBorder(new Color(136, 22, 55)));
		this.jbtAdd.setBounds(1247, 51, 50, 50);
		this.jbtAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == jbtAdd) {
					add();
				}
				}
				});
		
		this.jltLista = new JList<String>();
		this.jltLista.setBackground(new Color(240, 240, 240));
		this.jltLista.setBorder(new LineBorder(new Color(240, 240, 240)));
		this.jltLista.setModel(controle.listarAlbum_Figurinha());
		this.jltLista.addListSelectionListener(this);
		this.jltLista.setForeground(Color.black);
	}
	
	/**
	 * Metodo que cria estiliza o frame "MyCup".
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
	 * Metodo para abrir o PainelMenu.
	 */
	public void menu() {	
		new PanelMenu().setVisible(true);
	}	
	
	/**
	 * Metodo para abrir o PanelCriarAlbum.
	 */
	public void add() {
		new PanelCriarAlbum().setVisible(true);
		
		PanelMeusAlbuns.this.dispose();
	}

	/**
	 * Metodo que dispara quando uma acao de clique e executada.
	 */
	public void actionPerformed(ActionEvent e) {
	}

	/**
	 * 
	 */
	@Override
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		
		if(e.getValueIsAdjusting() && src == this.jltLista) {
			controle.abrirAlbum(this.jltLista.getSelectedValue().toString());
			dispose();
		}
	}
}