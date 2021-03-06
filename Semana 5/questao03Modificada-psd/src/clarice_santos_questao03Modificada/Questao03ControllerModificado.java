package clarice_santos_questao03Modificada;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Questao03ControllerModificado implements ActionListener {
	Questao03ViewModificado questao03;

	public static int contadorGlobal = 0;

	public Questao03ControllerModificado(Questao03ViewModificado questao03) {
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

			List<Questao03ThreadModificado> list = new ArrayList<Questao03ThreadModificado>();

			for (int i = 0; i < qthreads; i++) {

				Questao03ThreadModificado thread = new Questao03ThreadModificado(limiteContador, i + "");

				list.add(thread);
			}

		}
	}

}
