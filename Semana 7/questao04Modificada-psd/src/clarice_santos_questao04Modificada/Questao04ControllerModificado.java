package clarice_santos_questao04Modificada;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Questao04ControllerModificado implements ActionListener {
	Questao04ViewModificado questao04;
	public static ThreadGroup group = new ThreadGroup("");

	public static int contadorGlobal = 0;

	public Questao04ControllerModificado(Questao04ViewModificado questao04) {
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

			List<Questao04ThreadModificado> list = new ArrayList<Questao04ThreadModificado>();

			for (int i = 0; i < qthreads; i++) {

				Questao04ThreadModificado thread = new Questao04ThreadModificado(limiteContador, i + "");

				list.add(thread);
			}

		}
	}

	public static synchronized void incrementarContador(String nome) {
		System.out.println("Thread: " + nome + " - contador Global: " + contadorGlobal);
		contadorGlobal++;
	}

}
