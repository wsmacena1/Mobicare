package candidatura.questao4;

public class Questao4 {
	private  int diasMes(int mes) {
		switch (mes) {
		case 4:case 6:case 9:case 11:
			System.out.println("Mês com 30 dias.");
			break;
		case 2:
			System.out.println("Mês com menos de 30 dias.");
			break;
		case 1:case 3: case 5: case 7: case 8: case 10: case 12: 
			System.out.println("Mês com 31 dias");
			break;
		}
		return mes;
		
	}
	
	public  int qualDiaMes() {
		int  random = (int)(Math.random()*13);
		return random;
	}

	public static void main(String[] args) {

		Questao4 d2 = new Questao4();
		Questao4 d = new Questao4();
		
		
		System.out.println(d2.qualDiaMes());
		System.out.println(d.diasMes(3));
		
		
	}
}
