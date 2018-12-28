package ejercicio11;
import static keyboard.Keyboard.*;

public class Ejercicio11 {
	public static void main(String[] args) {
	
		/*
		 * 1. Se le pide una cadena al usuario 
		 * 2. El usuario elige que carácter quiere reemplazar en la cadena y el carácter que lo sustituye.
		 * 3. Se recorre la cadena copiando cada carácter.
		 * 	3.1 Si el carácter no coincide con el que hay que reemplazar se copia normalmente
		 * 	3.2 Si el carácter coincide se copia el caracter sustituto.
		 * 4. Se muestra la cadena con los carácteres sustituidos.
		 * */
		
		String s;
		char a, b;
		
		//1. Se le pide una cadena al usuario 
		System.out.println("Escribe una cadena:");
		s = readString();
		//2. El usuario elige que carácter quiere reemplazar en la cadena y el carácter que lo sustituye.
		System.out.println("Elige el carácter de la cadena que quieres sustituir:");
		a = readChar();
		System.out.println("Elige el carácter por el que lo quieres sustituir:");
		b = readChar();
		
		//4. Se muestra la cadena con los carácteres sustituidos.
		System.out.println(replace(s, a, b));
	}
	
	public static String replace(String s, char replace, char replacer) {
		String s2 = "";
		//3. Se recorre la cadena copiando cada carácter.
		for(int i=0; i<s.length(); i++) {
			//3.1 Si el carácter no coincide con el que hay que reemplazar se copia normalmente
			if(s.charAt(i) != replace) {
				s2 += s.charAt(i);
			}
			//3.2 Si el carácter coincide se copia el caracter sustituto.
			else {
				s2 += replacer;
			}
		}
		return s2;
	}
	
	

}
