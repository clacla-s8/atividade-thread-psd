package clarice_santos_questao03Modificada;

public class PrincipalQuestao03Modificado {

	public static void main(String[] args) {
		Questao03ViewModificado q3 = new Questao03ViewModificado();
		q3.telaProjeto();

		 new Questao03ControllerModificado(q3);

	}

}
