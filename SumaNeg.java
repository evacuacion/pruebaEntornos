package pruebaJunit;

public class SumaNeg {
	
	private int neg1;
	private int neg2;
	
	public SumaNeg(int n1, int n2) {
		this.neg1=n1;
		this.neg2=n2;
	}
	
	public int sumarNegativos() {
		int resultado=neg1+neg2;
		return resultado;
	}
}
