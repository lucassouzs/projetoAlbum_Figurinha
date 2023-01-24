package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import controler.ControleProprietario;

public class PanelEditarFigurinhaSelecao extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel jpnVermelho;
	private JPanel jpnBranco;
	private JLabel jlbCriarFigurinha;
	private JButton jbtSalvar;
	private JButton jbtEditar;
	private JLabel jlbSigla;
	private JTextField jtfSigla;
	private JLabel jlbCodigo;
	private JTextField jtfCodigo;
	private JLabel jlb1;
	private JTextField jtf1;
	private JLabel jlb2;
	private JTextField jtf2;
	private JButton jbtBack;

	public PanelEditarFigurinhaSelecao(){
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
		this.jpnVermelho.setBounds(0, 0, 700, 100);
		
		this.configurarDadosMenu();
		this.jpnVermelho.add(this.jlbCriarFigurinha); 
		}
	
	private void configurarPainelBranco() {
		this.jpnBranco = new JPanel(null);	 
		this.jpnBranco.setBounds(0, 100, 700, 300);
		this.jpnBranco.setBackground(new Color(240, 240, 240));
		
		this.configurarDadosMenu();
		this.jpnBranco.add(this.jbtSalvar);
		this.jpnBranco.add(this.jbtEditar);
		
		this.jpnBranco.add(this.jlbSigla);
		this.jpnBranco.add(this.jtfSigla);

		this.jpnBranco.add(this.jlbCodigo);
		this.jpnBranco.add(this.jtfCodigo);

		this.jpnBranco.add(this.jlb1);
		this.jpnBranco.add(this.jtf1);

		this.jpnBranco.add(this.jlb2);
		this.jpnBranco.add(this.jtf2);
	}
	
	private void configurarDadosMenu() {
		this.jlbCriarFigurinha = new JLabel("Editar Figurinha Seleção");
		this.jlbCriarFigurinha.setForeground(Color.white);
		this.jlbCriarFigurinha.setFont(new Font("Verdana",Font.BOLD,35));
		this.jlbCriarFigurinha.setBounds(105, 24, 500, 51);
		
		this.jbtBack = new JButton(new ImageIcon("backmenor.png"));
		this.jbtBack.setFont(new Font("Arial", Font.BOLD, 12));
		this.jbtBack.setBackground(new Color(136, 22, 55));
		this.jbtBack.setBorder(new LineBorder(new Color(136, 22, 55)));
		this.jbtBack.setBounds(75, 32, 40, 40);
		
		
		this.jlbSigla = new JLabel("Sigla:");
		this.jlbSigla.setFont(new Font("Arial",Font.BOLD,15));
		this.jlbSigla.setBounds(197, 13, 500, 40);
		this.jlbSigla.setForeground(new Color(71, 71, 71));
		
		this.jtfSigla = new JTextField();
		this.jtfSigla.setToolTipText("Insira a sigla da figurinha");
		this.jtfSigla.setPreferredSize(new Dimension(306, 40));
		this.jtfSigla.setBorder(new LineBorder(Color.white));
		this.jtfSigla.setBounds(197, 53, 130, 40);

		this.jlbCodigo = new JLabel("Código:");
		this.jlbCodigo.setFont(new Font("Arial",Font.BOLD,15));
		this.jlbCodigo.setBounds(373, 13, 500, 40);
		this.jlbCodigo.setForeground(new Color(71, 71, 71));
		
		this.jtfCodigo = new JTextField();
		this.jtfCodigo.setToolTipText("Insira o código da figurinha");
		this.jtfCodigo.setPreferredSize(new Dimension(306, 40));
		this.jtfCodigo.setBorder(new LineBorder(Color.white));
		this.jtfCodigo.setBounds(373, 53, 130, 40);

		this.jlb1 = new JLabel("Seleção:");
		this.jlb1.setFont(new Font("Arial",Font.BOLD,15));
		this.jlb1.setBounds(197, 95, 500, 40);
		this.jlb1.setForeground(new Color(71, 71, 71));
		
		this.jtf1 = new JTextField();
		this.jtf1.setToolTipText("Insira o nome da seleção");
		this.jtf1.setPreferredSize(new Dimension(306, 40));
		this.jtf1.setBorder(new LineBorder(Color.white));
		this.jtf1.setBounds(197, 135, 130, 40);

		this.jlb2 = new JLabel("Jogador:");
		this.jlb2.setFont(new Font("Arial",Font.BOLD,15));
		this.jlb2.setBounds(373, 95, 500, 40);
		this.jlb2.setForeground(new Color(71, 71, 71));
		
		this.jtf2 = new JTextField();
		this.jtf2.setToolTipText("Insira o nome do jogador");
		this.jtf2.setPreferredSize(new Dimension(306, 40));
		this.jtf2.setBorder(new LineBorder(Color.white));
		this.jtf2.setBounds(373, 135, 130, 40);
		
		this.jbtSalvar = new JButton("Salvar");
		this.jbtSalvar.setFont(new Font("Arial", Font.BOLD, 18));
		this.jbtSalvar.setForeground(Color.white);
		this.jbtSalvar.setBackground(new Color(136, 22, 55));
		this.jbtSalvar.setBorder(new LineBorder(new Color(136, 22, 55)));
		this.jbtSalvar.setBounds(195, 195, 130, 40);
		
		this.jbtEditar = new JButton("Editar");
		this.jbtEditar.setFont(new Font("Arial", Font.BOLD, 18));
		this.jbtEditar.setForeground(Color.white);
		this.jbtEditar.setBackground(new Color(136, 22, 55));
		this.jbtEditar.setBorder(new LineBorder(new Color(136, 22, 55)));
		this.jbtEditar.setBounds(373, 195, 130, 40);
	}
	
	private void configurarFrame() {
		this.setTitle("estudo, sacrifício"); 
		this.setResizable(false); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700, 400); 
		this.getContentPane().setBackground(Color.white); 
		this.setLayout(null);
		
		ImageIcon logo = new ImageIcon("logo.png"); 
		this.setIconImage(logo.getImage());
	}

}