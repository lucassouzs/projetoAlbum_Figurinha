package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import controler.ControleProprietario;

public class PanelCriarAlbum extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	private JPanel jpnVermelho;
	private JPanel jpnBranco;
	private JButton jbtBack;
	private JLabel jlbCriarAlbum;
	private JLabel jlbCopa;
	private JComboBox<Object> jcbCopaMundo;
	private JLabel jlbNomeAlbum;
	private JTextField jtfNomeAlbum;
	private JButton jbtCriar;

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
		this.jpnVermelho.setBounds(0, 0, 700, 100);
		
		this.configurarDadosMenu();
		this.jpnVermelho.add(this.jlbCriarAlbum); 
		this.jpnVermelho.add(this.jbtBack);
		}
	
	private void configurarPainelBranco() {
		this.jpnBranco = new JPanel(null);	 
		this.jpnBranco.setBackground(new Color(240, 240, 240)); 
		this.jpnBranco.setBounds(0, 100, 700, 300);
		
		this.configurarDadosMenu();
		this.jpnBranco.add(this.jlbCopa); 
		this.jpnBranco.add(this.jcbCopaMundo);
		this.jpnBranco.add(this.jlbNomeAlbum); 
		this.jpnBranco.add(this.jtfNomeAlbum);
		this.jpnBranco.add(this.jbtCriar); 
	}
	
	private void configurarDadosMenu() {
		this.jlbCriarAlbum = new JLabel("Criar Album");
		this.jlbCriarAlbum.setForeground(Color.white);
		this.jlbCriarAlbum.setFont(new Font("Verdana",Font.BOLD,35));
		this.jlbCriarAlbum.setBounds(230, 24, 296, 51);
		
		this.jlbCopa = new JLabel("Copa do mundo:");
		this.jlbCopa.setForeground(new Color(71, 71, 71));
		this.jlbCopa.setFont(new Font("Arial",Font.BOLD,15));
		this.jlbCopa.setBounds(190, 10, 500, 40);
		
		this.jcbCopaMundo = new JComboBox<Object>();
		this.jcbCopaMundo.addItem("Qatar 2022");
		this.jcbCopaMundo.setBackground(Color.white);
		this.jcbCopaMundo.setBorder(new LineBorder(Color.white));
		this.jcbCopaMundo.setBounds(190, 50, 306, 40);
		
		this.jlbNomeAlbum = new JLabel("Nome do álbum:");
		this.jlbNomeAlbum.setForeground(new Color(71, 71, 71));
		this.jlbNomeAlbum.setFont(new Font("Arial",Font.BOLD,15));
		this.jlbNomeAlbum.setBounds(190, 95, 500, 40);
		
		this.jtfNomeAlbum = new JTextField();
		this.jtfNomeAlbum.setToolTipText("Insira um nome para o album");
		this.jtfNomeAlbum.setPreferredSize(new Dimension(306, 40));
		this.jtfNomeAlbum.setBorder(new LineBorder(Color.white));
		this.jtfNomeAlbum.setBounds(190, 135, 306, 40);
		
		this.jbtCriar = new JButton("Criar");
		this.jbtCriar.setFont(new Font("Arial", Font.BOLD, 20));
		this.jbtCriar.setForeground(Color.white);
		this.jbtCriar.setBackground(new Color(136, 22, 55));
		this.jbtCriar.setBorder(new LineBorder(new Color(136, 22, 55)));
		this.jbtCriar.setBounds(190, 195, 306, 40);
		this.jbtCriar.addActionListener(this);
		
		this.jbtBack = new JButton(new ImageIcon("backmenor.png"));
		this.jbtBack.setFont(new Font("Arial", Font.BOLD, 12));
		this.jbtBack.setBackground(new Color(136, 22, 55));
		this.jbtBack.setBorder(new LineBorder(new Color(136, 22, 55)));
		this.jbtBack.setBounds(75, 32, 40, 40);
		this.jbtBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				new PanelMeusAlbuns().setVisible(true);
				
				PanelCriarAlbum.this.dispose();
			}	
		});
	}
	
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
	
	public void actionPerformed(ActionEvent e) {
		
		if(this.jtfNomeAlbum.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Coloque um nome no album!", "Atenção!", JOptionPane.ERROR_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Album criado com sucesso!", "Parabéns!", JOptionPane.DEFAULT_OPTION);	
		
			String copaMundo = (String) this.jcbCopaMundo.getSelectedItem();
			String nome = this.jtfNomeAlbum.getText();
		
			ControleProprietario cadastrarAlbum= new ControleProprietario();
			cadastrarAlbum.cadastrarAlbum(nome, copaMundo);
		
			new PanelMeusAlbuns().setVisible(true);
		
			PanelCriarAlbum.this.dispose();
		}
	}
}

