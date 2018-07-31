package candidatura.questao8;

public class Excecao{
	

	public static void main(String[] args)  {

		int[] numeros = { 4, 8, 5, 16, 32, 21, 64, 128 };
		int[] denom = { 2, 0, 4, 8, 0, 2, 4};

		for (int i = 0; i < numeros.length; i++) {
			try {
				
				if(numeros[i] % 2!= 0) {
					throw new ChecadaException(numeros[i], denom[i]);
				}
				if (denom[i] == 0) {
					throw new NaoChecadaException(numeros[i], denom[i]);
				}
				System.out.println(numeros[i] + "/" + denom[i] + " = " + (numeros[i] / denom[i]));
			} catch (ChecadaException  e) {
				System.out.println("Ocorreu um erro de divisão:  ");
				e.printStackTrace();
			}
			catch( NaoChecadaException ex) {
				System.out.println("Ocorreu um erro: ");
					ex.printStackTrace();
			}
			catch(ArrayIndexOutOfBoundsException exx) {
				System.out.println("Erro de array");
				exx.getMessage();
			}
		}
	}

}
