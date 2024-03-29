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
import controler.ControleProprietario.ControleInformacoesPessoais;

/**
 * Classe responsavel por inicializar a tela em que sera 
 * possivel realizar o cadastro inserindo os dados do proprietario.
 * @author Lucas Ribeiro de Souza 
 * @author Lucas Victor Ferreira de Araujo
 * @since 2022
 * @version 1.0
 */
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

	/**
	 * Metodo construtor no qual recebe os metodos 
	 * e exibe atraves da interface grafica.
	 */
	public PanelCadastro(){
		super();
		this.configurarFrame();
		this.configurarPainelPropietario();
		this.add(this.jpnProprietario);
	}
	
	/**
	 * Metodo que cria, estiliza e recebe os componentes
	 * presentes no painel do proprietario.
	 * @param i
	 */
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
	
	/**
	 * Metodo que cria e estiliza os componente presentes no frame.
	 */
	private void configurarDadosPropietario() {
		this.jlbCadastro = new JLabel("Cadastro");
		this.jlbCadastro.setForeground(Color.white);
		this.jlbCadastro.setFont(new Font("Verdana",Font.BOLD,35));
		
		this.jlbNomeProprietario = new JLabel("Nome:");
		this.jlbNomeProprietario.setForeground(Color.white);
		this.jlbNomeProprietario.setFont(new Font("Arial",Font.BOLD,15));
		
		this.jtfNomeProprietario = new JTextField();
		this.jtfNomeProprietario.setToolTipText("Insira seu nome");
		this.jtfNomeProprietario.setPreferredSize(new Dimension(306, 40));
		this.jtfNomeProprietario.setBorder(new LineBorder(Color.white));
		
		this.jlbIdadeProprietario = new JLabel("Idade:");
		this.jlbIdadeProprietario.setForeground(Color.white);
		this.jlbIdadeProprietario.setFont(new Font("Arial",Font.BOLD,15));
		
		this.jtfIdadeProprietario = new JTextField();
		this.jtfIdadeProprietario.setToolTipText("Insira sua idade");
		this.jtfIdadeProprietario.setPreferredSize(new Dimension(306, 40));
		this.jtfIdadeProprietario.setBorder(new LineBorder(Color.white));
		
		this.jlbSexoProprietario = new JLabel("Sexo:");
		this.jlbSexoProprietario.setForeground(Color.white);
		this.jlbSexoProprietario.setFont(new Font("Arial",Font.BOLD,15));
		
		this.jtfSexoProprietario = new JTextField();
		this.jtfSexoProprietario.setToolTipText("Insira seu sexo");
		this.jtfSexoProprietario.setPreferredSize(new Dimension(306, 40));
		this.jtfSexoProprietario.setBorder(new LineBorder(Color.white));
		
		this.jbtCadastrar = new JButton("Entrar");
		this.jbtCadastrar.setForeground(Color.white);
		this.jbtCadastrar.setBackground(new Color(58, 6, 36));
		this.jbtCadastrar.setPreferredSize(new Dimension(306, 40));
		this.jbtCadastrar.setBorder(new LineBorder(new Color(104, 15, 49)));
		this.jbtCadastrar.addActionListener(this);
	}
	
	/**
	 * Metodo que cria estilizar o frame "MyCup".
	 */
	private void configurarFrame() {
		this.setTitle("MyCup"); 
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
	
	/**
	 * Metodo responsavel por organizar os componentes em linha e coluna no painel do proprietario.
	 * @param posicao Nova linha.
	 */
	private void configurarGBC(int posicao) {
		if(posicao == NOVA_LINHA) {
			gbc.gridy = gbc.gridy +1;
			gbc.gridx = 0;
		}
		else {
			gbc.gridx = gbc.gridx +1;
		}
	}
	
	/**
	 * Metodo que dispara quando uma acao de clique e executada.
	 */
	public void actionPerformed(ActionEvent e) {
		
		if(jtfNomeProprietario.getText().isEmpty() && jtfIdadeProprietario.getText().isEmpty() 
				&& jtfSexoProprietario.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Preencha os dados para prosseguir!", "Atenção!", JOptionPane.ERROR_MESSAGE);	
			} else if (jtfIdadeProprietario.getText().isEmpty() && jtfSexoProprietario.getText().isEmpty()){
				JOptionPane.showMessageDialog(null, "Preencha a idade e o sexo para prosseguir!", "Atenção!", JOptionPane.ERROR_MESSAGE);
			} else if (jtfNomeProprietario.getText().isEmpty() && jtfIdadeProprietario.getText().isEmpty()){
				JOptionPane.showMessageDialog(null, "Preencha o nome e a idade para prosseguir!", "Atenção!", JOptionPane.ERROR_MESSAGE);	
			} else if (jtfNomeProprietario.getText().isEmpty() && jtfSexoProprietario.getText().isEmpty()){
				JOptionPane.showMessageDialog(null, "Preencha o nome e o sexo para prosseguir!", "Atenção!", JOptionPane.ERROR_MESSAGE);	
			} else if (jtfNomeProprietario.getText().isEmpty()){
				JOptionPane.showMessageDialog(null, "Preencha o nome para prosseguir!", "Atenção!", JOptionPane.ERROR_MESSAGE);
			} else if (jtfIdadeProprietario.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Preencha a idade para prosseguir!", "Atenção!", JOptionPane.ERROR_MESSAGE);
			} else if (jtfSexoProprietario.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Preencha o sexo para prosseguir!", "Atenção!", JOptionPane.ERROR_MESSAGE);
			} else {
				if(ControleInformacoesPessoais.checkNumero(jtfIdadeProprietario.getText())) {
					JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!", "Parabéns!", JOptionPane.DEFAULT_OPTION);	
				
					String nome = this.jtfNomeProprietario.getText();
					String idade = this.jtfIdadeProprietario.getText();
					String sexo = this.jtfSexoProprietario.getText();
					int id = Integer.parseInt(idade);	
					
					ControleProprietario controleProprietario = new ControleProprietario();
					controleProprietario.cadastrarProprietario(nome, id, sexo);
					controleProprietario.preCadastroObjetos();
					new PanelMeusAlbuns().setVisible(true);
					PanelCadastro.this.dispose();			
			} else {
					JOptionPane.showMessageDialog(null, "Digite apenas numeros em Idade!", "Atenção!", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}