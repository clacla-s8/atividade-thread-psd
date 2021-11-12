package clarice_santos_questao02;



public class PrincipalQuestao02 {

	public static void main(String[] args) {
		Questao02View q2 = new Questao02View();
		q2.telaProjeto();

		new Questao02Controller(q2);

	}
}
