package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import controler.ControleProprietario;
import model.Proprietario;

/**
 * Classe responsavel por inicializar a tela em que sera 
 * possivel ver todos os dados realiza no Cadastro.
 * @author Lucas Ribeiro de Souza 
 * @author Lucas Victor Ferreira de Araujo
 * @since 2022
 * @version 1.0
 */
public class PanelMenu extends JFrame{
	
	private static final long serialVersionUID = 1L;

	public static Proprietario proprietario;
	private JPanel jpnBranco;
	private JLabel jlbPerfil;
	private JLabel jlbProprietario;
	private JLabel jlbIdade;
	private JLabel jlbSexo;
	private JButton jbtMeusAlbuns;
	private JButton jbtSair;
	
	
	/**
	 * Metodo construtor no qual recebe os metodos 
	 * e exibe atraves da interface grafica.
	 */
	public PanelMenu(){
		super();
		this.configurarFrame();
		this.configurarPainelBranco();
		this.add(this.jpnBranco);
	}
	/**
	 * Metodo que cria, estiliza e recebe os componentes
	 * presentes no painel branco.
	 */
	private void configurarPainelBranco() {
		this.jpnBranco = new JPanel(null);	 
		this.jpnBranco.setBackground(new Color(240, 240, 240)); 
		this.jpnBranco.setBounds(0, 0, 429, 768);
		
		this.configurarDadosMenu();
		this.jpnBranco.add(this.jlbPerfil);
		this.jpnBranco.add(this.jlbProprietario); 
		this.jpnBranco.add(this.jlbIdade); 
		this.jpnBranco.add(this.jlbSexo); 
		this.jpnBranco.add(this.jbtMeusAlbuns);
		this.jpnBranco.add(this.jbtSair);
	}
	
	/**
	 * Metodo para estilizar e puxar os dados dados do cadastro
	 *  e exibir no PanelMenu.
	 */
	private void configurarDadosMenu() {
		
		ImageIcon perfil = new ImageIcon("perfil.png");
		this.jlbPerfil = new JLabel();
		this.jlbPerfil.setIcon(perfil);
		this.jlbPerfil.setBounds(150, 30, 400, 180);
		
		this.jlbProprietario = new JLabel("Nome: " + ControleProprietario.proprietario.getNome());
		this.jlbProprietario.setForeground(new Color(92, 92, 92));
		this.jlbProprietario.setFont(new Font("Verdana", Font.PLAIN, 25));
		this.jlbProprietario.setBounds(30, 215, 400, 59);
		
		this.jlbIdade = new JLabel("Idade: " + ControleProprietario.proprietario.getIdade() );
		this.jlbIdade.setForeground(new Color(92, 92, 92));
		this.jlbIdade.setFont(new Font("Verdana", Font.PLAIN, 25));
		this.jlbIdade.setBounds(30, 315, 168, 59);

		this.jlbSexo = new JLabel("Sexo: " + ControleProprietario.proprietario.getSexo());
		this.jlbSexo.setForeground(new Color(92, 92, 92));
		this.jlbSexo.setFont(new Font("Verdana", Font.PLAIN, 25));
		this.jlbSexo.setBounds(30, 415, 400, 59);
		
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

	/**
	 * Metodo que cria e estiliza os componente presentes no frame.
	 */
	private void configurarFrame() {
		this.setTitle("MyCup"); 
		this.setResizable(false); 
		this.setSize(429, 768); 
		this.getContentPane().setBackground(new Color(136, 22, 55)); 
		this.setLayout(null);
		
		ImageIcon logo = new ImageIcon("logo.png"); 
		this.setIconImage(logo.getImage());
	}
	
	/**
	 * Metodo para feixar o PanelMeusAlbuns.
	 */
	public void meusAlbuns() {
		PanelMenu.this.dispose();
	}
	
	/*
	 * Metodo para encerrar o programa.
	 */
	public void sair() {
		int r = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Atenção!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
		if(r == JOptionPane.YES_OPTION){
			System.exit(0);
		} else if (r == JOptionPane.NO_OPTION) {
		}
		
	}
}