package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import controler.ControleProprietario;

public class PanelCadastro extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	private int NOVA_LINHA = 0;
	GridBagConstraints gbc = null;
	
	private JLabel jlbCadastro;
	private JPanel jpnProprietario;
	private JLabel jlbNomeProprietario; 
	public JTextField jtfNomeProprietario;
	private JLabel jlbIdadeProprietario;
	public JTextField jtfIdadeProprietario;
	private JLabel jlbSexoProprietario;
	public JTextField jtfSexoProprietario;
	private JButton jbtCadastrar;

	public PanelCadastro(){
		super();
		this.configurarFrame();
		this.configurarPainelPropietario();
		this.add(this.jpnProprietario);
	}
	
	private void configurarPainelPropietario() {
		this.jpnProprietario = new JPanel(new GridBagLayout());
		this.jpnProprietario.setPreferredSize(new Dimension(1166, 568));  
		this.jpnProprietario.setBackground(new Color(104, 15, 49)); 
		
		this.configurarDadosPropietario();
		this.jpnProprietario.add((this.jlbCadastro), gbc); 
		configurarGBC(NOVA_LINHA);
		
		this.jpnProprietario.add((this.jlbNomeProprietario), gbc);
		configurarGBC(NOVA_LINHA);
		
		this.jpnProprietario.add((this.jtfNomeProprietario), gbc);
		configurarGBC(NOVA_LINHA);
		
		this.jpnProprietario.add((this.jlbIdadeProprietario), gbc);
		configurarGBC(NOVA_LINHA);
		
		this.jpnProprietario.add((this.jtfIdadeProprietario), gbc);
		configurarGBC(NOVA_LINHA);
		
		this.jpnProprietario.add((this.jlbSexoProprietario), gbc);
		configurarGBC(NOVA_LINHA);
		
		this.jpnProprietario.add((this.jtfSexoProprietario), gbc);
		configurarGBC(NOVA_LINHA);
		
		this.jpnProprietario.add((this.jbtCadastrar), gbc);
		configurarGBC(NOVA_LINHA);
	}
	
	private void configurarDadosPropietario() {
		this.jlbCadastro = new JLabel("MyCup");
		this.jlbCadastro.setForeground(Color.white);
		this.jlbCadastro.setFont(new Font("Verdana",Font.BOLD,35));
		
		this.jlbNomeProprietario = new JLabel("Nome:");
		this.jlbNomeProprietario.setForeground(Color.white);
		this.jlbNomeProprietario.setFont(new Font("Arial",Font.BOLD,15));
		
		this.jtfNomeProprietario = new JTextField();
		this.jtfNomeProprietario.setPreferredSize(new Dimension(306, 40));
		this.jtfNomeProprietario.setBorder(new LineBorder(Color.white));
		
		this.jlbIdadeProprietario = new JLabel("Idade:");
		this.jlbIdadeProprietario.setForeground(Color.white);
		this.jlbIdadeProprietario.setFont(new Font("Arial",Font.BOLD,15));
		
		this.jtfIdadeProprietario = new JTextField();
		this.jtfIdadeProprietario.setPreferredSize(new Dimension(306, 40));
		this.jtfIdadeProprietario.setBorder(new LineBorder(Color.white));
		
		this.jlbSexoProprietario = new JLabel("Sexo:");
		this.jlbSexoProprietario.setForeground(Color.white);
		this.jlbSexoProprietario.setFont(new Font("Arial",Font.BOLD,15));
		
		this.jtfSexoProprietario = new JTextField();
		this.jtfSexoProprietario.setPreferredSize(new Dimension(306, 40));
		this.jtfSexoProprietario.setBorder(new LineBorder(Color.white));
		
		this.jbtCadastrar = new JButton("Entrar");
		this.jbtCadastrar.setForeground(Color.white);
		this.jbtCadastrar.setBackground(new Color(58, 6, 36));
		this.jbtCadastrar.setPreferredSize(new Dimension(306, 40));
		this.jbtCadastrar.setBorder(new LineBorder(new Color(104, 15, 49)));
		this.jbtCadastrar.addActionListener(this);
	}
	
	private void configurarFrame() {
		this.setTitle("Meu Album de Figurinha"); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false); 
		this.setSize(1366, 768); 
		this.getContentPane().setBackground(new Color(136, 22, 55)); 
		this.setLayout(new GridBagLayout());
				
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
	
	public void actionPerformed(ActionEvent e) {
		
		if(jtfNomeProprietario.getText().isEmpty() || jtfSexoProprietario.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Preencha os campos para prosseguir!");	
			} else {
				JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");	
			}
			
			String nome = this.jtfNomeProprietario.getText();
			String idade = this.jtfIdadeProprietario.getText();
			String sexo = this.jtfSexoProprietario.getText();
			
			int id = Integer.parseInt(idade);	
			
			ControleProprietario controleProprietario = new ControleProprietario();
			
			controleProprietario.cadastrarProprietario(nome, id, sexo);
			
			PanelCadastro.this.dispose();
	}
}