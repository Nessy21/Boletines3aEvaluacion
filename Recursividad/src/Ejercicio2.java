
public class Ejercicio2 {
/* Realizar la funci�n recursiva que recibiendo dos n�meros (suponer enteros mayores que 0)
realice el producto de uno por el otro mediante sumas (no utlizando el operador * ni m�todos
auxiliares).
*/
	public static int producto (int n1, int n2) {
		
		if (n1<0||n2<0) {
			System.out.println("Introduce n�meros positivos");
		}
		else if(n2==1) {
			return n1; //cualquier numero multiplicado por 1 es el numero
		}
		else {
			return n1 + producto(n1, n2 -1 );
		}
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.println("El resultado del producto es: " + producto (2,2));

	}

}//class
