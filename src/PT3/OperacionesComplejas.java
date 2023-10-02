package PT3;

public class OperacionesComplejas {

	public static void main(String[] args) {
		// Declaramos las variables int y double
		int x = 7;
		int y = 3;
		double n = 17.83;
		double m = 5.12;
		
		//declaramos variables para realizar las operaciones
		int operacion_entero;
		double operacion_decimal;
		
		
		// Mostramos valor de cada variable
		System.out.println("Variable X = " + x);
		System.out.println("Variable Y = " + y);
		System.out.println("Variable N = " + n);
		System.out.println("Variable M = " + m);
		
		//la suma de x+y
		operacion_entero = x+y;
		System.out.println(x + " + " + y + " = " + operacion_entero);
		
		//la diferencia entre x-y
		operacion_entero = x-y;
		System.out.println(x + " - " + y + " = " + operacion_entero);
		
		//el producto x*y
		operacion_entero = x*y;
		System.out.println(x + " * " + y + " = " + operacion_entero);
		
		//el cociente x/y
		operacion_decimal = x;
		operacion_decimal = operacion_decimal/y;
		System.out.println(x + " / " + y + " = " + operacion_decimal);
		
		//el resto x%y
		operacion_entero = x%y;
		System.out.println(x + " % " + y + " = " + operacion_entero);
		
		//la suma N+M
		operacion_decimal = n+m;
		System.out.println(n + " + " + m + " = " + operacion_decimal);
		
		//la diferencia entre N-M
		operacion_decimal = n-m;
		System.out.println(n + " - " + m + " = " + operacion_decimal);
		
		//el producto N*M
		operacion_decimal = n*m;
		System.out.println(n + " * " + m + " = " + operacion_decimal);
		
		//el cociente N/M
		operacion_decimal = n/m;
		System.out.println(n + " / " + m + " = " + operacion_decimal);
		
		//el resto N%M
		operacion_decimal = n%m;
		System.out.println(n + " % " + m + " = " + operacion_decimal);
		
		//la suma x+n
		operacion_decimal = x+n;
		System.out.println(x + " + " + n + " = " + operacion_decimal);
		
		//el cociente y/m
		operacion_decimal = y/m;
		System.out.println(y + " / " + m + " = " + operacion_decimal);
		
		//el resto y%m
		operacion_decimal = y%m;
		System.out.println(y + " % " + m + " = " + operacion_decimal);
		
		//el doble de cada variable
		operacion_entero = x*2;
		System.out.println(x + " * 2 = " + operacion_entero);
		operacion_entero = y*2;
		System.out.println(y + " * 2 = " + operacion_entero);
		operacion_decimal = n*2;
		System.out.println(n + " * 2 = " + operacion_decimal);
		operacion_decimal = m*2;
		System.out.println(m + " * 2 = " + operacion_decimal);
		
		//la suma de todas las variables
		operacion_decimal = x+y+n+m;
		System.out.println(x + " + " + y + " + " + n + " + " + m + " = " + operacion_decimal);
		
		//el producto de todas las variables
		operacion_decimal = x*y*n*m;
		System.out.println(x + " * " + y + " * " + n + " * " + m + " = " + operacion_decimal);

	}

}
