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

public class PanelCriarFigurinha extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	private JPanel jpnVermelho;
	private JPanel jpnBranco;
	private JLabel jlbCriarFigurinha;
	private JButton jbtFWC;
	private JButton jbtSelecao;

	public PanelCriarFigurinha(int i){
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
		}
	
	private void configurarPainelBranco(int i) {
		this.jpnBranco = new JPanel(null);	 
		this.jpnBranco.setBounds(0, 100, 700, 300);
		this.jpnBranco.setBackground(new Color(240, 240, 240));
		
		this.configurarDadosMenu(i);
		this.jpnBranco.add(this.jbtFWC);
		this.jpnBranco.add(this.jbtSelecao);
	}
	
	private void configurarDadosMenu(int i) {
		this.jlbCriarFigurinha = new JLabel("Criar Figurinha");
		this.jlbCriarFigurinha.setForeground(Color.white);
		this.jlbCriarFigurinha.setFont(new Font("Verdana",Font.BOLD,35));
		this.jlbCriarFigurinha.setBounds(195, 24, 500, 51);
		
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
	
	public void actionPerformed(ActionEvent e) {
		
	}		
}


