package clarice_santos_questao04;

public class PrincipalQuestao04 {
	public static void main(String[] args) {
		Questao04View q4 = new Questao04View();
		q4.telaProjeto();

		new Questao04Controller(q4);

	}
}
