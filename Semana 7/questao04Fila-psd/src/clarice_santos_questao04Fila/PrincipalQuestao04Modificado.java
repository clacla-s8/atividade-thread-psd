package clarice_santos_questao04Fila;

public class PrincipalQuestao04Modificado {

	public static void main(String[] args) {
		Questao04ViewModificado q3 = new Questao04ViewModificado();
		q3.telaProjeto();

		 new Questao04ControllerModificado(q3);

	}

}
