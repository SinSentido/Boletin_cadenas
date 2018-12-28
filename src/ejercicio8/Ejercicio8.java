package ejercicio8;
import static keyboard.Keyboard.*;

public class Ejercicio8 {
	public static void main(String[] args) {
	
		/*
		 * 1. Se le pide una cadena al usuario
		 * 2. El usuario indica el número de carácteres finales n que quiere copiar.
		 * 3. Se recorre la cadena desde el número total de carácteres de la cadena - n hasta el final.
		 * 4. Se copian los caracteres en ese trozo a otra cadena.
		 * 5. Se muestra la cadena resultante por pantalla.
		 * */
		
		String s;
		int n;
		//1. Se le pide una cadena al usuario
		System.out.println("Introduce una cadena: ");
		s = readString();
		//2. El usuario indica el número de carácteres finales n que quiere copiar.
		System.out.println("Introduce el número de carácteres que quieres copiar por el final: ");
		n = readInt();
		//5. Se muestra la cadena resultante por pantalla.
		System.out.println(finalChars(s, n));
	}
	
	public static String finalChars(String s, int n) {
		String s3 = "";
		//3. Se recorre la cadena desde el número total de carácteres de la cadena - n hasta el final.
		for(int i=s.length()-(n); i<s.length(); i++ ) {
			//4. Se copian los caracteres en ese trozo a otra cadena.
			s3 += s.charAt(i);
		}
		return s3;
	}
}
