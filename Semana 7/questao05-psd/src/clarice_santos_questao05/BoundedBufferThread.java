package clarice_santos_questao05;

public class BoundedBufferThread implements Runnable {

	private int limiteContador;
	private String nome;

	public BoundedBufferThread(int limiteContador, String nome) {
		this.limiteContador = limiteContador;
		new Thread(this).start();
	}

	@Override
	public void run() {
		for (int i = 0; i <= limiteContador; i++) {
			try {
				Thread.sleep(1);
				PrincipalBoundedBuffer.incrementarBuffer(nome);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
