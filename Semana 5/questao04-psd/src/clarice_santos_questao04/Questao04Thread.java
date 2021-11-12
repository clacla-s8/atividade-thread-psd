package clarice_santos_questao04;

public class Questao04Thread implements Runnable {
	private int limiteContador;
	private String nome;

	public Questao04Thread(int limiteContador, String nome) {
		this.limiteContador = limiteContador;
		this.nome = nome;
		new Thread(Questao04Controller.group, this).start();

	}

	@Override
	public void run() {

		for (int i = 0; i <= limiteContador; i++) {
			try {
				Thread.sleep(1);
				System.out.println("Thread " + nome + " -> contador: " + i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (i == limiteContador) {
				Questao04Controller.group.interrupt();
				System.out.println("Interrompido");
			}
		}

	}
}
