package clarice_santos_questao04Fila;

public class FilaInteiro implements FilaInt {

	private static int[] vetorEstrutura;
	private int quantidade;
	private int inicio;
	private int fim;
	private boolean acesso = false;

	/*
	 * Construtor usado para efetuar o SETUP da instancia??o da FILA.
	 */
	public FilaInteiro(int tamanhoFila) {
		vetorEstrutura = new int[tamanhoFila];
		quantidade = 0;
		inicio = -1;
		fim = -1;
	}

	@Override
	public void enqueue(int value) {
		acesso = true;
		// Se est? vazia
		if (isEmpty()) {
			inicio++;
			fim++;
			vetorEstrutura[inicio] = value;
			quantidade++;
		} else {
			if (!isFull()) { // Se n?o estiver cheia
				fim++;
				vetorEstrutura[fim] = value;
				quantidade++;
			} else {
				// Poder?amos lan?ar uma exception caso ela estivesse cheia ou mudar o m?todo
				// para
				// retornar TRUE ou FALSE, TRUE caso conseguisse inserir e FALSE caso n?o fosse
				// poss?vel.
			}
		}
		acesso = false;
		Questao04ControllerModificado.contadorGlobal++;
	}

	@Override
	public int dequeue() {
		acesso = true;
		int valorRetorno = 0; // O NetBeans obriga a declarar com algum valor esta vari?vel, isso n?o
								// significa que esse valor desta linha
		// ser? retornado em algum momento, pois se a Fila estiver vazia, podemos
		// retornar algum erro e o return ao final do m?todo
		// s? ser? alcan?ado se a fila n?o for vazia.

		if (isEmpty()) {
			// Poderiamos retornar uma exception para indicar que j? est? vazia
		} else {
			// Obtendo o primeiro da fila para que seja retornado.
			valorRetorno = vetorEstrutura[inicio];
			// inicio == fim => h? apenas 1 valor na fila, tamb?m pode ser quantidade == 1;
			if (inicio == fim) {
				// Se h? apenas um elemento na fila zerar tudo.
				inicio = -1;
				fim = -1;
				quantidade--;
			} else {
				// Caso contr?rio incrementar o valor da vari?vel inicio e reorganizar a fila
				// (trazer o segundo para o primeiro e assim por diante)
				inicio++;
				Reorganizar();
			}
		}
		acesso = false;
		return valorRetorno;
	}

	@Override
	public int front() {
		throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
																		// Tools | Templates.
	}

	@Override
	public boolean isEmpty() {
		// se inicio == -1 ent?o est? vazia, esta forma verifica e retorna o valor
		// booleano da opera??o.
		return inicio == -1;
	}

	@Override
	public boolean isFull() {
		return fim == vetorEstrutura.length - 1;
	}

	@Override
	public int size() {
		return quantidade;
	}

	// Criei este m?todo fora da interface, mas dentro da classe que a implementa
	// para reorganizar o vetor ap?s um DEQUEUE
	private void Reorganizar() {
		for (int i = inicio; i <= fim; i++) {
			vetorEstrutura[i - 1] = vetorEstrutura[i];
		}
		// Como todos os valores foram uma casa para a esquerda, os ponteiros tamb?m
		// devem ser corrigidos.
		inicio--;
		fim--;
	}

	// M?todo extra para exibir o estado da fila;
	public String ExibirFila() {
		String fila = "";
		if (!isEmpty()) {
			for (int i = inicio; i <= fim; i++) {
				fila += vetorEstrutura[i] + ", ";
			}
		}
		return fila;
	}

	@Override
	public String toString() {
		return vetorEstrutura + "";
	}

	public int getFim() {
		return fim;
	}

	public int getInicio() {
		return inicio;
	}

	public boolean isAcesso() {
		return acesso;
	}

}