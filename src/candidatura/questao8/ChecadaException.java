package candidatura.questao8;

public class ChecadaException extends Exception {

	private int num;
	private int dem;

	public ChecadaException(int num, int dem) {
		super();
		this.num = num;
		this.dem = dem;
	}

	@Override
	public String toString() {
		return "Resultado de " + num + " / " + dem + " não é um inteiro!";
	}

}
