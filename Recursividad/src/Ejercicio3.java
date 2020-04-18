
public class Ejercicio3 {

/*Realizar el siguiente método de forma recursiva, 
 * sabiendo que tiene que imprimir una cadena al revés*/
	
	private static String obtenerReverso (String cadena, int pos) {
		
		if (pos==0) {//termina cuando pos sea cero (primera letra)
			return cadena.charAt(pos)+"";//caracter en x posicion + la cadena
		}
		else {
			return cadena.charAt(pos) + obtenerReverso (cadena, pos-1);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "Mensaje";
		System.out.println(obtenerReverso(cadena, cadena.length()-1));
	}

}
