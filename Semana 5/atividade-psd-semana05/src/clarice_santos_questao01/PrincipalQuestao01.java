package clarice_santos_questao01;

public class PrincipalQuestao01 {

	public static void main(String[] args) {
		Questao01View  q1= new Questao01View();
		q1.telaProjeto();
		
		Questao01Controller q1Controler = new Questao01Controller(q1);
		
	}

}
