package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class PanelCadastro extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private int NOVA_LINHA = 0;
	private int NOVA_COLUNA = 1;
	GridBagConstraints gbc = null;
	
	private JLabel jlbCadastro;
	private JPanel jpnPropietario;
	private JLabel jlbNomePropietario;
	private JTextField jtfNomePropietario;
	private JLabel jlbIdadePropietario;
	private JTextField jtfIdadePropietario;
	private JLabel jlbSexoPropietario;
	private JRadioButton jrbSexoMasculino;
	private JRadioButton jrbSexoFeminino;
	private JRadioButton jrbSexoOutros;
	private JButton jbtCadastrar;

	public PanelCadastro(){
		super();
		this.configurarFrame();
		this.configurarPainelPropietario();
		this.add(this.jpnPropietario);
	}
	
	private void configurarPainelPropietario() {
		this.jpnPropietario = new JPanel(new GridBagLayout());	
		this.jpnPropietario.setPreferredSize(new Dimension(1166, 568));  
		this.jpnPropietario.setBackground(new Color(104, 15, 49)); 
		
		this.configurarDadosPropietario();
		this.jpnPropietario.add((this.jlbCadastro), gbc); 
		configurarGBC(NOVA_LINHA);
		
		this.jpnPropietario.add((this.jlbNomePropietario), gbc);
		configurarGBC(NOVA_LINHA);
		
		this.jpnPropietario.add((this.jtfNomePropietario), gbc);
		configurarGBC(NOVA_LINHA);
		
		this.jpnPropietario.add((this.jlbIdadePropietario), gbc);
		configurarGBC(NOVA_LINHA);
		
		this.jpnPropietario.add((this.jtfIdadePropietario), gbc);
		configurarGBC(NOVA_LINHA);
		
		this.jpnPropietario.add((this.jlbSexoPropietario), gbc);
		configurarGBC(NOVA_LINHA);
		
		this.jpnPropietario.add((this.jrbSexoMasculino), gbc);
		configurarGBC(NOVA_LINHA);
		
		this.jpnPropietario.add((this.jrbSexoFeminino), gbc);
		configurarGBC(NOVA_LINHA);
		
		this.jpnPropietario.add((this.jrbSexoOutros), gbc);
		configurarGBC(NOVA_LINHA);
		
		this.jpnPropietario.add((this.jbtCadastrar), gbc);
		configurarGBC(NOVA_LINHA);
	}
	
	private void configurarDadosPropietario() {
		this.jlbCadastro = new JLabel("Cadastro");
		this.jlbCadastro.setForeground(Color.white);
		this.jlbCadastro.setFont(new Font("Verdana",Font.BOLD,30));
		
		this.jlbNomePropietario = new JLabel("Nome:");
		this.jlbNomePropietario.setForeground(Color.white);
		this.jlbNomePropietario.setFont(new Font("Arial",Font.BOLD,15));
		this.jtfNomePropietario = new JTextField();
		this.jtfNomePropietario.setPreferredSize(new Dimension(306, 40));
		this.jtfNomePropietario.setBorder(new LineBorder(Color.white));
		
		this.jlbIdadePropietario = new JLabel("Idade:");
		this.jlbIdadePropietario.setForeground(Color.white);
		this.jlbIdadePropietario.setFont(new Font("Arial",Font.BOLD,15));
		this.jtfIdadePropietario = new JTextField();
		this.jtfIdadePropietario.setPreferredSize(new Dimension(306, 40));
		this.jtfIdadePropietario.setBorder(new LineBorder(Color.white));
		
		this.jlbSexoPropietario = new JLabel("Sexo:");
		this.jlbSexoPropietario.setForeground(Color.white);
		this.jlbSexoPropietario.setFont(new Font("Arial",Font.BOLD,15));
		
		this.jrbSexoMasculino = new JRadioButton("Masculino");
		this.jrbSexoMasculino.setForeground(Color.white);
		this.jrbSexoMasculino.setBackground(new Color(104, 15, 49)); 
		this.jrbSexoFeminino = new JRadioButton("Feminino");
		this.jrbSexoFeminino.setForeground(Color.white);
		this.jrbSexoFeminino.setBackground(new Color(104, 15, 49)); 
		this.jrbSexoOutros = new JRadioButton("Outros");
		this.jrbSexoOutros.setForeground(Color.white);
		this.jrbSexoOutros.setBackground(new Color(104, 15, 49));
		
		this.jbtCadastrar = new JButton("Cadastrar");
		this.jbtCadastrar.setForeground(Color.white);
		this.jbtCadastrar.setBackground(new Color(58, 6, 36));
		this.jbtCadastrar.setPreferredSize(new Dimension(306, 40));
		this.jbtCadastrar.setBorder(new LineBorder(new Color(104, 15, 49)));
	}
	
	private void configurarFrame() {
		this.setTitle("Meu Album de Figurinha"); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false); 
		this.setSize(1366, 768); 
		this.getContentPane().setBackground(new Color(136, 22, 55)); 
		this.setLayout(new GridBagLayout());
		this.setLocationRelativeTo(null);
		
		gbc = new GridBagConstraints();
		
		gbc.insets = new Insets(10, 10, 0, 10);
		gbc.anchor = GridBagConstraints.WEST;
		
		configurarGBC(NOVA_LINHA);
		
		ImageIcon logo = new ImageIcon("logo.png"); 
		this.setIconImage(logo.getImage());
	}
	
	private void configurarGBC(int posicao) {
		if(posicao == NOVA_LINHA) {
			gbc.gridy = gbc.gridy +1;
			gbc.gridx = 0;
		}
		else {
			gbc.gridx = gbc.gridx +1;
		}
	}

}
