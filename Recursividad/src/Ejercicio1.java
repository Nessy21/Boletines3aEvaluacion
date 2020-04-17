
public class Ejercicio1 {
/*Realizar de forma recursiva la potencia de un número. La cabecera de la función recibirá
como parámetros la base y el exponente como números enteros (mayores o iguales a 0).*/
	
	
	static int potencia (int base, int exp) {
		
		if (base>=0) {//numeros positivos
			
			if(exp==0){//cualquier num elevado a 0 = 1
				return 1;
			}else if (exp ==1) { // es la misma base
				return base;
			}
			else if (exp < 0){ //exponente negativo 
				System.out.println("El exponente ha de ser positivo");
			}
			else {// exp > 0
				
				return base * potencia (base, exp - 1 );//
			}
		}//if principal
		else {
			System.out.println("La base ha de ser positiva");
		}
		return 0;
	}//potencia
	
	public static void main(String[] args) {
		System.out.println("El resultado es: " + potencia (3, 2));
	}
}//class
