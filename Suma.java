package pruebaJunit;

public class Suma {

	private int num1;
	private int num2;
	
	public Suma(int n1, int n2) {
		this.num1=n1;
		this.num2=n2;
	}
	public int sumar() {
		int resultado=num1+num2;
		return resultado;
	}
}
