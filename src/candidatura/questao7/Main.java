package candidatura.questao7;



public class Main implements Contrato{
	
//	 void executar(String letra) {
//		executar(letra);
//}
	private String executar() {
		return "c";
	}

	public static void main(String[] args) {

		/* 7.4- Na classe Main, crie o método executar que recebe uma letra como parâmetro,
		 *  independente de ser maiúscula ou minúscula, e executa o método implementeMe da classe correspondente à letra recebida.*/
		
		Main main = new Main();
		A a = new A();
		B b = new B();
		C c = new C();
		
		
		if(main.executar()=="a" || main.executar()=="A") {
			System.out.println(a.implementeMe());
		}
		
		if(main.executar()=="b" || main.executar()=="B") {
			System.out.println(b.implementeMe());
		}
		
		if(main.executar()=="c" || main.executar()=="C") {
			System.out.println(c.implementeMe());
		}

	}

	@Override
	public String implementeMe() {
		// TODO Auto-generated method stub
		return null;
	}



}
