package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import controler.ControleProprietario;

public class PanelMeusAlbuns extends JFrame implements ActionListener, ListSelectionListener{
	
	private static final long serialVersionUID = 1L;

	private JPanel jpnVermelho;
	private JPanel jpnBranco;
	private JPanel jpnLista;
	private JButton jbtMenu;
	private JLabel jlbMeusAlbuns;
	private JButton jbtAdd;
	private JList<String> jltLista;
	private ControleProprietario controle = new ControleProprietario();
	public int i;

	public PanelMeusAlbuns(){
		super();
		this.configurarFrame();
		this.configurarPainelVermelho();
		this.configurarPainelBranco();
		this.configurarPainelLista();
		this.add(this.jpnVermelho);
		this.add(this.jpnBranco);
	}
	
	private void configurarPainelVermelho() {
		this.jpnVermelho = new JPanel(null);	
		this.jpnVermelho.setBackground(new Color(136, 22, 55)); 
		this.jpnVermelho.setBounds(0, 0, 1366, 155);
		
		this.configurarDadosMenu();
		this.jpnVermelho.add(this.jbtMenu);
		this.jpnVermelho.add(this.jlbMeusAlbuns); 
		this.jpnVermelho.add(this.jbtAdd);
	}
	
	private void configurarPainelBranco() {
		this.jpnBranco = new JPanel();	 
		this.jpnBranco.setBackground(new Color(240, 240, 240)); 
		this.jpnBranco.setBounds(0, 155, 1366, 613);
		this.jpnBranco.setLayout(null);		
	}

	private void configurarPainelLista() {
		
		JScrollPane scrollPane1 = new JScrollPane(this.jltLista);
		
		this.jpnLista = new JPanel();
		this.jpnLista.setBounds(133, 240, 1100, 402);
		this.jpnLista.setLayout(new BorderLayout());		
		this.jpnLista.add(this.jltLista);
		this.jpnLista.setBorder(new LineBorder(new Color(240, 240, 240)));
		this.jpnLista.add(scrollPane1, BorderLayout.CENTER);
		this.jpnLista.add(new JScrollPane(this.jltLista));
		
		this.jpnBranco.add(this.jpnLista);
	}
	
	private void configurarDadosMenu() {
		this.jbtMenu = new JButton(new ImageIcon("menu.png"));
		this.jbtMenu.setFont(new Font("Arial", Font.BOLD, 12));
		this.jbtMenu.setBackground(new Color(136, 22, 55));
		this.jbtMenu.setBorder(new LineBorder(new Color(136, 22, 55)));
		this.jbtMenu.setBounds(85, 51, 50, 50);
		this.jbtMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == jbtMenu) {
					menu();
				}
				}
				});

		this.jlbMeusAlbuns = new JLabel("Meus Albuns");
		this.jlbMeusAlbuns.setForeground(Color.white);
		this.jlbMeusAlbuns.setFont(new Font("Verdana",Font.BOLD,35));
		this.jlbMeusAlbuns.setBounds(296, 51, 296,51);

		this.jbtAdd = new JButton(new ImageIcon("add.png"));
		this.jbtAdd.setFont(new Font("Arial", Font.BOLD, 12));
		this.jbtAdd.setBackground(new Color(136, 22, 55));
		this.jbtAdd.setBorder(new LineBorder(new Color(136, 22, 55)));
		this.jbtAdd.setBounds(1247, 51, 50, 50);
		this.jbtAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == jbtAdd) {
					add();
				}
				}
				});
		
		this.jltLista = new JList<String>();
		this.jltLista.setBackground(new Color(240, 240, 240));
		this.jltLista.setBorder(new LineBorder(new Color(240, 240, 240)));
		this.jltLista.setModel(controle.listarAlbum_Figurinha());
		this.jltLista.addListSelectionListener(this);
		this.jltLista.setForeground(new Color(136, 22, 55));
		
			/*if(ControleProprietario.getAlbumFigurinha().get(i).getNome().equals(nome)) {
				if(ControleProprietario.getAlbumFigurinha().get(i).getCopaMundo() == "Qatar 2022") {
					this.jltLista.setForeground(new Color(136, 22, 55));
				} else if (ControleProprietario.getAlbumFigurinha().get(i).getCopaMundo() == "Russia 2018") {
					this.jltLista.setForeground(new Color(10, 86, 152));
				}
			}*/
		}
	
	private void configurarFrame() {
		this.setTitle("É trabalho duro,"); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false); 
		this.setSize(1366, 768); 
		this.getContentPane().setBackground(Color.white); 
		this.setLayout(null);
		this.setLayout(new BorderLayout());
		
		ImageIcon logo = new ImageIcon("logo.png"); 
		this.setIconImage(logo.getImage());
	}
	
	public void menu() {	
		ControleProprietario controlePerfil= new ControleProprietario();
		controlePerfil.controlePerfil();
		
		PanelMeusAlbuns.this.dispose();
	}	
	
	public void add() {
		ControleProprietario controleCriarAlbum= new ControleProprietario();
		controleCriarAlbum.controleCriarAlbum();
		
		PanelMeusAlbuns.this.dispose();
	}

	public void actionPerformed(ActionEvent e) {
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();
		
		if(e.getValueIsAdjusting() && src == this.jltLista) {
			controle.abrirAlbum(this.jltLista.getSelectedValue().toString());
			
			dispose();
		}
	}
}