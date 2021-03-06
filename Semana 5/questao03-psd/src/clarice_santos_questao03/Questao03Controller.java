package clarice_santos_questao03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public class Questao03Controller implements ActionListener {
	Questao03View questao03;

	public Questao03Controller(Questao03View questao03) {
		super();
		this.questao03 = questao03;
		questao03.getBotaoConfirmar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();

		if (questao03.getBotaoConfirmar() == o) {
			
			int qthreads = Integer.parseInt(questao03.getCampoQtThread().getText());
			int limiteContador = Integer.parseInt(questao03.getCampoLimiteContador().getText());

			
			List<Questao03Thread> list = new ArrayList<Questao03Thread>();

			
			for (int i = 0; i < qthreads; i++) {

				
				Questao03Thread thread = new Questao03Thread(limiteContador, i + "");
				

				list.add(thread);
			}


		}
	}

}
