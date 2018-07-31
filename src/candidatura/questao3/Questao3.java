package candidatura.questao3;



public class Questao3 {
	public static void main(String[] args) {
		
		int contador=0;
		
		int R = (int)(Math.random()*11);
		int S = (int)(Math.random()*1001);
		System.out.println("Randômico R: "+ R);
		System.out.println("Randômico S:" + S);
		
		
		for (int j=1;j<=S;j++) {
			if(R%j==0){
				
					contador=contador+j;
				
			}
			System.out.println(j);
		}
		System.out.println("Resultado da soma dos divisores: "+ contador);
		
	}




	
	//Questão 3 - Obtenha dois números randômicos R e S e imprima no console a soma dos divisores de R existentes entre 1 e S. 
//Sendo: 1 <= R <= 10 
//	     1 <= S <= 100

}