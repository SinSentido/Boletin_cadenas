package ejercicio9;
import static keyboard.Keyboard.*;

public class Ejercicio9 {
	public static void main(String[] args) {

		/*
		 * 1. Se le pide una cadena al usuario
		 * 2. Se recorre esa cadena al reves copiando cada carácter en otra cadena.
		 * 3. Se muestra la cadena resultante
		 * */
		
		String s;
		//1. Se le pide una cadena al usuario
		System.out.println("Escribe una cadena: ");
		s = readString();
		//3. Se muestra la cadena resultante
		System.out.println(reverse(s));
	}

	public static String reverse(String s) {
		String s2 = "";
		//2. Se recorre esa cadena al reves copiando cada carácter en otra cadena.
		for(int i=s.length()-1; i>=0; i--) {
			s2 += s.charAt(i);
		}
		return s2;
	}
}
