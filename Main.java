package pruebaJunit;

public class Main {

	public static void main(String[] args) {
		Suma s= new Suma(2,3);
		System.out.println("La suma es: " + s.sumar());
		
		SumaNeg n= new SumaNeg(-10, -5); 
		System.out.println("La suma de negativos es: " + n.sumarNegativos());
	}

}
