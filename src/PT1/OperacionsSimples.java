package PT1;

public class OperacionsSimples {

	public static void main(String[] args) {
		// Declaramos las dos variables numericas
		int num1 = 18;
		int num2 = 7;
		
		// Declaramos variables de operaciones y calculamos 
		int suma = num1 + num2;
		int resta = num1 - num2;
		int multiplicacion = num1 * num2;
		float division = num1;
		division = division / num2;
		int modulo = num1 % num2;
		
		// Mostramos resultados
		System.out.println("La suma de " + num1 + " mas " + num2 + " = " + suma);
		System.out.println("La resta de " + num1 + " menos " + num2 + " = " + resta);
		System.out.println("La multiplicación de " + num1 + " por " + num2 + " = " + multiplicacion);
		System.out.println("La división de " + num1 + " entre " + num2 + " = " + String.format("%.2f", division));
		System.out.println("La modulo de " + num1 + " entre " + num2 + " = " + modulo);

	}

}
