package clarice_santos_questao01;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Questao01View extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	JTextField campoValor;
	JButton botaoConfirmar;
	JLabel labelAviso;
	
	public void telaProjeto() {

		Container janela = getContentPane();
		setLayout(new FlowLayout());

		JLabel labelValor = new JLabel("Digite os segundos para deixar a aplica??o bloqueada: ");
		labelAviso = new JLabel("");

		campoValor = new JTextField(20);

		botaoConfirmar = new JButton("OK");

		labelValor.setBounds(50, 40, 100, 20);
		labelAviso.setBounds(50, 40, 100, 20);
		campoValor.setBounds(50, 40, 100, 20);
		botaoConfirmar.setBounds(30, 30, 30, 30);
		janela.add(labelValor);
		janela.add(campoValor);
		janela.add(botaoConfirmar);
		janela.add(labelAviso);
		
		setSize(400, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public JTextField getCampoValor() {
		return campoValor;
	}

	public void setCampoValor(JTextField campoValor) {
		this.campoValor = campoValor;
	}

	public JButton getBotaoConfirmar() {
		return botaoConfirmar;
	}

	public void setBotaoConfirmar(JButton botaoConfirmar) {
		this.botaoConfirmar = botaoConfirmar;
	}

	public JLabel getLabelAviso() {
		return labelAviso;
	}

	public void setLabelAviso(JLabel labelAviso) {
		this.labelAviso = labelAviso;
	}
	
	
	
	

}
