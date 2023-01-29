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

/**
 * Classe responsavel por inicializar a primeira tela.
 * @author Lucas Ribeiro de Souza 
 * @author Lucas Victor Ferreira de Araujo
 * @since 2022
 * @version 1.0
 */

public class PanelEntrada extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	private JLabel jlbCadastro;
	private JPanel jpnProprietario;
	private JButton jbtCadastrar; 
	private JLabel jlbLogo;
	private JLabel jlbPele;

	/**
	 * Metodo construtor no qual recebe os metodos 
	 * e exibe atraves da interface grafica.
	 * 
	 */
	public PanelEntrada(){
		super();
		this.configurarFrame();
		this.configurarPainelPropietario();
		this.add(this.jpnProprietario);
	}
	
	/**
	 *  Metodo que cria e estiliza o painel branco.
	 */
	private void configurarPainelPropietario() {
		this.jpnProprietario = new JPanel(null);
		this.jpnProprietario.setBackground(Color.white); 
		this.jpnProprietario.setBounds(100, 90, 1166, 568);
		
		this.configurarDadosPropietario();
		this.jpnProprietario.add(this.jlbLogo);
		this.jpnProprietario.add(this.jlbCadastro); 
		this.jpnProprietario.add(this.jbtCadastrar);
		this.jpnProprietario.add(this.jlbPele);
	}
	
	/**
	 *  Metodo que cria e estiliza o painel Vermelho.
	 */
	private void configurarDadosPropietario() {
		ImageIcon logo = new ImageIcon("coroa_logo.png"); 
		ImageIcon pele = new ImageIcon("pele.png"); 

		this.jlbLogo = new JLabel(logo);
		this.jlbLogo.setBounds(450, 10, 300, 150);
		
		this.jlbCadastro = new JLabel("MyCup");
		this.jlbCadastro.setForeground(Color.black);
		this.jlbCadastro.setBounds(445, 100, 300, 150);
		this.jlbCadastro.setFont(new Font("Verdana",Font.BOLD,80));
		
		// Adicionando botao "Cadastrar".
		this.jbtCadastrar = new JButton("Cadastrar");
		this.jbtCadastrar.setForeground(Color.white);
		this.jbtCadastrar.setFont(new Font("Verdana",Font.BOLD,15));
		this.jbtCadastrar.setBackground(new Color (104, 15, 49));
		this.jbtCadastrar.setBounds(514, 500, 150, 30);
		this.jbtCadastrar.setBorder(new LineBorder(new Color (104, 15, 49)));
		this.jbtCadastrar.addActionListener(this);
		
		this.jlbPele = new JLabel(pele);
		this.jlbPele.setBounds(970, 460, 300, 150);
	}
	
	/**
	 * Metodo que cria e estiliza os componente presentes no frame.
	 */
	private void configurarFrame() {
		this.setTitle("MyCup"); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false); 
		this.setSize(1366, 768); 
		this.getContentPane().setBackground(new Color(136, 22, 55)); 
		this.setLayout(null);
		
		ImageIcon logo = new ImageIcon("logo.png"); 
		this.setIconImage(logo.getImage());
	}
	
	/**
	 * Metodo que dispara quando uma acao de clique e executada no butao "Cadastrar"
	 * levando ao PanelCadastro.
	 */
	@Override // Garante que estamos na verdade sobrescrevendo um método e não criando um novo.
	public void actionPerformed(ActionEvent e) {
		new PanelCadastro().setVisible(true);
		
		dispose();
	}
}