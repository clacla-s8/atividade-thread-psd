package clarice_santos_questao01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Questao01Controller implements ActionListener {

	Questao01View questao01;

	public Questao01Controller(Questao01View questao01) {
		super();
		this.questao01 = questao01;
		questao01.getBotaoConfirmar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object o = e.getSource();
		
		if(questao01.getBotaoConfirmar() == o) {
			int valorInteiro = Integer.parseInt(questao01.getCampoValor().getText());
			
			try {
				
				Thread.sleep(valorInteiro*1000);				
				questao01.getLabelAviso().setText("Aplica??o desbloqueada !!! ");
				System.out.println("fim");
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}

}
