package clarice_santos_questao02;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Questao02View extends JFrame {

private static final long serialVersionUID = 1L;

	
	JTextField campoValor;
	JTextField campoValorThread;
	JButton botaoConfirmar;
	
	JLabel labelImpressao;
	
	
	public void telaProjeto() {

		Container janela = getContentPane();
		setLayout(new FlowLayout());

		JLabel labelValor = new JLabel("Digite valor de N (numeros primos 1 a N): ");

		campoValor = new JTextField(20);
		
		JLabel labelValorThread = new JLabel("Digite quantidade de threads: ");
		campoValorThread = new JTextField(20);
		
		labelImpressao = new JLabel("");
		botaoConfirmar = new JButton("OK");

		labelValor.setBounds(50, 40, 100, 20);
		labelValorThread.setBounds(50, 40, 100, 20);	
		campoValor.setBounds(50, 40, 100, 20);
		campoValorThread.setBounds(50, 40, 100, 20);
		botaoConfirmar.setBounds(50, 50, 100, 50);
		
		
		janela.add(labelValor);
		janela.add(campoValor);
		janela.add(labelValorThread);
		janela.add(campoValorThread);
		janela.add(botaoConfirmar);
		janela.add(labelImpressao);
		
		
		setSize(350, 250);
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

	public JTextField getCampoValorThread() {
		return campoValorThread;
	}

	public void setCampoValorThread(JTextField campoValorThread) {
		this.campoValorThread = campoValorThread;
	}

	public JLabel getLabelImpressao() {
		return labelImpressao;
	}

	public void setLabelImpressao(JLabel labelImpressao) {
		this.labelImpressao = labelImpressao;
	}
	
	

	
	
	
}
