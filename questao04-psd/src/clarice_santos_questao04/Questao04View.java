package clarice_santos_questao04;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Questao04View extends JFrame{
	
private static final long serialVersionUID = 1L;

	
	JTextField campoQtThread;
	JTextField campoLimiteContador;
	JButton botaoConfirmar;	
	
	
	
	public void telaProjeto() {

		Container janela = getContentPane();
		setLayout(new FlowLayout());

		JLabel labelQtThread = new JLabel("Digite quantidade de threads: ");

		campoQtThread = new JTextField(20);
		
		JLabel labelLimiteContador = new JLabel("Digite o limite do contador: ");
		campoLimiteContador = new JTextField(20);		
		
		botaoConfirmar = new JButton("OK");
		
		labelQtThread.setBounds(50, 40, 100, 20);
		labelLimiteContador.setBounds(50, 40, 100, 20);	
		campoQtThread.setBounds(50, 40, 100, 20);
		campoLimiteContador.setBounds(50, 40, 100, 20);
		botaoConfirmar.setBounds(50, 50, 100, 50);
		
		janela.add(labelQtThread);
		janela.add(campoQtThread);
		janela.add(labelLimiteContador);
		janela.add(campoLimiteContador);
		janela.add(botaoConfirmar);
		
		
		
		setSize(250, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}



	public JTextField getCampoQtThread() {
		return campoQtThread;
	}



	public void setCampoQtThread(JTextField campoQtThread) {
		this.campoQtThread = campoQtThread;
	}



	public JTextField getCampoLimiteContador() {
		return campoLimiteContador;
	}



	public void setCampoLimiteContador(JTextField campoLimiteContador) {
		this.campoLimiteContador = campoLimiteContador;
	}



	public JButton getBotaoConfirmar() {
		return botaoConfirmar;
	}



	public void setBotaoConfirmar(JButton botaoConfirmar) {
		this.botaoConfirmar = botaoConfirmar;
	}
	
	
	

}
