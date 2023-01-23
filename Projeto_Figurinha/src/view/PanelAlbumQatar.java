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
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import controler.ControleProprietario;
import database.Database;

public class PanelAlbumQatar extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;

	private JPanel jpnVermelho;
	private JTabbedPane jtpBranco;
	private JButton jbtBack;
	private JLabel jlbCopaMundo;
	private JTextField jtfNome;
	private JButton jbtDell;
	private JButton jbtEdit;
	
	int number1 = 0;
	int number2 = 0;
	int number3 = 0;
	int number4 = 0;
	int number5 = 0;
	int number6 = 0;
	int number7 = 0;
	int number8 = 0;
	int number9 = 0;
	int number10 = 0;
		
	private JPanel jpnFigurinha1;
	private JLabel jlbFigurinha1;
	private JButton jbtPlus1;
	private JTextField jtfContador1;
	private JButton jbtMinus1;

	private JPanel jpnFigurinha2;
	private JLabel jlbFigurinha2;
	private JButton jbtPlus2;
	private JTextField jtfContador2;
	private JButton jbtMinus2;

	private JPanel jpnFigurinha3;
	private JLabel jlbFigurinha3;
	private JButton jbtPlus3;
	private JTextField jtfContador3;
	private JButton jbtMinus3;

	private JPanel jpnFigurinha4;
	private JLabel jlbFigurinha4;
	private JButton jbtPlus4;
	private JTextField jtfContador4;
	private JButton jbtMinus4;

	private JPanel jpnFigurinha5;
	private JLabel jlbFigurinha5;
	private JButton jbtPlus5;
	private JTextField jtfContador5;
	private JButton jbtMinus5;

	private JPanel jpnFigurinha6;
	private JLabel jlbFigurinha6;
	private JButton jbtPlus6;
	private JTextField jtfContador6;
	private JButton jbtMinus6;

	private JPanel jpnFigurinha7;
	private JLabel jlbFigurinha7;
	private JButton jbtPlus7;
	private JTextField jtfContador7;
	private JButton jbtMinus7;

	private JPanel jpnFigurinha8;
	private JLabel jlbFigurinha8;
	private JButton jbtPlus8;
	private JTextField jtfContador8;
	private JButton jbtMinus8;

	private JPanel jpnFigurinha9;
	private JLabel jlbFigurinha9;
	private JButton jbtPlus9;
	private JTextField jtfContador9;
	private JButton jbtMinus9;

	private JPanel jpnFigurinha10;
	private JLabel jlbFigurinha10;
	private JButton jbtPlus10;
	private JTextField jtfContador10;
	private JButton jbtMinus10;

	public PanelAlbumQatar(int i){
		super();
		this.configurarFrame();
		this.configurarPainelVermelho(i);
		this.configurarJTabbedPane();
		this.add(this.jpnVermelho);
		this.add(this.jtpBranco);
	}
	
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
		Todas.setLayout(null);
		
		Todas.add(this.jpnFigurinha1);
		Todas.add(this.jpnFigurinha2);
		Todas.add(this.jpnFigurinha3);
		Todas.add(this.jpnFigurinha4);
		Todas.add(this.jpnFigurinha5);
		Todas.add(this.jpnFigurinha6);
		Todas.add(this.jpnFigurinha7);
		Todas.add(this.jpnFigurinha8);
		Todas.add(this.jpnFigurinha9);
		Todas.add(this.jpnFigurinha10);
				
		this.jpnFigurinha1.add(jlbFigurinha1);
		this.jpnFigurinha1.add(jbtMinus1);
		this.jpnFigurinha1.add(jtfContador1);
		this.jpnFigurinha1.add(jbtPlus1);
				
		this.jpnFigurinha2.add(jlbFigurinha2);
		this.jpnFigurinha2.add(jbtMinus2);
		this.jpnFigurinha2.add(jtfContador2);
		this.jpnFigurinha2.add(jbtPlus2);
				
		this.jpnFigurinha3.add(jlbFigurinha3);
		this.jpnFigurinha3.add(jbtMinus3);
		this.jpnFigurinha3.add(jtfContador3);
		this.jpnFigurinha3.add(jbtPlus3);
				
		this.jpnFigurinha4.add(jlbFigurinha4);
		this.jpnFigurinha4.add(jbtMinus4);
		this.jpnFigurinha4.add(jtfContador4);
		this.jpnFigurinha4.add(jbtPlus4);
				
		this.jpnFigurinha5.add(jlbFigurinha5);
		this.jpnFigurinha5.add(jbtMinus5);
		this.jpnFigurinha5.add(jtfContador5);
		this.jpnFigurinha5.add(jbtPlus5);
		
		this.jpnFigurinha6.add(jlbFigurinha6);
		this.jpnFigurinha6.add(jbtMinus6);
		this.jpnFigurinha6.add(jtfContador6);
		this.jpnFigurinha6.add(jbtPlus6);
		
		this.jpnFigurinha7.add(jlbFigurinha7);
		this.jpnFigurinha7.add(jbtMinus7);
		this.jpnFigurinha7.add(jtfContador7);
		this.jpnFigurinha7.add(jbtPlus7);
		
		this.jpnFigurinha8.add(jlbFigurinha8);
		this.jpnFigurinha8.add(jbtMinus8);
		this.jpnFigurinha8.add(jtfContador8);
		this.jpnFigurinha8.add(jbtPlus8);
		
		this.jpnFigurinha9.add(jlbFigurinha9);
		this.jpnFigurinha9.add(jbtMinus9);
		this.jpnFigurinha9.add(jtfContador9);
		this.jpnFigurinha9.add(jbtPlus9);
		
		this.jpnFigurinha10.add(jlbFigurinha10);
		this.jpnFigurinha10.add(jbtMinus10);
		this.jpnFigurinha10.add(jtfContador10);
		this.jpnFigurinha10.add(jbtPlus10);

		Faltantes.setBackground(Color.white);
		Repetidas.setBackground(Color.white);
	}
	
	private void configurarDadosMenu(int i) {
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
		this.jtfNome.setBounds(296, 90, 800, 30);

		// Figurinha 1
		
		this.jpnFigurinha1 = new JPanel(null);
		this.jpnFigurinha1.setToolTipText("Figurinha: " + Database.getFWC00().getItensLimitados() + "; Nível de Raridade: " + Database.getFWC00().getNivelRaridade());
		this.jpnFigurinha1.setBounds(94, 50, 200, 200);
		this.jpnFigurinha1.setBackground(new Color(175, 175, 175));
		
		this.jlbFigurinha1 = new JLabel(Database.getFWC00().getSigla() + " " + Database.getFWC00().getCodigo());
		this.jlbFigurinha1.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jlbFigurinha1.setForeground(Color.white);
		this.jlbFigurinha1.setBounds(57, 25, 150, 48);
		
		this.jbtMinus1 = new JButton(new ImageIcon("minus.png"));
		this.jbtMinus1.setBackground(new Color(175, 175, 175));
		this.jbtMinus1.setBorder(new LineBorder(new Color(175, 175, 175)));
		this.jbtMinus1.setBounds(44, 130, 28, 28);
		this.jbtMinus1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == jbtMinus1) {
					minus1(i);
				}
				}
				});
		
		this.jtfContador1 = new JTextField("0");
		this.jtfContador1.setEditable(false);
		this.jtfContador1.setBounds(91, 127, 30, 30);
		this.jtfContador1.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jtfContador1.setBackground(new Color(175, 175, 175));
		this.jtfContador1.setBorder(new LineBorder(new Color(175, 175, 175)));
		this.jtfContador1.setForeground(Color.white);
		
		this.jbtPlus1 = new JButton(new ImageIcon("plus.png"));
		this.jbtPlus1.setBackground(new Color(175, 175, 175));
		this.jbtPlus1.setBorder(new LineBorder(new Color(175, 175, 175)));
		this.jbtPlus1.setBounds(130, 130, 28, 28);
		this.jbtPlus1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == jbtPlus1) {
					plus1(i);
				}
				}
				});
		
		// Figurinha 2
		
		this.jpnFigurinha2 = new JPanel(null);
		this.jpnFigurinha2.setToolTipText("Figurinha: " + Database.getFWC01().getItensLimitados() + "; Nível de Raridade: " + Database.getFWC01().getNivelRaridade());
		this.jpnFigurinha2.setBounds(337, 50, 200, 200);
		this.jpnFigurinha2.setBackground(new Color(175, 175, 175));
		
		this.jlbFigurinha2 = new JLabel(Database.getFWC01().getSigla() + " " + Database.getFWC01().getCodigo());
		this.jlbFigurinha2.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jlbFigurinha2.setForeground(Color.white);
		this.jlbFigurinha2.setBounds(57, 25, 150, 48);
		
		this.jbtMinus2 = new JButton(new ImageIcon("minus.png"));
		this.jbtMinus2.setBackground(new Color(175, 175, 175));
		this.jbtMinus2.setBorder(new LineBorder(new Color(175, 175, 175)));
		this.jbtMinus2.setBounds(44, 130, 28, 28);
		this.jbtMinus2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == jbtMinus2) {
					minus2(i);
				}
				}
				});
		
		this.jtfContador2 = new JTextField("0");
		this.jtfContador2.setEditable(false);
		this.jtfContador2.setBounds(91, 127, 30, 30);
		this.jtfContador2.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jtfContador2.setBackground(new Color(175, 175, 175));
		this.jtfContador2.setBorder(new LineBorder(new Color(175, 175, 175)));
		this.jtfContador2.setForeground(Color.white);
		
		this.jbtPlus2 = new JButton(new ImageIcon("plus.png"));
		this.jbtPlus2.setBackground(new Color(175, 175, 175));
		this.jbtPlus2.setBorder(new LineBorder(new Color(175, 175, 175)));
		this.jbtPlus2.setBounds(130, 130, 28, 28);
		this.jbtPlus2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == jbtPlus2) {
					plus2(i);
				}
				}
				});
		
		// Figurinha 3
		
		this.jpnFigurinha3 = new JPanel(null);
		this.jpnFigurinha3.setToolTipText("Figurinha: " + Database.getFWC02().getItensLimitados() + "; Nível de Raridade: " + Database.getFWC02().getNivelRaridade());
		this.jpnFigurinha3.setBounds(580, 50, 200, 200);
		this.jpnFigurinha3.setBackground(new Color(175, 175, 175));
		
		this.jlbFigurinha3 = new JLabel(Database.getFWC02().getSigla() + " " + Database.getFWC02().getCodigo());
		this.jlbFigurinha3.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jlbFigurinha3.setForeground(Color.white);
		this.jlbFigurinha3.setBounds(57, 25, 150, 48);
		
		this.jbtMinus3 = new JButton(new ImageIcon("minus.png"));
		this.jbtMinus3.setBackground(new Color(175, 175, 175));
		this.jbtMinus3.setBorder(new LineBorder(new Color(175, 175, 175)));
		this.jbtMinus3.setBounds(44, 130, 28, 28);
		this.jbtMinus3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == jbtMinus3) {
					minus3(i);
				}
				}
				});
		
		this.jtfContador3 = new JTextField("0");
		this.jtfContador3.setEditable(false);
		this.jtfContador3.setBounds(91, 127, 30, 30);
		this.jtfContador3.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jtfContador3.setBackground(new Color(175, 175, 175));
		this.jtfContador3.setBorder(new LineBorder(new Color(175, 175, 175)));
		this.jtfContador3.setForeground(Color.white);
		
		this.jbtPlus3 = new JButton(new ImageIcon("plus.png"));
		this.jbtPlus3.setBackground(new Color(175, 175, 175));
		this.jbtPlus3.setBorder(new LineBorder(new Color(175, 175, 175)));
		this.jbtPlus3.setBounds(130, 130, 28, 28);
		this.jbtPlus3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == jbtPlus3) {
					plus3(i);
				}
				}
				});
		
		// Figurinha 4
		
		this.jpnFigurinha4 = new JPanel(null);
		this.jpnFigurinha4.setToolTipText("Figurinha: " + Database.getFWC03().getItensLimitados() + "; Nível de Raridade: " + Database.getFWC03().getNivelRaridade());
		this.jpnFigurinha4.setBounds(824, 50, 200, 200);
		this.jpnFigurinha4.setBackground(new Color(175, 175, 175));
		
		this.jlbFigurinha4 = new JLabel(Database.getFWC03().getSigla() + " " + Database.getFWC03().getCodigo());
		this.jlbFigurinha4.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jlbFigurinha4.setForeground(Color.white);
		this.jlbFigurinha4.setBounds(57, 25, 150, 48);
		
		this.jbtMinus4 = new JButton(new ImageIcon("minus.png"));
		this.jbtMinus4.setBackground(new Color(175, 175, 175));
		this.jbtMinus4.setBorder(new LineBorder(new Color(175, 175, 175)));
		this.jbtMinus4.setBounds(44, 130, 28, 28);
		this.jbtMinus4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == jbtMinus4) {
					minus4(i);
				}
				}
				});
		
		this.jtfContador4 = new JTextField("0");
		this.jtfContador4.setEditable(false);
		this.jtfContador4.setBounds(91, 127, 30, 30);
		this.jtfContador4.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jtfContador4.setBackground(new Color(175, 175, 175));
		this.jtfContador4.setBorder(new LineBorder(new Color(175, 175, 175)));
		this.jtfContador4.setForeground(Color.white);
		
		this.jbtPlus4 = new JButton(new ImageIcon("plus.png"));
		this.jbtPlus4.setBackground(new Color(175, 175, 175));
		this.jbtPlus4.setBorder(new LineBorder(new Color(175, 175, 175)));
		this.jbtPlus4.setBounds(130, 130, 28, 28);
		this.jbtPlus4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == jbtPlus4) {
					plus4(i);
				}
				}
				});
		
		// Figurinha 5
		
		this.jpnFigurinha5 = new JPanel(null);
		this.jpnFigurinha5.setToolTipText("Figurinha: " + Database.getFWC04().getItensLimitados() + "; Nível de Raridade: " + Database.getFWC04().getNivelRaridade());
		this.jpnFigurinha5.setBounds(1068, 50, 200, 200);
		this.jpnFigurinha5.setBackground(new Color(175, 175, 175));
		
		this.jlbFigurinha5 = new JLabel(Database.getFWC04().getSigla() + " " + Database.getFWC04().getCodigo());
		this.jlbFigurinha5.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jlbFigurinha5.setForeground(Color.white);
		this.jlbFigurinha5.setBounds(57, 25, 150, 48);
		
		this.jbtMinus5 = new JButton(new ImageIcon("minus.png"));
		this.jbtMinus5.setBackground(new Color(175, 175, 175));
		this.jbtMinus5.setBorder(new LineBorder(new Color(175, 175, 175)));
		this.jbtMinus5.setBounds(44, 130, 28, 28);
		this.jbtMinus5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == jbtMinus5) {
					minus5(i);
				}
				}
				});
		
		this.jtfContador5 = new JTextField("0");
		this.jtfContador5.setEditable(false);
		this.jtfContador5.setBounds(91, 127, 30, 30);
		this.jtfContador5.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jtfContador5.setBackground(new Color(175, 175, 175));
		this.jtfContador5.setBorder(new LineBorder(new Color(175, 175, 175)));
		this.jtfContador5.setForeground(Color.white);
		
		this.jbtPlus5 = new JButton(new ImageIcon("plus.png"));
		this.jbtPlus5.setBackground(new Color(175, 175, 175));
		this.jbtPlus5.setBorder(new LineBorder(new Color(175, 175, 175)));
		this.jbtPlus5.setBounds(130, 130, 28, 28);
		this.jbtPlus5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == jbtPlus5) {
					plus5(i);
				}
				}
				});
		
		// Figurinha 6
		
		this.jpnFigurinha6 = new JPanel(null);
		this.jpnFigurinha6.setToolTipText("Seleção: " + Database.getQAT1().getSeleção() + "; Figurinha: " + Database.getQAT1().getJogador());
		this.jpnFigurinha6.setBounds(94, 294, 200, 200);
		this.jpnFigurinha6.setBackground(new Color(175, 175, 175));
		
		this.jlbFigurinha6 = new JLabel(Database.getQAT1().getSigla() + " " + Database.getQAT1().getCodigo());
		this.jlbFigurinha6.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jlbFigurinha6.setForeground(Color.white);
		this.jlbFigurinha6.setBounds(57, 25, 150, 48);
		
		this.jbtMinus6 = new JButton(new ImageIcon("minus.png"));
		this.jbtMinus6.setBackground(new Color(175, 175, 175));
		this.jbtMinus6.setBorder(new LineBorder(new Color(175, 175, 175)));
		this.jbtMinus6.setBounds(44, 130, 28, 28);
		this.jbtMinus6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == jbtMinus6) {
					minus6(i);
				}
				}
				});
		
		this.jtfContador6 = new JTextField("0");
		this.jtfContador6.setEditable(false);
		this.jtfContador6.setBounds(91, 127, 30, 30);
		this.jtfContador6.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jtfContador6.setBackground(new Color(175, 175, 175));
		this.jtfContador6.setBorder(new LineBorder(new Color(175, 175, 175)));
		this.jtfContador6.setForeground(Color.white);
		
		this.jbtPlus6 = new JButton(new ImageIcon("plus.png"));
		this.jbtPlus6.setBackground(new Color(175, 175, 175));
		this.jbtPlus6.setBorder(new LineBorder(new Color(175, 175, 175)));
		this.jbtPlus6.setBounds(130, 130, 28, 28);
		this.jbtPlus6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == jbtPlus6) {
					plus6(i);
				}
				}
				});
		
		// Figurinha 7
		
		this.jpnFigurinha7 = new JPanel(null);
		this.jpnFigurinha7.setToolTipText("Seleção: " + Database.getQAT2().getSeleção() + "; Figurinha: " + Database.getQAT2().getJogador());
		this.jpnFigurinha7.setBounds(337, 294, 200, 200);
		this.jpnFigurinha7.setBackground(new Color(175, 175, 175));
		
		this.jlbFigurinha7 = new JLabel(Database.getQAT2().getSigla() + " " + Database.getQAT2().getCodigo());
		this.jlbFigurinha7.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jlbFigurinha7.setForeground(Color.white);
		this.jlbFigurinha7.setBounds(57, 25, 150, 48);
		
		this.jbtMinus7 = new JButton(new ImageIcon("minus.png"));
		this.jbtMinus7.setBackground(new Color(175, 175, 175));
		this.jbtMinus7.setBorder(new LineBorder(new Color(175, 175, 175)));
		this.jbtMinus7.setBounds(44, 130, 28, 28);
		this.jbtMinus7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == jbtMinus7) {
					minus7(i);
				}
				}
				});
		
		this.jtfContador7 = new JTextField("0");
		this.jtfContador7.setEditable(false);
		this.jtfContador7.setBounds(91, 127, 30, 30);
		this.jtfContador7.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jtfContador7.setBackground(new Color(175, 175, 175));
		this.jtfContador7.setBorder(new LineBorder(new Color(175, 175, 175)));
		this.jtfContador7.setForeground(Color.white);
		
		this.jbtPlus7 = new JButton(new ImageIcon("plus.png"));
		this.jbtPlus7.setBackground(new Color(175, 175, 175));
		this.jbtPlus7.setBorder(new LineBorder(new Color(175, 175, 175)));
		this.jbtPlus7.setBounds(130, 130, 28, 28);
		this.jbtPlus7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == jbtPlus7) {
					plus7(i);
				}
				}
				});
		
		// Figurinha 8
		
		this.jpnFigurinha8 = new JPanel(null);
		this.jpnFigurinha8.setToolTipText("Seleção: " + Database.getQAT3().getSeleção() + "; Figurinha: " + Database.getQAT3().getJogador());
		this.jpnFigurinha8.setBounds(580, 294, 200, 200);
		this.jpnFigurinha8.setBackground(new Color(175, 175, 175));
		
		this.jlbFigurinha8 = new JLabel(Database.getQAT3().getSigla() + " " + Database.getQAT3().getCodigo());
		this.jlbFigurinha8.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jlbFigurinha8.setForeground(Color.white);
		this.jlbFigurinha8.setBounds(57, 25, 150, 48);
		
		this.jbtMinus8 = new JButton(new ImageIcon("minus.png"));
		this.jbtMinus8.setBackground(new Color(175, 175, 175));
		this.jbtMinus8.setBorder(new LineBorder(new Color(175, 175, 175)));
		this.jbtMinus8.setBounds(44, 130, 28, 28);
		this.jbtMinus8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == jbtMinus8) {
					minus8(i);
				}
				}
				});
		
		this.jtfContador8 = new JTextField("0");
		this.jtfContador8.setEditable(false);
		this.jtfContador8.setBounds(91, 127, 30, 30);
		this.jtfContador8.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jtfContador8.setBackground(new Color(175, 175, 175));
		this.jtfContador8.setBorder(new LineBorder(new Color(175, 175, 175)));
		this.jtfContador8.setForeground(Color.white);
		
		this.jbtPlus8 = new JButton(new ImageIcon("plus.png"));
		this.jbtPlus8.setBackground(new Color(175, 175, 175));
		this.jbtPlus8.setBorder(new LineBorder(new Color(175, 175, 175)));
		this.jbtPlus8.setBounds(130, 130, 28, 28);
		this.jbtPlus8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == jbtPlus8) {
					plus8(i);
				}
				}
				});
		
		// Figurinha 9
		
		this.jpnFigurinha9 = new JPanel(null);
		this.jpnFigurinha9.setToolTipText("Seleção: " + Database.getQAT4().getSeleção() + "; Figurinha: " + Database.getQAT4().getJogador());
		this.jpnFigurinha9.setBounds(824, 294, 200, 200);
		this.jpnFigurinha9.setBackground(new Color(175, 175, 175));
		
		this.jlbFigurinha9 = new JLabel(Database.getQAT4().getSigla() + " " + Database.getQAT4().getCodigo());
		this.jlbFigurinha9.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jlbFigurinha9.setForeground(Color.white);
		this.jlbFigurinha9.setBounds(57, 25, 150, 48);
		
		this.jbtMinus9 = new JButton(new ImageIcon("minus.png"));
		this.jbtMinus9.setBackground(new Color(175, 175, 175));
		this.jbtMinus9.setBorder(new LineBorder(new Color(175, 175, 175)));
		this.jbtMinus9.setBounds(44, 130, 28, 28);
		this.jbtMinus9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == jbtMinus9) {
					minus9(i);
				}
				}
				});
		
		this.jtfContador9 = new JTextField("0");
		this.jtfContador9.setEditable(false);
		this.jtfContador9.setBounds(91, 127, 30, 30);
		this.jtfContador9.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jtfContador9.setBackground(new Color(175, 175, 175));
		this.jtfContador9.setBorder(new LineBorder(new Color(175, 175, 175)));
		this.jtfContador9.setForeground(Color.white);
		
		this.jbtPlus9 = new JButton(new ImageIcon("plus.png"));
		this.jbtPlus9.setBackground(new Color(175, 175, 175));
		this.jbtPlus9.setBorder(new LineBorder(new Color(175, 175, 175)));
		this.jbtPlus9.setBounds(130, 130, 28, 28);
		this.jbtPlus9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == jbtPlus9) {
					plus9(i);
				}
				}
				});
		
		// Figurinha 10
		
		this.jpnFigurinha10 = new JPanel(null);
		this.jpnFigurinha10.setToolTipText("Seleção: " + Database.getQAT5().getSeleção() + "; Figurinha: " + Database.getQAT5().getJogador());
		this.jpnFigurinha10.setBounds(1068, 294, 200, 200);
		this.jpnFigurinha10.setBackground(new Color(175, 175, 175));
		
		this.jlbFigurinha10 = new JLabel(Database.getQAT5().getSigla() + " " + Database.getQAT5().getCodigo());
		this.jlbFigurinha10.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jlbFigurinha10.setForeground(Color.white);
		this.jlbFigurinha10.setBounds(57, 25, 150, 48);
		
		this.jbtMinus10 = new JButton(new ImageIcon("minus.png"));
		this.jbtMinus10.setBackground(new Color(175, 175, 175));
		this.jbtMinus10.setBorder(new LineBorder(new Color(175, 175, 175)));
		this.jbtMinus10.setBounds(44, 130, 28, 28);
		this.jbtMinus10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == jbtMinus10) {
					minus10(i);
				}
				}
				});
		
		this.jtfContador10 = new JTextField("0");
		this.jtfContador10.setEditable(false);
		this.jtfContador10.setBounds(91, 127, 30, 30);
		this.jtfContador10.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jtfContador10.setBackground(new Color(175, 175, 175));
		this.jtfContador10.setBorder(new LineBorder(new Color(175, 175, 175)));
		this.jtfContador10.setForeground(Color.white);
		
		this.jbtPlus10 = new JButton(new ImageIcon("plus.png"));
		this.jbtPlus10.setBackground(new Color(175, 175, 175));
		this.jbtPlus10.setBorder(new LineBorder(new Color(175, 175, 175)));
		this.jbtPlus10.setBounds(130, 130, 28, 28);
		this.jbtPlus10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == jbtPlus10) {
					plus10(i);
				}
				}
				});
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
	
	public void minus1(int i) {
		
	 /*	String quantidade = this.jtfContador1.getText();
		int qtd = Integer.parseInt(quantidade);	
		
		ControleProprietario alterarQuantidade = new ControleProprietario();
		alterarQuantidade.alterarQuantidade(qtd);*/
		
		--number1;
		
		this.jtfContador1.setText("" + number1);
		
		if(number1 == 0){
			this.jpnFigurinha1.setBackground(new Color(175, 175, 175));
			this.jbtMinus1.setBackground(new Color(175, 175, 175));
			this.jbtPlus1.setBackground(new Color(175, 175, 175));
			this.jtfContador1.setBackground(new Color(175, 175, 175));
			this.jbtMinus1.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jbtPlus1.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jtfContador1.setBorder(new LineBorder(new Color(175, 175, 175)));
			System.out.println("");
			System.out.println("Voce removeu a figurinha: " + Database.getFWC00().getSigla() + " " + Database.getFWC00().getCodigo() + ", do Album: " + ControleProprietario.proprietario.getAlbumFigurinha().get(i).getNome());
		} else if (number1 > 0) {
			this.jpnFigurinha1.setBackground(new Color(113, 204, 122));
			this.jbtMinus1.setBackground(new Color(113, 204, 122));
			this.jbtPlus1.setBackground(new Color(113, 204, 122));
			this.jtfContador1.setBackground(new Color(113, 204, 122));
			this.jbtMinus1.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jbtPlus1.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jtfContador1.setBorder(new LineBorder(new Color(113, 204, 122)));
			System.out.println("");
			System.out.println("Voce removeu a figurinha: " + Database.getFWC00().getSigla() + " " + Database.getFWC00().getCodigo() + ", do Album: " + ControleProprietario.proprietario.getAlbumFigurinha().get(i).getNome());
		} else if (number1 < 0) {
			number1 = 0;
			this.jtfContador1.setText("0");
			JOptionPane.showMessageDialog(null, "Voce atingiu o limite mínimo para essa figurinha!");	
		} 
	}
	
	public void plus1(int i) {
		
		/*String quantidade = this.jtfContador1.getText();
		int qtd = Integer.parseInt(quantidade);	
		
		ControleProprietario alterarQuantidade = new ControleProprietario();
		alterarQuantidade.alterarQuantidade(qtd);*/
		
		++number1;
		
		this.jtfContador1.setText("" + number1);
		
		if(number1 == 0){
			this.jpnFigurinha1.setBackground(new Color(175, 175, 175));
			this.jbtMinus1.setBackground(new Color(175, 175, 175));
			this.jbtPlus1.setBackground(new Color(175, 175, 175));
			this.jtfContador1.setBackground(new Color(175, 175, 175));
			this.jbtMinus1.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jbtPlus1.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jtfContador1.setBorder(new LineBorder(new Color(175, 175, 175)));
		} else if (number1 > 9) {
			number1 = 9;
			this.jtfContador1.setText("9");
			JOptionPane.showMessageDialog(null, "Voce atingiu o limite máximo para essa figurinha!");	
		} else if (number1 > 0) {
			this.jpnFigurinha1.setBackground(new Color(113, 204, 122));
			this.jbtMinus1.setBackground(new Color(113, 204, 122));
			this.jbtPlus1.setBackground(new Color(113, 204, 122));
			this.jtfContador1.setBackground(new Color(113, 204, 122));
			this.jbtMinus1.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jbtPlus1.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jtfContador1.setBorder(new LineBorder(new Color(113, 204, 122)));
			System.out.println("");
			System.out.println("Voce adicionou a figurinha: " + Database.getFWC00().getSigla() + " " + Database.getFWC00().getCodigo() + ", no Album: " + ControleProprietario.proprietario.getAlbumFigurinha().get(i).getNome());
		}
	}
	
	public void minus2(int i) {
		--number2;
		
		this.jtfContador2.setText("" + number2);
		
		if(number2 == 0){
			this.jpnFigurinha2.setBackground(new Color(175, 175, 175));
			this.jbtMinus2.setBackground(new Color(175, 175, 175));
			this.jbtPlus2.setBackground(new Color(175, 175, 175));
			this.jtfContador2.setBackground(new Color(175, 175, 175));
			this.jbtMinus2.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jbtPlus2.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jtfContador2.setBorder(new LineBorder(new Color(175, 175, 175)));
			System.out.println("");
			System.out.println("Voce removeu a figurinha: " + Database.getFWC01().getSigla() + " " + Database.getFWC01().getCodigo() + ", do Album: " + ControleProprietario.proprietario.getAlbumFigurinha().get(i).getNome());
		} else if (number2 > 0) {
			this.jpnFigurinha2.setBackground(new Color(113, 204, 122));
			this.jbtMinus2.setBackground(new Color(113, 204, 122));
			this.jbtPlus2.setBackground(new Color(113, 204, 122));
			this.jtfContador2.setBackground(new Color(113, 204, 122));
			this.jbtMinus2.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jbtPlus2.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jtfContador2.setBorder(new LineBorder(new Color(113, 204, 122)));
			System.out.println("");
			System.out.println("Voce removeu a figurinha: " + Database.getFWC01().getSigla() + " " + Database.getFWC01().getCodigo() + ", do Album: " + ControleProprietario.proprietario.getAlbumFigurinha().get(i).getNome());
		} else if (number2 < 0) {
			number2 = 0;
			this.jtfContador2.setText("0");
			JOptionPane.showMessageDialog(null, "Voce atingiu o limite mínimo para essa figurinha!");	
		}
	}
	
	public void plus2(int i) {
		++number2;
		
		this.jtfContador2.setText("" + number2);

		if(number2 == 0){
			this.jpnFigurinha2.setBackground(new Color(175, 175, 175));
			this.jbtMinus2.setBackground(new Color(175, 175, 175));
			this.jbtPlus2.setBackground(new Color(175, 175, 175));
			this.jtfContador2.setBackground(new Color(175, 175, 175));
			this.jbtMinus2.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jbtPlus2.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jtfContador2.setBorder(new LineBorder(new Color(175, 175, 175)));
		} else if (number2 > 9) {
			number2 = 9;
			this.jtfContador2.setText("9");
			JOptionPane.showMessageDialog(null, "Voce atingiu o limite máximo para essa figurinha!");	
		} else if (number2 > 0) {
			this.jpnFigurinha2.setBackground(new Color(113, 204, 122));
			this.jbtMinus2.setBackground(new Color(113, 204, 122));
			this.jbtPlus2.setBackground(new Color(113, 204, 122));
			this.jtfContador2.setBackground(new Color(113, 204, 122));
			this.jbtMinus2.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jbtPlus2.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jtfContador2.setBorder(new LineBorder(new Color(113, 204, 122)));
			System.out.println("");
			System.out.println("Voce adicionou a figurinha: " + Database.getFWC01().getSigla() + " " + Database.getFWC01().getCodigo() + ", no Album: " + ControleProprietario.proprietario.getAlbumFigurinha().get(i).getNome());
		}
	}
	
	public void minus3(int i) {
		--number3;
		
		this.jtfContador3.setText("" + number3);

		if(number3 == 0){
			this.jpnFigurinha3.setBackground(new Color(175, 175, 175));
			this.jbtMinus3.setBackground(new Color(175, 175, 175));
			this.jbtPlus3.setBackground(new Color(175, 175, 175));
			this.jtfContador3.setBackground(new Color(175, 175, 175));
			this.jbtMinus3.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jbtPlus3.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jtfContador3.setBorder(new LineBorder(new Color(175, 175, 175)));
			System.out.println("");
			System.out.println("Voce removeu a figurinha: " + Database.getFWC02().getSigla() + " " + Database.getFWC02().getCodigo() + ", do Album: " + ControleProprietario.proprietario.getAlbumFigurinha().get(i).getNome());
		} else if (number3 > 0) {
			this.jpnFigurinha3.setBackground(new Color(113, 204, 122));
			this.jbtMinus3.setBackground(new Color(113, 204, 122));
			this.jbtPlus3.setBackground(new Color(113, 204, 122));
			this.jtfContador3.setBackground(new Color(113, 204, 122));
			this.jbtMinus3.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jbtPlus3.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jtfContador3.setBorder(new LineBorder(new Color(113, 204, 122)));
			System.out.println("");
			System.out.println("Voce removeu a figurinha: " + Database.getFWC02().getSigla() + " " + Database.getFWC02().getCodigo() + ", do Album: " + ControleProprietario.proprietario.getAlbumFigurinha().get(i).getNome());
		} else if (number3 < 0) {
			number3 = 0;
			this.jtfContador3.setText("0");
			JOptionPane.showMessageDialog(null, "Voce atingiu o limite mínimo para essa figurinha!");	
		}
	}
	
	public void plus3(int i) {
		++number3;
		
		this.jtfContador3.setText("" + number3);

		if(number3 == 0){
			this.jpnFigurinha3.setBackground(new Color(175, 175, 175));
			this.jbtMinus3.setBackground(new Color(175, 175, 175));
			this.jbtPlus3.setBackground(new Color(175, 175, 175));
			this.jtfContador3.setBackground(new Color(175, 175, 175));
			this.jbtMinus3.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jbtPlus3.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jtfContador3.setBorder(new LineBorder(new Color(175, 175, 175)));
		} else if (number3 > 9) {
			number3 = 9;
			this.jtfContador3.setText("9");
			JOptionPane.showMessageDialog(null, "Voce atingiu o limite máximo para essa figurinha!");	
		} else if (number3 > 0) {
			this.jpnFigurinha3.setBackground(new Color(113, 204, 122));
			this.jbtMinus3.setBackground(new Color(113, 204, 122));
			this.jbtPlus3.setBackground(new Color(113, 204, 122));
			this.jtfContador3.setBackground(new Color(113, 204, 122));
			this.jbtMinus3.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jbtPlus3.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jtfContador3.setBorder(new LineBorder(new Color(113, 204, 122)));
			System.out.println("");
			System.out.println("Voce adicionou a figurinha: " + Database.getFWC02().getSigla() + " " + Database.getFWC02().getCodigo() + ", no Album: " + ControleProprietario.proprietario.getAlbumFigurinha().get(i).getNome());
		} 
	}
	
	public void minus4(int i) {
		--number4;
		
		this.jtfContador4.setText("" + number4);

		if(number4 == 0){
			this.jpnFigurinha4.setBackground(new Color(175, 175, 175));
			this.jbtMinus4.setBackground(new Color(175, 175, 175));
			this.jbtPlus4.setBackground(new Color(175, 175, 175));
			this.jtfContador4.setBackground(new Color(175, 175, 175));
			this.jbtMinus4.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jbtPlus4.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jtfContador4.setBorder(new LineBorder(new Color(175, 175, 175)));
			System.out.println("");
			System.out.println("Voce removeu a figurinha: " + Database.getFWC03().getSigla() + " " + Database.getFWC03().getCodigo() + ", do Album: " + ControleProprietario.proprietario.getAlbumFigurinha().get(i).getNome());
		} else if (number4 > 0) {
			this.jpnFigurinha4.setBackground(new Color(113, 204, 122));
			this.jbtMinus4.setBackground(new Color(113, 204, 122));
			this.jbtPlus4.setBackground(new Color(113, 204, 122));
			this.jtfContador4.setBackground(new Color(113, 204, 122));
			this.jbtMinus4.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jbtPlus4.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jtfContador4.setBorder(new LineBorder(new Color(113, 204, 122)));
			System.out.println("");
			System.out.println("Voce removeu a figurinha: " + Database.getFWC03().getSigla() + " " + Database.getFWC03().getCodigo() + ", do Album: " + ControleProprietario.proprietario.getAlbumFigurinha().get(i).getNome());
		} else if (number4 < 0) {
			number4 = 0;
			this.jtfContador4.setText("0");
			JOptionPane.showMessageDialog(null, "Voce atingiu o limite mínimo para essa figurinha!");	
		}
	}
	
	public void plus4(int i) {
		++number4;
		
		this.jtfContador4.setText("" + number4);

		if(number4 == 0){
			this.jpnFigurinha4.setBackground(new Color(175, 175, 175));
			this.jbtMinus4.setBackground(new Color(175, 175, 175));
			this.jbtPlus4.setBackground(new Color(175, 175, 175));
			this.jtfContador4.setBackground(new Color(175, 175, 175));
			this.jbtMinus4.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jbtPlus4.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jtfContador4.setBorder(new LineBorder(new Color(175, 175, 175)));
		} else if (number4 > 9) {
			number4 = 9;
			this.jtfContador4.setText("9");
			JOptionPane.showMessageDialog(null, "Voce atingiu o limite máximo para essa figurinha!");	
		} else if (number4 > 0) {
			this.jpnFigurinha4.setBackground(new Color(113, 204, 122));
			this.jbtMinus4.setBackground(new Color(113, 204, 122));
			this.jbtPlus4.setBackground(new Color(113, 204, 122));
			this.jtfContador4.setBackground(new Color(113, 204, 122));
			this.jbtMinus4.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jbtPlus4.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jtfContador4.setBorder(new LineBorder(new Color(113, 204, 122)));
			System.out.println("");
			System.out.println("Voce adicionou a figurinha: " + Database.getFWC03().getSigla() + " " + Database.getFWC03().getCodigo() + ", no Album: " + ControleProprietario.proprietario.getAlbumFigurinha().get(i).getNome());
		}
	}
	
	public void minus5(int i) {
		--number5;
		
		this.jtfContador5.setText("" + number5);

		if(number5 == 0){
			this.jpnFigurinha5.setBackground(new Color(175, 175, 175));
			this.jbtMinus5.setBackground(new Color(175, 175, 175));
			this.jbtPlus5.setBackground(new Color(175, 175, 175));
			this.jtfContador5.setBackground(new Color(175, 175, 175));
			this.jbtMinus5.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jbtPlus5.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jtfContador5.setBorder(new LineBorder(new Color(175, 175, 175)));
			System.out.println("");
			System.out.println("Voce removeu a figurinha: " + Database.getFWC04().getSigla() + " " + Database.getFWC04().getCodigo() + ", do Album: " + ControleProprietario.proprietario.getAlbumFigurinha().get(i).getNome());
		} else if (number5 > 0) {
			this.jpnFigurinha5.setBackground(new Color(113, 204, 122));
			this.jbtMinus5.setBackground(new Color(113, 204, 122));
			this.jbtPlus5.setBackground(new Color(113, 204, 122));
			this.jtfContador5.setBackground(new Color(113, 204, 122));
			this.jbtMinus5.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jbtPlus5.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jtfContador5.setBorder(new LineBorder(new Color(113, 204, 122)));
			System.out.println("");
			System.out.println("Voce removeu a figurinha: " + Database.getFWC04().getSigla() + " " + Database.getFWC04().getCodigo() + ", do Album: " + ControleProprietario.proprietario.getAlbumFigurinha().get(i).getNome());
		} else if (number5 < 0) {
			number5 = 0;
			this.jtfContador5.setText("0");
			JOptionPane.showMessageDialog(null, "Voce atingiu o limite mínimo para essa figurinha!");	
		}
	}
	
	public void plus5(int i) {
		++number5;
		
		this.jtfContador5.setText("" + number5);

		if(number5 == 0){
			this.jpnFigurinha5.setBackground(new Color(175, 175, 175));
			this.jbtMinus5.setBackground(new Color(175, 175, 175));
			this.jbtPlus5.setBackground(new Color(175, 175, 175));
			this.jtfContador5.setBackground(new Color(175, 175, 175));
			this.jbtMinus5.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jbtPlus5.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jtfContador5.setBorder(new LineBorder(new Color(175, 175, 175)));
		} else if (number5 > 9) {
			number5 = 9;
			this.jtfContador5.setText("9");
			JOptionPane.showMessageDialog(null, "Voce atingiu o limite máximo para essa figurinha!");	
		} else if (number5 > 0) {
			this.jpnFigurinha5.setBackground(new Color(113, 204, 122));
			this.jbtMinus5.setBackground(new Color(113, 204, 122));
			this.jbtPlus5.setBackground(new Color(113, 204, 122));
			this.jtfContador5.setBackground(new Color(113, 204, 122));
			this.jbtMinus5.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jbtPlus5.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jtfContador5.setBorder(new LineBorder(new Color(113, 204, 122)));
			System.out.println("");
			System.out.println("Voce adicionou a figurinha: " + Database.getFWC04().getSigla() + " " + Database.getFWC04().getCodigo() + ", no Album: " + ControleProprietario.proprietario.getAlbumFigurinha().get(i).getNome());
		}
	}
	
	public void minus6(int i) {
		--number6;
		
		this.jtfContador6.setText("" + number6);

		if(number6 == 0){
			this.jpnFigurinha6.setBackground(new Color(175, 175, 175));
			this.jbtMinus6.setBackground(new Color(175, 175, 175));
			this.jbtPlus6.setBackground(new Color(175, 175, 175));
			this.jtfContador6.setBackground(new Color(175, 175, 175));
			this.jbtMinus6.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jbtPlus6.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jtfContador6.setBorder(new LineBorder(new Color(175, 175, 175)));
			System.out.println("");
			System.out.println("Voce removeu a figurinha: " + Database.getQAT1().getSigla() + " " + Database.getQAT1().getCodigo() + ", do Album: " + ControleProprietario.proprietario.getAlbumFigurinha().get(i).getNome());
		} else if (number6 > 0) {
			this.jpnFigurinha6.setBackground(new Color(113, 204, 122));
			this.jbtMinus6.setBackground(new Color(113, 204, 122));
			this.jbtPlus6.setBackground(new Color(113, 204, 122));
			this.jtfContador6.setBackground(new Color(113, 204, 122));
			this.jbtMinus6.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jbtPlus6.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jtfContador6.setBorder(new LineBorder(new Color(113, 204, 122)));
			System.out.println("");
			System.out.println("Voce removeu a figurinha: " + Database.getQAT1().getSigla() + " " + Database.getQAT1().getCodigo() + ", do Album: " + ControleProprietario.proprietario.getAlbumFigurinha().get(i).getNome());
		} else if (number6 < 0) {
			number6 = 0;
			this.jtfContador6.setText("0");
			JOptionPane.showMessageDialog(null, "Voce atingiu o limite mínimo para essa figurinha!");	
		}
	}
	
	public void plus6(int i) {
		++number6;
		
		this.jtfContador6.setText("" + number6);

		if(number6 == 0){
			this.jpnFigurinha6.setBackground(new Color(175, 175, 175));
			this.jbtMinus6.setBackground(new Color(175, 175, 175));
			this.jbtPlus6.setBackground(new Color(175, 175, 175));
			this.jtfContador6.setBackground(new Color(175, 175, 175));
			this.jbtMinus6.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jbtPlus6.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jtfContador6.setBorder(new LineBorder(new Color(175, 175, 175)));
		} else if (number6 > 9) {
			number6 = 9;
			this.jtfContador6.setText("9");
			JOptionPane.showMessageDialog(null, "Voce atingiu o limite máximo para essa figurinha!");	
		} else if (number6 > 0) {
			this.jpnFigurinha6.setBackground(new Color(113, 204, 122));
			this.jbtMinus6.setBackground(new Color(113, 204, 122));
			this.jbtPlus6.setBackground(new Color(113, 204, 122));
			this.jtfContador6.setBackground(new Color(113, 204, 122));
			this.jbtMinus6.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jbtPlus6.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jtfContador6.setBorder(new LineBorder(new Color(113, 204, 122)));
			System.out.println("");
			System.out.println("Voce adicionou a figurinha: " + Database.getQAT1().getSigla() + " " + Database.getQAT1().getCodigo() + ", no Album: " + ControleProprietario.proprietario.getAlbumFigurinha().get(i).getNome());
		}
	}
	
	public void minus7(int i) {
		--number7;
		
		this.jtfContador7.setText("" + number7);

		if(number7 == 0){
			this.jpnFigurinha7.setBackground(new Color(175, 175, 175));
			this.jbtMinus7.setBackground(new Color(175, 175, 175));
			this.jbtPlus7.setBackground(new Color(175, 175, 175));
			this.jtfContador7.setBackground(new Color(175, 175, 175));
			this.jbtMinus7.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jbtPlus7.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jtfContador7.setBorder(new LineBorder(new Color(175, 175, 175)));
			System.out.println("");
			System.out.println("Voce removeu a figurinha: " + Database.getQAT2().getSigla() + " " + Database.getQAT2().getCodigo() + ", do Album: " + ControleProprietario.proprietario.getAlbumFigurinha().get(i).getNome());
		} else if (number7 > 0) {
			this.jpnFigurinha7.setBackground(new Color(113, 204, 122));
			this.jbtMinus7.setBackground(new Color(113, 204, 122));
			this.jbtPlus7.setBackground(new Color(113, 204, 122));
			this.jtfContador7.setBackground(new Color(113, 204, 122));
			this.jbtMinus7.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jbtPlus7.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jtfContador7.setBorder(new LineBorder(new Color(113, 204, 122)));
			System.out.println("");
			System.out.println("Voce removeu a figurinha: " + Database.getQAT2().getSigla() + " " + Database.getQAT2().getCodigo() + ", do Album: " + ControleProprietario.proprietario.getAlbumFigurinha().get(i).getNome());
		} else if (number7 < 0) {
			number7 = 0;
			this.jtfContador7.setText("0");
			JOptionPane.showMessageDialog(null, "Voce atingiu o limite mínimo para essa figurinha!");	
		}
	}
	
	public void plus7(int i) {
		++number7;
		
		this.jtfContador7.setText("" + number7);

		if(number7 == 0){
			this.jpnFigurinha7.setBackground(new Color(175, 175, 175));
			this.jbtMinus7.setBackground(new Color(175, 175, 175));
			this.jbtPlus7.setBackground(new Color(175, 175, 175));
			this.jtfContador7.setBackground(new Color(175, 175, 175));
			this.jbtMinus7.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jbtPlus7.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jtfContador7.setBorder(new LineBorder(new Color(175, 175, 175)));
		} else if (number7 > 9) {
			number7 = 9;
			this.jtfContador7.setText("9");
			JOptionPane.showMessageDialog(null, "Voce atingiu o limite máximo para essa figurinha!");	
		} else if (number7 > 0) {
			this.jpnFigurinha7.setBackground(new Color(113, 204, 122));
			this.jbtMinus7.setBackground(new Color(113, 204, 122));
			this.jbtPlus7.setBackground(new Color(113, 204, 122));
			this.jtfContador7.setBackground(new Color(113, 204, 122));
			this.jbtMinus7.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jbtPlus7.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jtfContador7.setBorder(new LineBorder(new Color(113, 204, 122)));
			System.out.println("");
			System.out.println("Voce adicionou a figurinha: " + Database.getQAT2().getSigla() + " " + Database.getQAT2().getCodigo() + ", no Album: " + ControleProprietario.proprietario.getAlbumFigurinha().get(i).getNome());
		} 
	} 
	
	public void minus8(int i) {
		--number8;
		
		this.jtfContador8.setText("" + number8);

		if(number8 == 0){
			this.jpnFigurinha8.setBackground(new Color(175, 175, 175));
			this.jbtMinus8.setBackground(new Color(175, 175, 175));
			this.jbtPlus8.setBackground(new Color(175, 175, 175));
			this.jtfContador8.setBackground(new Color(175, 175, 175));
			this.jbtMinus8.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jbtPlus8.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jtfContador8.setBorder(new LineBorder(new Color(175, 175, 175)));
			System.out.println("");
			System.out.println("Voce removeu a figurinha: " + Database.getQAT3().getSigla() + " " + Database.getQAT3().getCodigo() + ", do Album: " + ControleProprietario.proprietario.getAlbumFigurinha().get(i).getNome());
		} else if (number8 > 0) {
			this.jpnFigurinha8.setBackground(new Color(113, 204, 122));
			this.jbtMinus8.setBackground(new Color(113, 204, 122));
			this.jbtPlus8.setBackground(new Color(113, 204, 122));
			this.jtfContador8.setBackground(new Color(113, 204, 122));
			this.jbtMinus8.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jbtPlus8.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jtfContador8.setBorder(new LineBorder(new Color(113, 204, 122)));
			System.out.println("");
			System.out.println("Voce removeu a figurinha: " + Database.getQAT3().getSigla() + " " + Database.getQAT3().getCodigo() + ", do Album: " + ControleProprietario.proprietario.getAlbumFigurinha().get(i).getNome());
		} else if (number8 < 0) {
			number8 = 0;
			this.jtfContador8.setText("0");
			JOptionPane.showMessageDialog(null, "Voce atingiu o limite mínimo para essa figurinha!");	
		}
	}
	
	public void plus8(int i) {
		++number8;
		
		this.jtfContador8.setText("" + number8);

		if(number8 == 0){
			this.jpnFigurinha8.setBackground(new Color(175, 175, 175));
			this.jbtMinus8.setBackground(new Color(175, 175, 175));
			this.jbtPlus8.setBackground(new Color(175, 175, 175));
			this.jtfContador8.setBackground(new Color(175, 175, 175));
			this.jbtMinus8.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jbtPlus8.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jtfContador8.setBorder(new LineBorder(new Color(175, 175, 175)));
		} else if (number8 > 9) {
			number8 = 9;
			this.jtfContador8.setText("9");
			JOptionPane.showMessageDialog(null, "Voce atingiu o limite máximo para essa figurinha!");	
		} else if (number8 > 0) {
			this.jpnFigurinha8.setBackground(new Color(113, 204, 122));
			this.jbtMinus8.setBackground(new Color(113, 204, 122));
			this.jbtPlus8.setBackground(new Color(113, 204, 122));
			this.jtfContador8.setBackground(new Color(113, 204, 122));
			this.jbtMinus8.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jbtPlus8.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jtfContador8.setBorder(new LineBorder(new Color(113, 204, 122)));
			System.out.println("");
			System.out.println("Voce adicionou a figurinha: " + Database.getQAT3().getSigla() + " " + Database.getQAT3().getCodigo() + ", no Album: " + ControleProprietario.proprietario.getAlbumFigurinha().get(i).getNome());
		}
	}
	
	public void minus9(int i) {
		--number9;
		
		this.jtfContador9.setText("" + number9);

		if(number9 == 0){
			this.jpnFigurinha9.setBackground(new Color(175, 175, 175));
			this.jbtMinus9.setBackground(new Color(175, 175, 175));
			this.jbtPlus9.setBackground(new Color(175, 175, 175));
			this.jtfContador9.setBackground(new Color(175, 175, 175));
			this.jbtMinus9.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jbtPlus9.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jtfContador9.setBorder(new LineBorder(new Color(175, 175, 175)));
			System.out.println("");
			System.out.println("Voce removeu a figurinha: " + Database.getQAT4().getSigla() + " " + Database.getQAT4().getCodigo() + ", do Album: " + ControleProprietario.proprietario.getAlbumFigurinha().get(i).getNome());
		} else if (number9 > 0) {
			this.jpnFigurinha9.setBackground(new Color(113, 204, 122));
			this.jbtMinus9.setBackground(new Color(113, 204, 122));
			this.jbtPlus9.setBackground(new Color(113, 204, 122));
			this.jtfContador9.setBackground(new Color(113, 204, 122));
			this.jbtMinus9.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jbtPlus9.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jtfContador9.setBorder(new LineBorder(new Color(113, 204, 122)));
			System.out.println("");
			System.out.println("Voce removeu a figurinha: " + Database.getQAT4().getSigla() + " " + Database.getQAT4().getCodigo() + ", do Album: " + ControleProprietario.proprietario.getAlbumFigurinha().get(i).getNome());
		} else if (number9 < 0) {
			number9 = 0;
			this.jtfContador9.setText("0");
			JOptionPane.showMessageDialog(null, "Voce atingiu o limite mínimo para essa figurinha!");	
		}
	}
	
	public void plus9(int i) {
		++number9;
		
		this.jtfContador9.setText("" + number9);

		if(number9 == 0){
			this.jpnFigurinha9.setBackground(new Color(175, 175, 175));
			this.jbtMinus9.setBackground(new Color(175, 175, 175));
			this.jbtPlus9.setBackground(new Color(175, 175, 175));
			this.jtfContador9.setBackground(new Color(175, 175, 175));
			this.jbtMinus9.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jbtPlus9.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jtfContador9.setBorder(new LineBorder(new Color(175, 175, 175)));
		} else if (number9 > 9) {
			number9 = 9;
			this.jtfContador9.setText("9");
			JOptionPane.showMessageDialog(null, "Voce atingiu o limite máximo para essa figurinha!");	
		} else if (number9 > 0) {
			this.jpnFigurinha9.setBackground(new Color(113, 204, 122));
			this.jbtMinus9.setBackground(new Color(113, 204, 122));
			this.jbtPlus9.setBackground(new Color(113, 204, 122));
			this.jtfContador9.setBackground(new Color(113, 204, 122));
			this.jbtMinus9.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jbtPlus9.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jtfContador9.setBorder(new LineBorder(new Color(113, 204, 122)));
			System.out.println("");
			System.out.println("Voce adicionou a figurinha: " + Database.getQAT4().getSigla() + " " + Database.getQAT4().getCodigo() + ", no Album: " + ControleProprietario.proprietario.getAlbumFigurinha().get(i).getNome());
		}
	}
	
	public void minus10(int i) {
		--number10;
		
		this.jtfContador10.setText("" + number10);

		if(number10 == 0){
			this.jpnFigurinha10.setBackground(new Color(175, 175, 175));
			this.jbtMinus10.setBackground(new Color(175, 175, 175));
			this.jbtPlus10.setBackground(new Color(175, 175, 175));
			this.jtfContador10.setBackground(new Color(175, 175, 175));
			this.jbtMinus10.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jbtPlus10.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jtfContador10.setBorder(new LineBorder(new Color(175, 175, 175)));
			System.out.println("");
			System.out.println("Voce removeu a figurinha: " + Database.getQAT5().getSigla() + " " + Database.getQAT5().getCodigo() + ", do Album: " + ControleProprietario.proprietario.getAlbumFigurinha().get(i).getNome());
		} else if (number10 > 0) {
			this.jpnFigurinha10.setBackground(new Color(113, 204, 122));
			this.jbtMinus10.setBackground(new Color(113, 204, 122));
			this.jbtPlus10.setBackground(new Color(113, 204, 122));
			this.jtfContador10.setBackground(new Color(113, 204, 122));
			this.jbtMinus10.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jbtPlus10.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jtfContador10.setBorder(new LineBorder(new Color(113, 204, 122)));
			System.out.println("");
			System.out.println("Voce removeu a figurinha: " + Database.getQAT5().getSigla() + " " + Database.getQAT5().getCodigo() + ", do Album: " + ControleProprietario.proprietario.getAlbumFigurinha().get(i).getNome());
		} else if (number10 < 0) {
			number10 = 0;
			this.jtfContador10.setText("0");
			JOptionPane.showMessageDialog(null, "Voce atingiu o limite mínimo para essa figurinha!");	
		}
	}
	
	public void plus10(int i) {
		++number10;
		
		this.jtfContador10.setText("" + number10);

		if(number10 == 0){
			this.jpnFigurinha10.setBackground(new Color(175, 175, 175));
			this.jbtMinus10.setBackground(new Color(175, 175, 175));
			this.jbtPlus10.setBackground(new Color(175, 175, 175));
			this.jtfContador10.setBackground(new Color(175, 175, 175));
			this.jbtMinus10.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jbtPlus10.setBorder(new LineBorder(new Color(175, 175, 175)));
			this.jtfContador10.setBorder(new LineBorder(new Color(175, 175, 175)));
			
		} else if (number10 > 9) {
			number10 = 9;
			this.jtfContador10.setText("9");
			JOptionPane.showMessageDialog(null, "Voce atingiu o limite máximo para essa figurinha!");	
		} else if (number10 > 0) {
			this.jpnFigurinha10.setBackground(new Color(113, 204, 122));
			this.jbtMinus10.setBackground(new Color(113, 204, 122));
			this.jbtPlus10.setBackground(new Color(113, 204, 122));
			this.jtfContador10.setBackground(new Color(113, 204, 122));
			this.jbtMinus10.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jbtPlus10.setBorder(new LineBorder(new Color(113, 204, 122)));
			this.jtfContador10.setBorder(new LineBorder(new Color(113, 204, 122)));
			System.out.println("");
			System.out.println("Voce adicionou a figurinha: " + Database.getQAT5().getSigla() + " " + Database.getQAT5().getCodigo() + ", no Album: " + ControleProprietario.proprietario.getAlbumFigurinha().get(i).getNome());
		}
	}
	
	public void dell(int i) {	
		int r = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o album?", "Atenção!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
		if(r == JOptionPane.YES_OPTION){
			ControleProprietario excluir = new ControleProprietario();
			excluir.deletarAlbum(ControleProprietario.proprietario.getAlbumFigurinha().get(i));
			ControleProprietario voltarMeusAlbuns = new ControleProprietario();
			voltarMeusAlbuns.voltarMeusAlbuns();
			
			PanelAlbumQatar.this.dispose();
		} else if (r == JOptionPane.NO_OPTION) {
		}
	}	
	
	public void edit(int i) {	
		JOptionPane.showMessageDialog(null, "Nome alterado com sucesso!");	
		ControleProprietario proprietario = new ControleProprietario();
	    String nome = this.jtfNome.getText().toString();
	    proprietario.editarAlbum(nome, i);
	}	

	public void actionPerformed(ActionEvent e) {
	}
}