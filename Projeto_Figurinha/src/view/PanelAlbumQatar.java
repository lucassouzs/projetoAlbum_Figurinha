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
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;

import controler.ControleProprietario;

public class PanelAlbumQatar extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;

	private JPanel jpnVermelho;
	private JTabbedPane jtpBranco;
	private JButton jbtBack;
	private JLabel jlbMeusAlbuns;

	public PanelAlbumQatar(){
		super();
		this.configurarFrame();
		this.configurarPainelVermelho();
		this.configurarJTabbedPane();
		this.add(this.jpnVermelho);
		this.add(this.jtpBranco);
	}
	
	private void configurarPainelVermelho() {
		this.jpnVermelho = new JPanel(null);	
		this.jpnVermelho.setBackground(new Color(136, 22, 55)); 
		this.jpnVermelho.setBounds(0, 0, 1366, 155);
		
		this.configurarDadosMenu();
		this.jpnVermelho.add(this.jbtBack);
		this.jpnVermelho.add(this.jlbMeusAlbuns); 
	}
	
	private void configurarJTabbedPane() {
		this.jtpBranco = new JTabbedPane();	 
		this.jtpBranco.setBackground(new Color(123, 21, 51)); 
		this.jtpBranco.setBounds(0, 155, 1366, 613);
		this.jtpBranco.setForeground(Color.white);
		
		JPanel Todas = new JPanel();
		JPanel Faltantes = new JPanel();
		JPanel Repetidas = new JPanel();

		this.jtpBranco.add("Todas", Todas);
		this.jtpBranco.add("Faltantes", Faltantes);
		this.jtpBranco.add("Repetidas", Repetidas);
		
		Todas.setBackground(Color.white);
		Faltantes.setBackground(Color.white);
		Repetidas.setBackground(Color.white);
	}
	
	private void configurarDadosMenu() {
		this.jbtBack = new JButton(new ImageIcon("back.png"));
		this.jbtBack.setFont(new Font("Arial", Font.BOLD, 12));
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

		this.jlbMeusAlbuns = new JLabel("FIFA World Cup Qatar 2022");
		this.jlbMeusAlbuns.setForeground(Color.white);
		this.jlbMeusAlbuns.setFont(new Font("Verdana",Font.BOLD,35));
		this.jlbMeusAlbuns.setBounds(296, 51, 800, 51);
	}
	
	private void configurarFrame() {
		this.setTitle("e, acima de tudo,"); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false); 
		this.setSize(1366, 768); 
		this.getContentPane().setBackground(Color.white); 
		this.setLayout(null);
		
		ImageIcon logo = new ImageIcon("logo.png"); 
		this.setIconImage(logo.getImage());
	}
	
	public void back() {	
		
		ControleProprietario voltarMeusAlbuns = new ControleProprietario();
		
		voltarMeusAlbuns.voltarMeusAlbuns();
		
		dispose();
	}	

	public void actionPerformed(ActionEvent e) {
	}
}