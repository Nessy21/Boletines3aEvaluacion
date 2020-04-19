import java.util.Scanner;

public class Ejercicio5 {
	/*
	 * Realizar un m�todo recursivo que determine si un n�mero entero pasado por
	 * par�metro es par o no (sin usar operadores distintos a la resta - (no pod�is
	 * usar %, ni /, ni m�todos auxiliares)
	 */

	private static Scanner sc;

	public static int par(int num) {

		if (num == -1) {
			return -1;// si resto da uno retorna -1, es impar
		}

		else if (num == 0) {
			return 0;// si el resto es cero retorna 0, es par
		}

		return par(num - 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Introduce un numero");
		sc = new Scanner(System.in);
		num = sc.nextInt();
		int vAux = par(num);
		if (vAux == -1) {// cogemos lo que nos retorna y le damos un significado
			System.out.println("El numero es impar");
		} else {
			System.out.println("El numero es par");
		}
	}

}
