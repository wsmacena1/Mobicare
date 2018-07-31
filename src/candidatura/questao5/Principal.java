package candidatura.questao5;

public class Principal {

	public static void main(String[] args) {


		Mamifero m = new Mamifero();
		Ave a = new Ave();
		
		String mamifero;
		mamifero = m.comer()+"\n";
		mamifero+= m.dormir()+"\n";
		mamifero+= m.mamar()+"\n";
		
		String ave;
		ave = a.comer()+"\n";
		ave += a.dormir()+"\n";
		ave += a.voar()+"\n";
		
		
		System.out.println(mamifero);
		System.out.println(ave);

	}

}
