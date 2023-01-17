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
import model.Proprietario;

public class PanelMenu extends JFrame{
	
	private static final long serialVersionUID = 1L;

	public static Proprietario proprietario;
	private JPanel jpnBranco;
	private JLabel jlbPerfil;
	private JLabel jlbProprietario;
	//private JLabel jlbProprietarioResposta;
	private JLabel jlbIdade;
	//private JLabel jlbIdadeResposta;
	private JLabel jlbSexo;
	//private JLabel jlbSexoResposta;
	private JButton jbtMeusAlbuns;
	private JButton jbtSair;

	public PanelMenu(){
		super();
		this.configurarFrame();
		this.configurarPainelBranco();
		this.add(this.jpnBranco);
	}
	
	private void configurarPainelBranco() {
		this.jpnBranco = new JPanel(null);	 
		this.jpnBranco.setBackground(new Color(240, 240, 240)); 
		this.jpnBranco.setBounds(0, 0, 429, 768);
		
		this.configurarDadosMenu();
		this.jpnBranco.add(this.jlbPerfil);
		this.jpnBranco.add(this.jlbProprietario); 
		//this.jpnBranco.add(this.jlbProprietarioResposta); 
		this.jpnBranco.add(this.jlbIdade); 
		//this.jpnBranco.add(this.jlbIdadeResposta); 
		this.jpnBranco.add(this.jlbSexo); 
		//this.jpnBranco.add(this.jlbSexoResposta); 
		this.jpnBranco.add(this.jbtMeusAlbuns);
		this.jpnBranco.add(this.jbtSair);
	}
	
	private void configurarDadosMenu() {
		
		ImageIcon perfil = new ImageIcon("perfil.png");
		this.jlbPerfil = new JLabel();
		this.jlbPerfil.setIcon(perfil);
		this.jlbPerfil.setBounds(150, 30, 400, 180);
		
		this.jlbProprietario = new JLabel("Nome: ");
		this.jlbProprietario.setForeground(new Color(92, 92, 92));
		this.jlbProprietario.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jlbProprietario.setBounds(30, 215, 168, 59);
		
		/*this.jlbProprietarioResposta = new JLabel();
		this.jlbProprietarioResposta.setForeground(new Color(92, 92, 92));
		this.jlbProprietarioResposta.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jlbProprietarioResposta.setBounds(60, 215, 168, 59);*/
		
		this.jlbIdade = new JLabel("Idade: ");
		this.jlbIdade.setForeground(new Color(92, 92, 92));
		this.jlbIdade.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jlbIdade.setBounds(30, 315, 168, 59);
		
		/*this.jlbIdadeResposta = new JLabel();
		this.jlbIdadeResposta.setText();
		this.jlbIdadeResposta.setForeground(new Color(92, 92, 92));
		this.jlbIdadeResposta.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jlbIdadeResposta.setBounds(60, 215, 168, 59);*/

		this.jlbSexo = new JLabel("Sexo: ");
		this.jlbSexo.setForeground(new Color(92, 92, 92));
		this.jlbSexo.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jlbSexo.setBounds(30, 415, 168, 59);
		
		/*this.jlbSexoResposta = new JLabel();
		this.jlbSexoResposta.setText();
		this.jlbSexoResposta.setForeground(new Color(92, 92, 92));
		this.jlbSexoResposta.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jlbSexoResposta.setBounds(60, 215, 168, 59);*/
		
		this.jbtMeusAlbuns = new JButton("Meus Albuns");
		this.jbtMeusAlbuns.setForeground(new Color(92, 92, 92));
		this.jbtMeusAlbuns.setBackground(new Color(240, 240, 240));
		this.jbtMeusAlbuns.setBorder(new LineBorder(new Color(240, 240, 240)));
		this.jbtMeusAlbuns.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jbtMeusAlbuns.setBounds(95, 560, 228, 59);
		this.jbtMeusAlbuns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == jbtMeusAlbuns) {
					meusAlbuns();
				}
				}
				});
		
		this.jbtSair = new JButton("Sair");
		this.jbtSair.setForeground(Color.red);
		this.jbtSair.setBackground(new Color(240, 240, 240));
		this.jbtSair.setBorder(new LineBorder(new Color(240, 240, 240)));
		this.jbtSair.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jbtSair.setBounds(125, 630, 168, 59);
		this.jbtSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == jbtSair) {
					sair();
				}
				}
				});
	}

	private void configurarFrame() {
		this.setTitle("perseverança, aprendizado,"); 
		this.setResizable(false); 
		this.setSize(429, 768); 
		this.getContentPane().setBackground(new Color(136, 22, 55)); 
		this.setLayout(null);
		
		ImageIcon logo = new ImageIcon("logo.png"); 
		this.setIconImage(logo.getImage());
	}
	
	public void meusAlbuns() {
		ControleProprietario voltarMeusAlbuns = new ControleProprietario();
		
		voltarMeusAlbuns.voltarMeusAlbuns();
		
		PanelMenu.this.dispose();
	}
	
	public void sair() {
		
		System.exit(0);
	}
}