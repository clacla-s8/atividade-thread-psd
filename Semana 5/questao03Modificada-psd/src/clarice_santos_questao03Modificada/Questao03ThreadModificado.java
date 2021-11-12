package clarice_santos_questao03Modificada;

public class Questao03ThreadModificado implements Runnable {
	private int limiteContador;
	private String nome;

	public Questao03ThreadModificado(int limiteContador, String nome) {		
		this.limiteContador = limiteContador;
		this.nome = nome;
		new Thread(this).start();
	}

	@Override
	public void run() {

		while (Questao03ControllerModificado.contadorGlobal <= limiteContador) {
			System.out.println("Thread: "+nome+" - contador Global: " + Questao03ControllerModificado.contadorGlobal);
			Questao03ControllerModificado.contadorGlobal++;
		}
		

	}

}
