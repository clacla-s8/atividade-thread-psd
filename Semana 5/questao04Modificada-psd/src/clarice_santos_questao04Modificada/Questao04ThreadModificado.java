package clarice_santos_questao04Modificada;



public class Questao04ThreadModificado implements Runnable {
	private int limiteContador;
	private String nome;

	public Questao04ThreadModificado(int limiteContador, String nome) {		
		this.limiteContador = limiteContador;
		this.nome = nome;
		new Thread(Questao04ControllerModificado.group, this).start();
	}

	@Override
	public void run() {

		while (Questao04ControllerModificado.contadorGlobal <= limiteContador) {
			try {
				Thread.sleep(1);
				System.out.println("Thread: "+nome+" - contador Global: " + Questao04ControllerModificado.contadorGlobal);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Questao04ControllerModificado.contadorGlobal++;
			
			if (Questao04ControllerModificado.contadorGlobal == limiteContador) {
				Questao04ControllerModificado.group.interrupt();
				System.out.println("Interrompido");
			}
			
		}
		

	}

}
