package candidatura.questao2;

public class Questao2 {
	
	public static void main(String[] args) {
		
		int R = (int)(Math.random()*11);
		int S = (int)(Math.random()*101);
		System.out.println("Rand�mico R: "+ R);
		System.out.println("Rand�mico S: "+ S+"\n");
		
		for (int i=1;i<=S;i++) {
			if(i%2==0) {
				
				System.out.println(i);
			}
			int multiplo = (R*2);
			if(i==multiplo){
				System.out.println("M�ltiplo do dobro de R encontrado");
				break;
			}
			
			
			
		}
	}

}
