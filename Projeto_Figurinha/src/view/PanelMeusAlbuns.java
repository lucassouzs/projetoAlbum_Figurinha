package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import controler.ControleProprietario;

public class PanelMeusAlbuns extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;

	private JPanel jpnVermelho;
	private JPanel jpnBranco;
	private JButton jbtMenu;
	private JLabel jlbMeusAlbuns;
	private JButton jbtSearch;
	private JButton jbtAdd;

	public PanelMeusAlbuns(){
		super();
		this.configurarFrame();
		this.configurarPainelVermelho();
		this.configurarPainelBranco();
		this.add(this.jpnVermelho);
		this.add(this.jpnBranco);
	}
	
	private void configurarPainelVermelho() {
		this.jpnVermelho = new JPanel(null);	
		this.jpnVermelho.setBackground(new Color(136, 22, 55)); 
		this.jpnVermelho.setBounds(0, 0, 1366, 155);
		
		this.configurarDadosMenu();
		this.jpnVermelho.add(this.jbtMenu);
		this.jpnVermelho.add(this.jlbMeusAlbuns); 
		this.jpnVermelho.add(this.jbtSearch);
		this.jpnVermelho.add(this.jbtAdd);
	}
	
	private void configurarPainelBranco() {
		this.jpnBranco = new JPanel(null);	 
		this.jpnBranco.setBackground(Color.white); 
		this.jpnBranco.setBounds(0, 155, 1366, 613);
	}
	
	private void configurarDadosMenu() {
		this.jbtMenu = new JButton(new ImageIcon("menu.png"));
		this.jbtMenu.setFont(new Font("Arial", Font.BOLD, 12));
		this.jbtMenu.setBackground(new Color(136, 22, 55));
		this.jbtMenu.setBorder(new LineBorder(new Color(136, 22, 55)));
		this.jbtMenu.setBounds(85, 51, 50, 50);
		this.jbtMenu.addActionListener(this);

		this.jlbMeusAlbuns = new JLabel("Meus Albuns");
		this.jlbMeusAlbuns.setForeground(Color.white);
		this.jlbMeusAlbuns.setFont(new Font("Verdana",Font.BOLD,35));
		this.jlbMeusAlbuns.setBounds(296, 51, 296,51);
		
		this.jbtSearch = new JButton(new ImageIcon("search.png"));
		this.jbtSearch.setFont(new Font("Arial", Font.BOLD, 12));
		this.jbtSearch.setBackground(new Color(136, 22, 55));
		this.jbtSearch.setBorder(new LineBorder(new Color(136, 22, 55)));
		this.jbtSearch.setBounds(1090, 51, 50, 50);

		this.jbtAdd = new JButton(new ImageIcon("add.png"));
		this.jbtAdd.setFont(new Font("Arial", Font.BOLD, 12));
		this.jbtAdd.setBackground(new Color(136, 22, 55));
		this.jbtAdd.setBorder(new LineBorder(new Color(136, 22, 55)));
		this.jbtAdd.setBounds(1247, 51, 50, 50);
	}
	
	private void configurarFrame() {
		this.setTitle("Meu Album de Figurinha"); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false); 
		this.setSize(1366, 768); 
		this.getContentPane().setBackground(Color.white); 
		this.setLayout(null);
		
		ImageIcon logo = new ImageIcon("logo.png"); 
		this.setIconImage(logo.getImage());
	}
	
	public void actionPerformed(ActionEvent e) {
		ControleProprietario controlePerfil= new ControleProprietario();
		controlePerfil.controlePerfil();
	}
}
