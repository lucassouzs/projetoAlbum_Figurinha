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

public class PanelAlbumRussia extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;

	private JPanel jpnVermelho;
	private JTabbedPane jtpBranco;
	private JButton jbtBack;
	private JLabel jlbCopaMundo;
	private JTextField jtfNome;
	private JButton jbtDell;
	private JButton jbtEdit;

	public PanelAlbumRussia(int i){
		super();
		this.configurarFrame();
		this.configurarPainelAzul(i);
		this.configurarJTabbedPane();
		this.add(this.jpnVermelho);
		this.add(this.jtpBranco);
	}
	
	private void configurarPainelAzul(int i) {
		this.jpnVermelho = new JPanel(null);	
		this.jpnVermelho.setBackground(new Color(10, 86, 152)); 
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
		this.jtpBranco.setBackground(new Color(8, 65, 123)); 
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
	
	private void configurarDadosMenu(int i) {
		this.jbtBack = new JButton(new ImageIcon("back.png"));
		this.jbtBack.setFont(new Font("Arial", Font.BOLD, 12));
		this.jbtBack.setBackground(new Color(10, 86, 152));
		this.jbtBack.setBorder(new LineBorder(new Color(10, 86, 152)));
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
		this.jbtDell.setBackground(new Color(10, 86, 152));
		this.jbtDell.setBorder(new LineBorder(new Color(10, 86, 152)));
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
		this.jbtEdit.setBackground(new Color(10, 86, 152));
		this.jbtEdit.setBorder(new LineBorder(new Color(10, 86, 152)));
		this.jbtEdit.setBounds(250, 95, 20, 20);
		this.jbtEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == jbtEdit) {
					edit(i);
				}
				}
				});

		this.jlbCopaMundo = new JLabel("FIFA World Cup Russia 2018");
		this.jlbCopaMundo.setForeground(Color.white);
		this.jlbCopaMundo.setFont(new Font("Verdana",Font.BOLD,35));
		this.jlbCopaMundo.setBounds(296, 40, 800, 51);
		
		this.jtfNome = new JTextField();
		this.jtfNome.setText(ControleProprietario.proprietario.getAlbumFigurinha().get(i).getNome());
		this.jtfNome.setBackground(new Color(10, 86, 152));
		this.jtfNome.setForeground(Color.white);
		this.jtfNome.setToolTipText("Nome do Album (Se quiser altera-lo, digite um novo e aperte no botao 'Edit' ao lado)");
		this.jtfNome.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jtfNome.setBorder(new LineBorder(new Color(10, 86, 152)));
		this.jtfNome.setBounds(296, 90, 800, 30);
	}
	
	private void configurarFrame() {
		this.setTitle("amor pelo que você está fazendo ou aprendendo a fazer. - Pelé "); 
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
			
			PanelAlbumRussia.this.dispose();
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