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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import controler.ControleProprietario;
import controler.ControleProprietario.ControleInformacoesPessoais;

public class PanelEditarFigurinhaFWC extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	private JPanel jpnVermelho;
	private JPanel jpnBranco;
	private JLabel jlbCriarFigurinha;
	private JButton jbtSalvar;
	private JButton jbtExcluir;
	private JLabel jlbSigla;
	private JTextField jtfSigla;
	private JLabel jlbCodigo;
	private JTextField jtfCodigo;
	private JLabel jlb1;
	private JTextField jtf1;

	public PanelEditarFigurinhaFWC(int i, int k){
		super(); 
		this.configurarFrame();
		this.configurarPainelVermelho(i, k);
		this.configurarPainelBranco(i, k);
		this.add(this.jpnVermelho);
		this.add(this.jpnBranco);
	}

	private void configurarPainelVermelho(int i, int k) {
		this.jpnVermelho = new JPanel(null);	
		this.jpnVermelho.setBackground(new Color(136, 22, 55)); 
		this.jpnVermelho.setBounds(0, 0, 700, 100);
		
		this.configurarDadosMenu(i, k);
		this.jpnVermelho.add(this.jlbCriarFigurinha); 
		}
	
	private void configurarPainelBranco(int i, int k) {
		this.jpnBranco = new JPanel(null);	 
		this.jpnBranco.setBounds(0, 100, 700, 300);
		this.jpnBranco.setBackground(new Color(240, 240, 240));
		
		this.configurarDadosMenu(i, k);
		this.jpnBranco.add(this.jbtSalvar);
		this.jpnBranco.add(this.jbtExcluir);
		
		this.jpnBranco.add(this.jlbSigla);
		this.jpnBranco.add(this.jtfSigla);

		this.jpnBranco.add(this.jlbCodigo);
		this.jpnBranco.add(this.jtfCodigo);

		this.jpnBranco.add(this.jlb1);
		this.jpnBranco.add(this.jtf1);
	}
	
	private void configurarDadosMenu(int i, int k) {
		this.jlbCriarFigurinha = new JLabel("Editar Figurinha FWC");
		this.jlbCriarFigurinha.setForeground(Color.white);
		this.jlbCriarFigurinha.setFont(new Font("Verdana",Font.BOLD,35));
		this.jlbCriarFigurinha.setBounds(140, 24, 500, 51);
		
		this.jlbSigla = new JLabel("Sigla:");
		this.jlbSigla.setFont(new Font("Arial",Font.BOLD,15));
		this.jlbSigla.setBounds(197, 13, 500, 40);
		this.jlbSigla.setForeground(new Color(71, 71, 71));
		
		this.jtfSigla = new JTextField();
		this.jtfSigla.setText("FWC");
		this.jtfSigla.setEnabled(false);
		this.jtfSigla.setToolTipText("Insira a sigla da Figurinha");
		this.jtfSigla.setPreferredSize(new Dimension(306, 40));
		this.jtfSigla.setBorder(new LineBorder(Color.white));
		this.jtfSigla.setBounds(197, 53, 130, 40);

		this.jlbCodigo = new JLabel("Código:");
		this.jlbCodigo.setFont(new Font("Arial",Font.BOLD,15));
		this.jlbCodigo.setBounds(373, 13, 500, 40);
		this.jlbCodigo.setForeground(new Color(71, 71, 71));
		
		this.jtfCodigo = new JTextField(ControleProprietario.proprietario.getAlbumFigurinha().get(i).getFigurinhaFWC().get(k).toString());
		this.jtfCodigo.setToolTipText("Insira o código da figurinha!");
		this.jtfCodigo.setPreferredSize(new Dimension(306, 40));
		this.jtfCodigo.setBorder(new LineBorder(Color.white));
		this.jtfCodigo.setBounds(373, 53, 130, 40);

		this.jlb1 = new JLabel("Item:");
		this.jlb1.setFont(new Font("Arial",Font.BOLD,15));
		this.jlb1.setBounds(197, 95, 500, 40);
		this.jlb1.setForeground(new Color(71, 71, 71));
		
		this.jtf1 = new JTextField(ControleProprietario.proprietario.getAlbumFigurinha().get(i).getFigurinhaFWC().get(k).getItensLimitados());
		this.jtf1.setToolTipText("Insira o item apresentado na figurinha!");
		this.jtf1.setPreferredSize(new Dimension(306, 40));
		this.jtf1.setBorder(new LineBorder(Color.white));
		this.jtf1.setBounds(197, 135, 306, 40);
		
		this.jbtSalvar = new JButton("Salvar");
		this.jbtSalvar.setFont(new Font("Arial", Font.BOLD, 18));
		this.jbtSalvar.setForeground(Color.white);
		this.jbtSalvar.setBackground(new Color(136, 22, 55));
		this.jbtSalvar.setBorder(new LineBorder(new Color(136, 22, 55)));
		this.jbtSalvar.setBounds(197, 195, 130, 40);
		this.jbtSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == jbtSalvar) {
					edit(i, k);
				}
				}
				});
		
		this.jbtExcluir = new JButton("Excluir");
		this.jbtExcluir.setFont(new Font("Arial", Font.BOLD, 18));
		this.jbtExcluir.setForeground(Color.white);
		this.jbtExcluir.setBackground(new Color(136, 22, 55));
		this.jbtExcluir.setBorder(new LineBorder(new Color(136, 22, 55)));
		this.jbtExcluir.setBounds(373, 195, 130, 40);
		this.jbtExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == jbtExcluir) {
					excluir(i, k);
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
	
	public void excluir(int i, int k) {	
		int r = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir a figurinha?", "Atenção!", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
		if(r == JOptionPane.YES_OPTION){
			ControleProprietario excluir = new ControleProprietario();
			excluir.excluirFigurinha_FWC(ControleProprietario.proprietario.getAlbumFigurinha().get(i).getFigurinhaFWC().get(k), i);
		
			new PanelAlbumQatar(i).setVisible(true);
			PanelEditarFigurinhaFWC.this.dispose();
		} else if (r == JOptionPane.NO_OPTION) {
		}
	}
	
	public void edit(int i, int k) {
		
		if(this.jtfCodigo.getText().isEmpty() && this.jtf1.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Coloque os dados da Figurinha!", "Atenção!", JOptionPane.ERROR_MESSAGE);
	 	} else if(this.jtfCodigo.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Coloque o código da Figurinha!", "Atenção!", JOptionPane.ERROR_MESSAGE);
		} else if(this.jtf1.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Informe o item descrito na Figurinha!", "Atenção!", JOptionPane.ERROR_MESSAGE);
		} else{
			if(ControleInformacoesPessoais.checkIdade(jtfCodigo.getText())) {
			
			JOptionPane.showMessageDialog(null, "Figurinha editada com sucesso!", "Parabéns!", JOptionPane.DEFAULT_OPTION);
		
		ControleProprietario album = new ControleProprietario();
	    String item = this.jtf1.getText();
	    String codigo = this.jtfCodigo.getText();
	    
		int c = Integer.parseInt(codigo);	

	    album.editarFigurinha_FWC(i, k, c, item);
	    
	    new PanelAlbumQatar(i).setVisible(true);
	    dispose();
	    
			} else {
				JOptionPane.showMessageDialog(null, "Digite apenas números no Código da Figurinha!", "Atenção!", JOptionPane.ERROR_MESSAGE);
			}
			}
	}	

	@Override
	public void actionPerformed(ActionEvent e) {
	}	
}