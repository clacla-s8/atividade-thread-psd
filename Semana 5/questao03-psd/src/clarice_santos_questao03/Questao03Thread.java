package clarice_santos_questao03;

public class Questao03Thread implements Runnable {
	private int limiteContador;
	private String nome;

	public Questao03Thread(int limiteContador, String nome) {
		
		this.limiteContador = limiteContador;
		this.nome = nome;
		new Thread(this).start();
		
	}

	@Override
	public void run() {
		
		for (int i = 0; i <= limiteContador; i++) {
			System.out.println("Thread " +nome+ " -> contador: " + i);
		}

	}

}
