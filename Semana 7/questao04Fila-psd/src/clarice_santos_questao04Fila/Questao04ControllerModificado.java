package clarice_santos_questao04Fila;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Questao04ControllerModificado implements ActionListener {
	Questao04ViewModificado questao04;
	public static ThreadGroup group = new ThreadGroup("");

	public static int contadorGlobal = 0;
	public static FilaInteiro filaInteiro = new FilaInteiro(100);

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

				Questao04ThreadModificado thread = new Questao04ThreadModificado(limiteContador, (i + 1) + "");

				list.add(thread);
			}

			int contador = 0;
			Iterator<Questao04ThreadModificado> iterator = list.iterator();
			while (iterator.hasNext()) {
				if (!Questao04ControllerModificado.filaInteiro.isAcesso()) {
					Thread t = iterator.next();
					t.start();
				}
			}

		}
	}

	public static synchronized void incrementarFila(String nome) {
		if (!filaInteiro.isAcesso()) {
			filaInteiro.enqueue(contadorGlobal);
			System.out.println("Thread: " + nome + " - Fila: " + filaInteiro.ExibirFila());

		}
	}

}
