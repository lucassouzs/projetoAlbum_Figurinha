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

public class PanelFigurinhaFWC extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	private JPanel jpnVermelho;
	private JPanel jpnBranco;
	private JLabel jlbCriarFigurinha;
	private JButton jbtCriar;
	private JLabel jlbSigla;
	private JTextField jtfSigla;
	private JLabel jlbCodigo;
	private JTextField jtfCodigo;
	private JLabel jlb1;
	private JTextField jtf1;
	private JButton jbtBack;

	public PanelFigurinhaFWC(int i){
		super();
		this.configurarFrame();
		this.configurarPainelVermelho(i);
		this.configurarPainelBranco(i);
		this.add(this.jpnVermelho);
		this.add(this.jpnBranco);
	}
	
	private void configurarPainelVermelho(int i) {
		this.jpnVermelho = new JPanel(null);	
		this.jpnVermelho.setBackground(new Color(136, 22, 55)); 
		this.jpnVermelho.setBounds(0, 0, 700, 100);
		
		this.configurarDadosMenu(i);
		this.jpnVermelho.add(this.jlbCriarFigurinha); 
		this.jpnVermelho.add(this.jbtBack);
		}
	
	private void configurarPainelBranco(int i) {
		this.jpnBranco = new JPanel(null);	 
		this.jpnBranco.setBounds(0, 100, 700, 300);
		this.jpnBranco.setBackground(new Color(240, 240, 240));
		
		this.configurarDadosMenu(i);
		this.jpnBranco.add(this.jbtCriar);
		
		this.jpnBranco.add(this.jlbSigla);
		this.jpnBranco.add(this.jtfSigla);

		this.jpnBranco.add(this.jlbCodigo);
		this.jpnBranco.add(this.jtfCodigo);

		this.jpnBranco.add(this.jlb1);
		this.jpnBranco.add(this.jtf1);
	}
	
	private void configurarDadosMenu(int i) {
		this.jlbCriarFigurinha = new JLabel("Figurinha FWC");
		this.jlbCriarFigurinha.setForeground(Color.white);
		this.jlbCriarFigurinha.setFont(new Font("Verdana",Font.BOLD,35));
		this.jlbCriarFigurinha.setBounds(195, 24, 500, 51);
		
		this.jbtBack = new JButton(new ImageIcon("backmenor.png"));
		this.jbtBack.setFont(new Font("Arial", Font.BOLD, 12));
		this.jbtBack.setBackground(new Color(136, 22, 55));
		this.jbtBack.setBorder(new LineBorder(new Color(136, 22, 55)));
		this.jbtBack.setBounds(75, 32, 40, 40);
		this.jbtBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				new PanelCriarFigurinha(i).setVisible(true);
				
				PanelFigurinhaFWC.this.dispose();
			}	
		});
		
		this.jlbSigla = new JLabel("Sigla:");
		this.jlbSigla.setFont(new Font("Arial",Font.BOLD,15));
		this.jlbSigla.setBounds(197, 13, 500, 40);
		this.jlbSigla.setForeground(new Color(71, 71, 71));
		
		this.jtfSigla = new JTextField();
		this.jtfSigla.setText("FWC");
		this.jtfSigla.setToolTipText("Insira um nome para o album");
		this.jtfSigla.setPreferredSize(new Dimension(306, 40));
		this.jtfSigla.setBorder(new LineBorder(Color.white));
		this.jtfSigla.setBounds(197, 53, 130, 40);

		this.jlbCodigo = new JLabel("Código:");
		this.jlbCodigo.setFont(new Font("Arial",Font.BOLD,15));
		this.jlbCodigo.setBounds(373, 13, 500, 40);
		this.jlbCodigo.setForeground(new Color(71, 71, 71));
		
		this.jtfCodigo = new JTextField();
		this.jtfCodigo.setToolTipText("Insira um nome para o album");
		this.jtfCodigo.setPreferredSize(new Dimension(306, 40));
		this.jtfCodigo.setBorder(new LineBorder(Color.white));
		this.jtfCodigo.setBounds(373, 53, 130, 40);

		this.jlb1 = new JLabel("Item:");
		this.jlb1.setFont(new Font("Arial",Font.BOLD,15));
		this.jlb1.setBounds(197, 95, 500, 40);
		this.jlb1.setForeground(new Color(71, 71, 71));
		
		this.jtf1 = new JTextField();
		this.jtf1.setToolTipText("Insira um nome para o album");
		this.jtf1.setPreferredSize(new Dimension(306, 40));
		this.jtf1.setBorder(new LineBorder(Color.white));
		this.jtf1.setBounds(197, 135, 306, 40);
		
		this.jbtCriar = new JButton("Criar");
		this.jbtCriar.setFont(new Font("Arial", Font.BOLD, 20));
		this.jbtCriar.setForeground(Color.white);
		this.jbtCriar.setBackground(new Color(136, 22, 55));
		this.jbtCriar.setBorder(new LineBorder(new Color(136, 22, 55)));
		this.jbtCriar.setBounds(190, 195, 306, 40);
		this.jbtCriar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == jbtCriar) {
					criar(i);
				}
				}
				});
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
	
	public void criar(int i) {
				
		String sigla = this.jtfSigla.getText();
		String codigo = this.jtfCodigo.getText();
		String item = this.jtf1.getText();
		int cod = Integer.parseInt(codigo);	
	
		ControleProprietario cadastrarFigurinhaFWC= new ControleProprietario();
		cadastrarFigurinhaFWC.cadastrarFigurinhaFWC(sigla, cod, item, i);
		
		new PanelAlbumQatar(i).setVisible(true);
		
		PanelFigurinhaFWC.this.dispose();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}	
}