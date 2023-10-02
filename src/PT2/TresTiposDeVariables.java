package PT2;

public class TresTiposDeVariables {

	public static void main(String[] args) {
		// Declaramos los tres tipos de variables
		int n = 5;
		double a = 4.56;
		char c = 'a';
		
		// Mostramos valor de cada variable
		System.out.println("Variable N = " + n);
		System.out.println("Variable A = " + a);
		System.out.println("Variable C = " + c);
		
		//calculamos y mostramos suma de N+A
		double operacion = n + a;
		System.out.println(n + " + " + a + " = " + operacion);
		
		//calculamos y mostramos diferencia entre A-N
		operacion = a - n;
		System.out.println(a + " - " + n + " = " + operacion);
		
		//mostramos el valor numérico de la variable C
		System.out.println("Valor numérico de caracter " + c + " = " + Integer.valueOf(c));
		
	}

}
