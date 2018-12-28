package ejercicio3;
import static keyboard.Keyboard.*;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		/*
		 *1. Se le pide una cadena al usuario
		 *2. Se repasa cada caracter de la cadena.
		 *	2.1. Si el caracter es una vocal se suma 1.
		 *	2.2. Si el carácter no es una vocal no se hace nada.
		 *3. Se muestra el número de vocales en la cadena.
		 * */
		
		String s;
		
		//1. Se le pide una cadena al usuario.
		System.out.println("Escribe una cadena: ");
		s = readString();
		
		//3. Se muestra el número de vocales de la cadena.
		System.out.println(numVowels(s));
	}

	public static int numVowels(String s) {
		int counter = 0;
		s = s.toLowerCase();
		//2. Se repasa cada caracter de la cadena.
		for(int i=0; i<s.length(); i++) {
			//2.1. Si el caracter es una vocal se suma 1.
			//2.2. Si el carácter no es una vocal no se hace nada.
			if(s.charAt(i) == 'a' ||s.charAt(i) == 'e' ||s.charAt(i) == 'i' ||s.charAt(i) == 'o' ||s.charAt(i) == 'u') {
				counter++;
			}
		}
		return counter;
	}
}
