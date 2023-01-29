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

/**
 * Classe responsavel por inicializar a tela em que sera 
 * possivel selecionar o tipo e criar a figurinha.
 * @author Lucas Ribeiro de Souza 
 * @author Lucas Victor Ferreira de Araujo
 * @since 2022
 * @version 1.0
 */
public class PanelCriarFigurinha extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	private JPanel jpnVermelho;
	private JPanel jpnBranco;
	private JLabel jlbCriarFigurinha;
	private JButton jbtFWC;
	private JButton jbtSelecao;
	private JButton jbtBack;

	/**
	 * Metodo construtor no qual recebe os metodos 
	 * e exibe atraves da interface grafica.
	 * @param i
	 */
	public PanelCriarFigurinha(int i){
		super();
		this.configurarFrame();
		this.configurarPainelVermelho(i);
		this.configurarPainelBranco(i);
		this.add(this.jpnVermelho);
		this.add(this.jpnBranco);
	}
	
	/*
	 * Metodo que cria, estiliza e recebe os componentes
	 * presentes no painel vermelho.
	 */
	private void configurarPainelVermelho(int i) {
		this.jpnVermelho = new JPanel(null);	
		this.jpnVermelho.setBackground(new Color(136, 22, 55)); 
		this.jpnVermelho.setBounds(0, 0, 700, 100);
		
		this.configurarDadosMenu(i);
		this.jpnVermelho.add(this.jlbCriarFigurinha); 
		this.jpnVermelho.add(this.jbtBack);
		}
	
	/**
	 * /**
	 * Metodo que cria, estiliza e recebe os componentes presentes 
	 * no painel branco.
	 * @param i
	 */
	private void configurarPainelBranco(int i) {
		this.jpnBranco = new JPanel(null);	 
		this.jpnBranco.setBounds(0, 100, 700, 300);
		this.jpnBranco.setBackground(new Color(240, 240, 240));
		
		this.configurarDadosMenu(i);
		this.jpnBranco.add(this.jbtFWC);
		this.jpnBranco.add(this.jbtSelecao);
	}
	
	/**
	 * Metodo que cria e estilizar o painel de exibição selecao
	 * da FigurinhaFWC ou FigurinhaSelecao.
	 * @param i
	 */
	private void configurarDadosMenu(int i) {
		this.jlbCriarFigurinha = new JLabel("Criar Figurinha");
		this.jlbCriarFigurinha.setForeground(Color.white);
		this.jlbCriarFigurinha.setFont(new Font("Verdana",Font.BOLD,35));
		this.jlbCriarFigurinha.setBounds(203, 24, 500, 51);
		
		this.jbtFWC = new JButton("Figurinha FWC");
		this.jbtFWC.setForeground(Color.white);
		this.jbtFWC.setFont(new Font("Arial", Font.BOLD, 12));
		this.jbtFWC.setBackground(new Color(136, 22, 55));
		this.jbtFWC.setBorder(new LineBorder(new Color(136, 22, 55)));
		this.jbtFWC.setBounds(200, 58, 306, 40);
		this.jbtFWC.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				new PanelFigurinhaFWC(i).setVisible(true);
				
				PanelCriarFigurinha.this.dispose();
			}	
		});
		
		this.jbtSelecao = new JButton("Figurinha Seleção");
		this.jbtSelecao.setForeground(Color.white);
		this.jbtSelecao.setFont(new Font("Arial", Font.BOLD, 12));
		this.jbtSelecao.setBackground(new Color(136, 22, 55));
		this.jbtSelecao.setBorder(new LineBorder(new Color(136, 22, 55)));
		this.jbtSelecao.setBounds(200, 161, 306, 40);
		this.jbtSelecao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				new PanelFigurinhaSelecao(i).setVisible(true);
				
				PanelCriarFigurinha.this.dispose();
			}	
		});
		
		this.jbtBack = new JButton(new ImageIcon("backmenor.png"));
		this.jbtBack.setFont(new Font("Arial", Font.BOLD, 12));
		this.jbtBack.setBackground(new Color(136, 22, 55));
		this.jbtBack.setBorder(new LineBorder(new Color(136, 22, 55)));
		this.jbtBack.setBounds(75, 32, 40, 40);
		this.jbtBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				
				new PanelAlbumQatar(i).setVisible(true);
				
				PanelCriarFigurinha.this.dispose();
			}	
		});
	}
	
	/**
	 * Metodo que cria estilizar o frame "MyCup".
	 */
	private void configurarFrame() {
		this.setTitle("MyCup"); 
		this.setResizable(false); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700, 400); 
		this.getContentPane().setBackground(Color.white); 
		this.setLayout(null);
		
		ImageIcon logo = new ImageIcon("logo.png"); 
		this.setIconImage(logo.getImage());
	}
	
	/**
	 * Metodo que dispara quando uma acao de clique e executada.
	 */
	public void actionPerformed(ActionEvent e) {
		
	}		
}


