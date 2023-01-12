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

public class PanelCriarAlbum extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;

	private JPanel jpnVermelho;
	private JPanel jpnBranco;
	private JButton jbtBack;
	private JLabel jlbCriarAlbum;
	private JButton jbtSearch;

	public PanelCriarAlbum(){
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
		this.jpnVermelho.add(this.jbtBack);
		this.jpnVermelho.add(this.jlbCriarAlbum); 
		this.jpnVermelho.add(this.jbtSearch);
	}
	
	private void configurarPainelBranco() {
		this.jpnBranco = new JPanel(null);	 
		this.jpnBranco.setBackground(Color.white); 
		this.jpnBranco.setBounds(0, 155, 1366, 613);
	}
	
	private void configurarDadosMenu() {
		this.jbtBack = new JButton(new ImageIcon("back.png"));
		this.jbtBack.setFont(new Font("Arial", Font.BOLD, 12));
		this.jbtBack.setBackground(new Color(136, 22, 55));
		this.jbtBack.setBorder(new LineBorder(new Color(136, 22, 55)));
		this.jbtBack.setBounds(85, 51, 50, 50);
		this.jbtBack.addActionListener(this);

		this.jlbCriarAlbum = new JLabel("Criar Album");
		this.jlbCriarAlbum.setForeground(Color.white);
		this.jlbCriarAlbum.setFont(new Font("Verdana",Font.BOLD,35));
		this.jlbCriarAlbum.setBounds(296, 51, 296,51);

		this.jbtSearch = new JButton(new ImageIcon("search.png"));
		this.jbtSearch.setFont(new Font("Arial", Font.BOLD, 12));
		this.jbtSearch.setBackground(new Color(136, 22, 55));
		this.jbtSearch.setBorder(new LineBorder(new Color(136, 22, 55)));
		this.jbtSearch.setBounds(1247, 51, 50, 50);
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
		
		ControleProprietario controleRetornar= new ControleProprietario();
		controleRetornar.controleRetornar();
		PanelCriarAlbum.this.dispose();
	}
}

