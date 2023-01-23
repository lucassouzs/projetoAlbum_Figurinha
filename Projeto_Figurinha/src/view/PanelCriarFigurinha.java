package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class PanelCriarFigurinha extends JFrame implements ActionListener, ItemListener{
	
	private static final long serialVersionUID = 1L;
	
	private JPanel jpnVermelho;
	private JPanel jpnBranco;
	private JButton jbtBack;
	private JLabel jlbCriarFigurinha;
	private JLabel jlbCopa;
	private JComboBox<Object> jcbFigurinha;
	
	private JLabel jlbSigla;
	private JTextField jtfSigla;
	
	private JLabel jlbCodigo;
	private JTextField jtfCodigo;
	
	private JLabel jlb1;
	private JTextField jtf1;
	
	private JLabel jlb2;
	private JTextField jtf2;

	public PanelCriarFigurinha(){
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
		this.jpnVermelho.add(this.jbtBack);
		}
	
	private void configurarPainelBranco() {
		this.jpnBranco = new JPanel(null);	 
		this.jpnBranco.setBounds(0, 100, 700, 300);
		this.jpnBranco.setBackground(new Color(240, 240, 240));
		
		this.configurarDadosMenu();
		this.jpnBranco.add(this.jlbCopa); 
		this.jpnBranco.add(this.jcbFigurinha);
	}
	
	private void configurarDadosMenu() {
		this.jlbCriarFigurinha = new JLabel("Criar Figurinha");
		this.jlbCriarFigurinha.setForeground(Color.white);
		this.jlbCriarFigurinha.setFont(new Font("Verdana",Font.BOLD,35));
		this.jlbCriarFigurinha.setBounds(195, 24, 500, 51);
		
		this.jlbCopa = new JLabel("Tipo:");
		this.jlbCopa.setForeground(new Color(71, 71, 71));
		this.jlbCopa.setFont(new Font("Arial",Font.BOLD,15));
		this.jlbCopa.setBounds(190, 10, 500, 40);
				
		this.jbtBack = new JButton(new ImageIcon("backmenor.png"));
		this.jbtBack.setFont(new Font("Arial", Font.BOLD, 12));
		this.jbtBack.setBackground(new Color(136, 22, 55));
		this.jbtBack.setBorder(new LineBorder(new Color(136, 22, 55)));
		this.jbtBack.setBounds(75, 32, 40, 40);
		this.jbtBack.addActionListener(this);
		
		this.jcbFigurinha = new JComboBox<Object>();
		this.jcbFigurinha.addItem("");
		this.jcbFigurinha.addItem("Fifa World Cup");
		this.jcbFigurinha.addItem("Seleção");
		this.jcbFigurinha.setBackground(Color.white);
		this.jcbFigurinha.setBorder(new LineBorder(Color.white));
		this.jcbFigurinha.setBounds(190, 50, 306, 40);
		this.jcbFigurinha.addItemListener(this);
		
		this.jlbCodigo = new JLabel("oi");
		this.jlbCodigo.setForeground(Color.black);
		this.jlbCodigo.setBounds(50, 50, 50, 50);
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

	@Override
	public void itemStateChanged(ItemEvent e) {
			
			if (this.jcbFigurinha.getSelectedItem().toString().equals("Fifa World Cup")) {
				
			} else if (this.jcbFigurinha.getSelectedItem().toString().equals("Seleção")) {

			}
		}		
}


