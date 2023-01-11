package view;

import java.awt.Color;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelMeusAlbuns extends JFrame{
	
	private static final long serialVersionUID = 1L;

	private JPanel jpnVermelho;
	private JPanel jpnBranco;
	private JButton jbtMenu;
	private JLabel jlbMeusAlbuns;
	private JTextField jtfBusca;
	private List jltBusca;
	private JButton jbtAdicionar;

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
		this.jpnVermelho.setBackground(new Color(104, 15, 49)); 
		this.jpnVermelho.setBounds(0, 0, 1366, 155);
		this.configurarDadosMenu();
	}
	
	private void configurarPainelBranco() {
		this.jpnBranco = new JPanel(null);	 
		this.jpnBranco.setBackground(Color.white); 
		this.jpnBranco.setBounds(0, 155, 1366, 613);
		this.configurarDadosMenu();
	}
	
	private void configurarDadosMenu() {
	}
	
	private void configurarFrame() {
		this.setTitle("Meu Album de Figurinha"); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false); 
		this.setSize(1366, 768); 
		this.getContentPane().setBackground(Color.white); 
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		
		ImageIcon logo = new ImageIcon("logo.png"); 
		this.setIconImage(logo.getImage());
	}
}
