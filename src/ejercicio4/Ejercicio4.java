package ejercicio4;
import static keyboard.Keyboard.*;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		/*
		 * 1. Se le pide una cadena al usuario.
		 * 2. El usuario elige que carácter quiere contar en la cadena.
		 * 3. Se repasa la cadena de principio a fin.
		 * 	3.1. Si el caracter de la cadena coincide con el que quiere contar el usuario se suma 1.
		 * 	3.2. Si no coincide no se hace nada.
		 * 4. Se muestra el número total de coincidencias de dicho carácter.
		 * */
		
		String s;
		char c;
		//1. Se le pide una cadena al usuario.
		System.out.println("Introduce una cadena: ");
		s = readString();
		//2. El usuario elige que carácter quiere contar en la cadena.
		System.out.println("Introduce el caracter que quieres contar dentro de la cadena: ");
		c = readChar();
		
		System.out.println(numLetter(c, s));
	}

	public static int numLetter(char c, String s) {
		int counter = 0;
		//3. Se repasa la cadena de principio a fin.
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == c) {
				counter++;
			}
		}
		return counter;
	}
}
