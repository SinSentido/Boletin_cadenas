package ejercicio7;
import static keyboard.Keyboard.*;

public class Ejercicio7 {
	public static void main(String[] args) {
		
		/*
		 * 1. Se le pide al usuario una cadena.
		 * 2. El usuario elige el número de carácteres n de esa cadena que quiere copiar
		 * 3. Se recorre la cadena hasta n copiando cada caracter
		 * 4. Se muestra la cadena resultante
		 * */
		
		String s;
		int n;
		
		//1. Se le pide al usuario una cadena.
		System.out.println("Introduce una cadena:");
		s = readString();
		//2. El usuario elige el número de carácteres n de esa cadena que quiere copiar
		System.out.println("Elige el número de carácteres de la cadena que quieres copiar:");
		n = readInt();
		
		//4. Se muestra la cadena resultante
		System.out.println(concatenatorN(s, n));
	}

	public static String concatenatorN(String s, int n) {
		String s2 = "";
		//3. Se recorre la cadena hasta n copiando cada caracter
		for(int i=0; i<n; i++) {
			s2 += s.charAt(i);
		}
		return s2;
	}
}
