package ejercicio13;
import static keyboard.Keyboard.*;

public class Ejercicio13 {
	public static void main(String[] args) {
	
		/*
		 * 1. Se le pide al usuario dos cadenas para contar palabras con los dos metodos. La seguna cadena debe tener más de un
		 * 	espacio seguido.
		 * 2. Se cuentan las palabras de dos maneras.
		 * 	2.1. La primera se reccore la cadena hasta que se encuentre un espacio y se suma 1 al contador.
		 *  2.2. La segunda opción se recorre la cadena y cada vez que se encuentre un caracter seguido de un espacio
		 *  se considerará que es una palabra y se sumará 1 al contador.
		 * 3. Se muestra el resultado con las dos maneras de contar palabras.
		 * */
		
		String s, s2;
		
		/*1. Se le pide al usuario dos cadenas para contar palabras con los dos metodos. La seguna cadena debe tener más de un
		 espacio seguido.*/
		System.out.println("Escribe una cadena para contar sus palabras: ");
		s = readString();
		System.out.println("Escribe una segunda cadena con más de un espacio seguido:");
		s2 = readString();
		
		//3. Se muestra el resultado con las dos maneras de contar palabras.
		System.out.println(wordCounter(s));
		System.out.println(wordCounterSpaces(s2));
		
	}
	
	//2.1. La primera se reccore la cadena hasta que se encuentre un espacio y se suma 1 al contador.
	public static int wordCounter(String s) {
		int counter = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == ' ') {
				counter++;
			}
		}
		//Aqui siempre que la cadena no acabe en espacio suma uno al contador porque si no nunca contaría la última palabra.
		if(s.charAt(s.length()-1) != ' ') {
			counter++;
		}
		return counter;
	}
	
	/*2.2. La segunda opción se recorre la cadena y cada vez que se encuentre un caracter seguido de un espacio
	 se considerará que es una palabra y se sumará 1 al contador.*/
	public static int wordCounterSpaces(String s) {
		int counter = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == ' ' && s.charAt(i-1) != ' ') {
				counter++;
			}
		}
		//Aqui siempre que la cadena no acabe en espacio suma uno al contador porque si no nunca contaría la última palabra.
		if(s.charAt(s.length()-1) != ' ') {
			counter++;
		}
		return counter;
	}
}
