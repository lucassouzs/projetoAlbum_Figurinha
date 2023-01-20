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
	
	// Figurinhas
	
	private JPanel jpnFigurinha1;
	private JPanel jpnFigurinha2;
	private JPanel jpnFigurinha3;
	private JPanel jpnFigurinha4;
	private JPanel jpnFigurinha5;
	private JPanel jpnFigurinha6;
	private JPanel jpnFigurinha7;
	private JPanel jpnFigurinha8;
	private JPanel jpnFigurinha9;
	private JPanel jpnFigurinha10;
	
	private JLabel jlbFigurinha1;
	private JLabel jlbFigurinha2;
	private JLabel jlbFigurinha3;
	private JLabel jlbFigurinha4;
	private JLabel jlbFigurinha5;
	private JLabel jlbFigurinha6;
	private JLabel jlbFigurinha7;
	private JLabel jlbFigurinha8;
	private JLabel jlbFigurinha9;
	private JLabel jlbFigurinha10;
	
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
		this.jpnFigurinha2.add(jlbFigurinha2);
		this.jpnFigurinha3.add(jlbFigurinha3);
		this.jpnFigurinha4.add(jlbFigurinha4);
		this.jpnFigurinha5.add(jlbFigurinha5);
		this.jpnFigurinha6.add(jlbFigurinha6);
		this.jpnFigurinha7.add(jlbFigurinha7);
		this.jpnFigurinha8.add(jlbFigurinha8);
		this.jpnFigurinha9.add(jlbFigurinha9);
		this.jpnFigurinha10.add(jlbFigurinha10);
				
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
		this.jbtDell.setBounds(250, 55, 20, 20);
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

		this.jlbCopaMundo = new JLabel("FIFA World Cup Qatar 2022");
		this.jlbCopaMundo.setForeground(Color.white);
		this.jlbCopaMundo.setFont(new Font("Verdana", Font.BOLD, 35));
		this.jlbCopaMundo.setBounds(296, 40, 800, 51);
		
		this.jtfNome = new JTextField();
		this.jtfNome.setText(ControleProprietario.proprietario.getAlbumFigurinha().get(i).getNome());
		this.jtfNome.setBackground(new Color(136, 22, 55));
		this.jtfNome.setToolTipText("Nome do Album (Se quiser altera-lo, digite um novo e aperte no botao 'Edit' ao lado)");
		this.jtfNome.setForeground(Color.white);
		this.jtfNome.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jtfNome.setBorder(new LineBorder(new Color(136, 22, 55)));
		this.jtfNome.setBounds(296, 90, 800, 30);

		// JPanel
		
		this.jpnFigurinha1 = new JPanel(null);
		this.jpnFigurinha1.setToolTipText("Figurinha: " + Database.getFWC00().getItensLimitados() + "; Nível de Raridade: " + Database.getFWC00().getNivelRaridade());
		this.jpnFigurinha1.setBounds(94, 50, 200, 200);
		this.jpnFigurinha1.setBackground(new Color(175, 175, 175));
		
		this.jpnFigurinha2 = new JPanel(null);
		this.jpnFigurinha2.setToolTipText("Figurinha: " + Database.getFWC01().getItensLimitados() + "; Nível de Raridade: " + Database.getFWC01().getNivelRaridade());
		this.jpnFigurinha2.setBounds(337, 50, 200, 200);
		this.jpnFigurinha2.setBackground(new Color(175, 175, 175));
		
		this.jpnFigurinha3 = new JPanel(null);
		this.jpnFigurinha3.setToolTipText("Figurinha: " + Database.getFWC02().getItensLimitados() + "; Nível de Raridade: " + Database.getFWC02().getNivelRaridade());
		this.jpnFigurinha3.setBounds(580, 50, 200, 200);
		this.jpnFigurinha3.setBackground(new Color(175, 175, 175));
		
		this.jpnFigurinha4 = new JPanel(null);
		this.jpnFigurinha4.setToolTipText("Figurinha: " + Database.getFWC03().getItensLimitados() + "; Nível de Raridade: " + Database.getFWC03().getNivelRaridade());
		this.jpnFigurinha4.setBounds(824, 50, 200, 200);
		this.jpnFigurinha4.setBackground(new Color(175, 175, 175));
		
		this.jpnFigurinha5 = new JPanel(null);
		this.jpnFigurinha5.setToolTipText("Figurinha: " + Database.getFWC04().getItensLimitados() + "; Nível de Raridade: " + Database.getFWC04().getNivelRaridade());
		this.jpnFigurinha5.setBounds(1068, 50, 200, 200);
		this.jpnFigurinha5.setBackground(new Color(175, 175, 175));
		
		this.jpnFigurinha6 = new JPanel(null);
		this.jpnFigurinha6.setToolTipText("Seleção: " + Database.getQAT1().getSeleção() + "; Figurinha: " + Database.getQAT1().getJogador());
		this.jpnFigurinha6.setBounds(94, 294, 200, 200);
		this.jpnFigurinha6.setBackground(new Color(175, 175, 175));
		
		this.jpnFigurinha7 = new JPanel(null);
		this.jpnFigurinha7.setToolTipText("Seleção: " + Database.getQAT2().getSeleção() + "; Figurinha: " + Database.getQAT2().getJogador());
		this.jpnFigurinha7.setBounds(337, 294, 200, 200);
		this.jpnFigurinha7.setBackground(new Color(175, 175, 175));
		
		this.jpnFigurinha8 = new JPanel(null);
		this.jpnFigurinha8.setToolTipText("Seleção: " + Database.getQAT3().getSeleção() + "; Figurinha: " + Database.getQAT3().getJogador());
		this.jpnFigurinha8.setBounds(580, 294, 200, 200);
		this.jpnFigurinha8.setBackground(new Color(175, 175, 175));
		
		this.jpnFigurinha9 = new JPanel(null);
		this.jpnFigurinha9.setToolTipText("Seleção: " + Database.getQAT4().getSeleção() + "; Figurinha: " + Database.getQAT4().getJogador());
		this.jpnFigurinha9.setBounds(824, 294, 200, 200);
		this.jpnFigurinha9.setBackground(new Color(175, 175, 175));
		
		this.jpnFigurinha10 = new JPanel(null);
		this.jpnFigurinha10.setToolTipText("Seleção: " + Database.getQAT5().getSeleção() + "; Figurinha: " + Database.getQAT5().getJogador());
		this.jpnFigurinha10.setBounds(1068, 294, 200, 200);
		this.jpnFigurinha10.setBackground(new Color(175, 175, 175));
		
		// JLabel
		
		this.jlbFigurinha1 = new JLabel(Database.getFWC00().getSigla() + " " + Database.getFWC00().getCodigo());
		this.jlbFigurinha1.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jlbFigurinha1.setForeground(Color.white);
		this.jlbFigurinha1.setBounds(57, 25, 150, 48);
		
		this.jlbFigurinha2 = new JLabel(Database.getFWC01().getSigla() + " " + Database.getFWC01().getCodigo());
		this.jlbFigurinha2.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jlbFigurinha2.setForeground(Color.white);
		this.jlbFigurinha2.setBounds(57, 25, 150, 48);
		
		this.jlbFigurinha3 = new JLabel(Database.getFWC02().getSigla() + " " + Database.getFWC02().getCodigo());
		this.jlbFigurinha3.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jlbFigurinha3.setForeground(Color.white);
		this.jlbFigurinha3.setBounds(57, 25, 150, 48);
		
		this.jlbFigurinha4 = new JLabel(Database.getFWC03().getSigla() + " " + Database.getFWC03().getCodigo());
		this.jlbFigurinha4.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jlbFigurinha4.setForeground(Color.white);
		this.jlbFigurinha4.setBounds(57, 25, 150, 48);
		
		this.jlbFigurinha5 = new JLabel(Database.getFWC04().getSigla() + " " + Database.getFWC04().getCodigo());
		this.jlbFigurinha5.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jlbFigurinha5.setForeground(Color.white);
		this.jlbFigurinha5.setBounds(57, 25, 150, 48);
		
		this.jlbFigurinha6 = new JLabel(Database.getQAT1().getSigla() + " " + Database.getQAT1().getCodigo());
		this.jlbFigurinha6.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jlbFigurinha6.setForeground(Color.white);
		this.jlbFigurinha6.setBounds(57, 25, 150, 48);
		
		this.jlbFigurinha7 = new JLabel(Database.getQAT2().getSigla() + " " + Database.getQAT2().getCodigo());
		this.jlbFigurinha7.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jlbFigurinha7.setForeground(Color.white);
		this.jlbFigurinha7.setBounds(57, 25, 150, 48);

		this.jlbFigurinha8 = new JLabel(Database.getQAT3().getSigla() + " " + Database.getQAT3().getCodigo());
		this.jlbFigurinha8.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jlbFigurinha8.setForeground(Color.white);
		this.jlbFigurinha8.setBounds(57, 25, 150, 48);
		
		this.jlbFigurinha9 = new JLabel(Database.getQAT4().getSigla() + " " + Database.getQAT4().getCodigo());
		this.jlbFigurinha9.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jlbFigurinha9.setForeground(Color.white);
		this.jlbFigurinha9.setBounds(57, 25, 150, 48);

		this.jlbFigurinha10 = new JLabel(Database.getQAT5().getSigla() + " " + Database.getQAT5().getCodigo());
		this.jlbFigurinha10.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jlbFigurinha10.setForeground(Color.white);
		this.jlbFigurinha10.setBounds(57, 25, 150, 48);
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