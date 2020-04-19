import java.util.Scanner;

public class Ejercicio4 {
/*Realizar un método de forma recursiva calcule si un número
 *  es primo o no (solo es divisible por si mismo y por la unidad).
*/
	private static Scanner sc;
	
	public static int primo (int num, int i) {
			if(i==1) {
				return 1;//si resto da uno retorna 1, es primo
			}
			else if(num%i==0) {
				return 0;//si el resto es cero retorna 0, no es primo 
			}
		
		return primo(num, i-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Introduce un numero");
			sc = new Scanner(System.in);
			num = sc.nextInt();
		int vAux=primo(num, num/2);	// i = num/2 (una variable auxiliar para recoger los returns)
		if (vAux==1) {//cogemos lo que nos retorna y le damos un significado
			System.out.println("El numero es primo");
		}
		else {
			System.out.println("El numero no es primo");
		}
	}

}
