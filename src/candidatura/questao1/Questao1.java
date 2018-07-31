package candidatura.questao1;



public class Questao1 {

	public static void main(String[] args) {

		int random = (int) (Math.random() * 100);
		System.out.println(random);

		for (int i = 0; i <= random; i++) {
			if (i % 2 == 0) {
				if (i % 5 != 0) {
					System.out.println(i);
				}
			}
		}
	}
}
