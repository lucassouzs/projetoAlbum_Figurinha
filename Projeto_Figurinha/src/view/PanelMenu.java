package view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelMenu extends JFrame{
	
	private static final long serialVersionUID = 1L;

	private JPanel jpnBranco;
	private JLabel jlbPerfil;
	private JLabel jlbProprietario;
	private JLabel jlbIdade;
	private JLabel jlbSexo;

	public PanelMenu(){
		super();
		this.configurarFrame();
		this.configurarPainelBranco();
		this.add(this.jpnBranco);
	}
	
	private void configurarPainelBranco() {
		this.jpnBranco = new JPanel(null);	 
		this.jpnBranco.setBackground(Color.white); 
		this.jpnBranco.setBounds(0, 0, 429, 768);
		
		this.configurarDadosMenu();
		this.jpnBranco.add(this.jlbPerfil);
		this.jpnBranco.add(this.jlbProprietario); 
		this.jpnBranco.add(this.jlbIdade); 
		this.jpnBranco.add(this.jlbSexo); 
	}
	
	private void configurarDadosMenu() {
		
		ImageIcon perfil = new ImageIcon("perfil.png");
		this.jlbPerfil = new JLabel();
		this.jlbPerfil.setIcon(perfil);
		this.jlbPerfil.setBounds(150, 30, 400, 180);
		
		this.jlbProprietario = new JLabel("Nome: ");
		this.jlbProprietario.setForeground(new Color(92, 92, 92));
		this.jlbProprietario.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jlbProprietario.setBounds(30, 215, 168, 59);
		
		this.jlbIdade = new JLabel("Idade: ");
		this.jlbIdade.setForeground(new Color(92, 92, 92));
		this.jlbIdade.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jlbIdade.setBounds(30, 315, 168, 59);

		this.jlbSexo = new JLabel("Sexo: ");
		this.jlbSexo.setForeground(new Color(92, 92, 92));
		this.jlbSexo.setFont(new Font("Verdana", Font.BOLD, 25));
		this.jlbSexo.setBounds(30, 415, 168, 59);
	}

	private void configurarFrame() {
		this.setTitle("Meu Album de Figurinha"); 
		this.setResizable(false); 
		this.setSize(429, 768); 
		this.getContentPane().setBackground(new Color(136, 22, 55)); 
		this.setLayout(null);
		
		ImageIcon logo = new ImageIcon("logo.png"); 
		this.setIconImage(logo.getImage());
	}
}