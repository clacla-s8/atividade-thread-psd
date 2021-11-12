package clarice_santos_questao04Fila;

public class Questao04ThreadModificado extends Thread {
	private int limiteContador;
	private String nome;

	public Questao04ThreadModificado(int limiteContador, String nome) {
		super(Questao04ControllerModificado.group, "");
		this.limiteContador = limiteContador;
		this.nome = nome;
	}

	@Override
	public void run() {

		while (Questao04ControllerModificado.contadorGlobal <= limiteContador) {
			try {
				Thread.sleep(1);
				Questao04ControllerModificado.incrementarFila(nome);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		try {
			Questao04ControllerModificado.group.interrupt();
			System.out.println("Interrompido");
		} catch (Exception e) {

		}

	}

}
