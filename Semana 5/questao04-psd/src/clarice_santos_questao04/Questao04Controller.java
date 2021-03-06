package clarice_santos_questao04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;



public class Questao04Controller implements ActionListener {
	private Questao04View questao04;
	public static ThreadGroup group = new ThreadGroup("");
	
	public Questao04Controller(Questao04View questao04) {
		super();
		this.questao04 = questao04;
		questao04.getBotaoConfirmar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();

		if (questao04.getBotaoConfirmar() == o) {

			int qthreads = Integer.parseInt(questao04.getCampoQtThread().getText());
			int limiteContador = Integer.parseInt(questao04.getCampoLimiteContador().getText());

			List<Questao04Thread> list = new ArrayList<Questao04Thread>();

			for (int i = 0; i < qthreads; i++) {
				
				Questao04Thread thread = new Questao04Thread(limiteContador, i + "");

				list.add(thread);
			}

		}
	}

}
