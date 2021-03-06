package clarice_santos_questao02;

import java.util.ArrayList;
import java.util.List;

public class Questao02Thread implements Runnable {
	private int inicioThread;
	private int fimThread;
	private String inteiros;

	public Questao02Thread(int inicioThread, int fimThread) {
		super();
		this.inicioThread = inicioThread;
		this.fimThread = fimThread;
		this.inteiros = "";
		new Thread(this).start();
	}

	@Override
	public void run() {

		List<Integer> numeros = new ArrayList<Integer>();

		for (int i = inicioThread; i <= fimThread; i++) {
			numeros.add(i);
		}

		//System.out.println("Numeros: " + numeros);
		int contador;
		int numero = 0;
		for (Integer i : numeros) {
			contador = 0;

			for (int u = 1; u <= i; u++) {
				if (i % u == 0) {
					contador++;
					numero = u;
				}
			}

			if (contador == 2) {

				inteiros += numero + ", ";
			}
		}

	}

	public String getInteiros() {
		return inteiros;
	}

	

}
