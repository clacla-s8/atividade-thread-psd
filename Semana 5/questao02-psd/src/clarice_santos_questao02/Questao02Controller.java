package clarice_santos_questao02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Questao02Controller implements ActionListener {
	Questao02View questao02;

	public Questao02Controller(Questao02View questao02) {
		super();
		this.questao02 = questao02;
		questao02.getBotaoConfirmar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object o = e.getSource();

		if (questao02.getBotaoConfirmar() == o) {
			int valorInteiroPrimo = Integer.parseInt(questao02.getCampoValor().getText());
			int valorInteiroThread = Integer.parseInt(questao02.getCampoValorThread().getText());

			int valorDividido = valorInteiroPrimo / valorInteiroThread;
			List<Questao02Thread> list = new ArrayList<Questao02Thread>();

			int inicio = 1;
			int fim = 0;
			for (int i = 0; i < valorInteiroThread; i++) {

				fim += valorDividido;
				if (i == valorInteiroThread - 1)
					fim = valorInteiroPrimo;
				Questao02Thread t = new Questao02Thread(inicio, fim);
				//System.out.println(inicio + " - " + fim);
				inicio += valorDividido;

				list.add(t);
			}

			/*botei esse sleep aqui para que as threads pudessem executar, 
			 * sem o sleep n?o executa as threads corretamente, n?o da tempo de popular o array com os numeros.
			 */
			try {
				Thread.sleep(3 * 1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}

			
			String retorno = "";
			for (Questao02Thread t : list) {
				
				System.out.println("Thread: " + t.getInteiros());

				retorno += String.join(", ", t.getInteiros());

			}
			
			questao02.getLabelImpressao().setText("Numeros Primos de 1 a " + valorInteiroPrimo + ": " + retorno);


		}

	}

}
