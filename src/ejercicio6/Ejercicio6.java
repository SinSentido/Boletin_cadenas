package ejercicio6;
import static keyboard.Keyboard.*;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		/*
		 * 1. Se le piden 2 cadenas al usuario.
		 * 2. Se recorre la primera cadena y se va concatenando cada caracter a una tercera cadena.
		 * 3. Se recorre la segunda cadena y se va concatenando cada caracter a una tercera cadena.
		 * 4. Se muestra la tercera cadena que es la combinación de las 2 anteriores.
		 * */
		
		String s, s2;
		//1. Se le piden 2 cadenas al usuario.
		System.out.println("Introduce una cadena: ");
		s = readString();
		System.out.println("Introduce otra cadena: ");
		s2 = readString();
		
		//4. Se muestra la tercera cadena que es la combinación de las 2 anteriores.
		System.out.println(concatenator(s, s2));
	}
	
	public static String concatenator(String s, String s2) {
		String s3 = "";
		//2. Se recorre la primera cadena y se va concatenando cada caracter a una tercera cadena.
		for(int i=0; i<s.length(); i++) {
			s3 += s.charAt(i);
		}
		s3 += " "; //Se añade un espacio para separar de la siguiente cadena.
		//3. Se recorre la segunda cadena y se va concatenando cada caracter a una tercera cadena.
		for(int i=0; i<s2.length(); i++) {
			s3 += s2.charAt(i);
		}
		return s3;
	}
}
