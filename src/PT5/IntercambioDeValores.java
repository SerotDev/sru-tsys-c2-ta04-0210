package PT5;

public class IntercambioDeValores {

	public static void main(String[] args) {
		//declaramos las 4 variables y asignamos valores
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		
		//mostramos valores iniciales
		System.out.println("Valor inicial de A = " + a);
		System.out.println("Valor inicial de B = " + b);
		System.out.println("Valor inicial de C = " + c);
		System.out.println("Valor inicial de D = " + d);
		
		//declaramos variable para almacenar el valor auxiliar para que no desaparezca
		int aux = b;
		
		//b tome el valor de c
		b = c;
		
		//c tome el valor de a
		c = a;
		
		//a tome el valor de d
		a = d;
		
		//d tome el valor de b
		d = aux;
		
		//mostramos valores finales
		System.out.println("Valor final de A = " + a);
		System.out.println("Valor final de B = " + b);
		System.out.println("Valor final de C = " + c);
		System.out.println("Valor final de D = " + d);
		
	}

}
