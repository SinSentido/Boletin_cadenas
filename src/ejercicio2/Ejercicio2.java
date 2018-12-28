package ejercicio2;
import static keyboard.Keyboard.*;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		/*
		 * 1. Se le pide una cadena con espacios al usuario.
		 * 2. Se recorre la cadena que ha introducido el usuario.
		 * 	2.1 Si el carácter no es un espacio en blanco se concatena a otra cadena.
		 * 	2.2 Si el carácter es un espacio se salta.
		 * 3. Se muestra la cadena sin espacios.
		 * */
		
		String spaces;
		String noSpaces;
		
		//1. Se le pide una cadena con espacios al usuario.
		System.out.println("Introduce una cadena con espacios: ");
		spaces = readString();
		noSpaces = removeSpaces(spaces);
		//3. Se muestra la cadena sin espacios.
		System.out.println(noSpaces);
	}
	
	public static String removeSpaces(String s) {
		String s2 = "";
		//2. Se recorre la cadena que ha introducido el usuario.
		for(int i=0; i<s.length(); i++) {
			 //2.1 Si el carácter no es un espacio en blanco se concatena a otra cadena.
			 //2.2 Si el carácter es un espacio se salta.
			if(s.charAt(i) != ' ') {
				s2 += s.charAt(i);
			}
		}
		return s2;
	}
}
