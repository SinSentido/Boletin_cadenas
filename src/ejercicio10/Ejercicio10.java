package ejercicio10;
import static keyboard.Keyboard.*;

public class Ejercicio10 {
	public static void main(String[] args) {
		
		/*
		 * 1. Se le pide al usuario una cadena que tenga números.
		 * 2. Se recorre esa cadena y cada vez que se vea un número se va sumando.
		 * 3. Se muestra el valor total de todas las sumas.
		 * */
		
		String s;
		//1. Se le pide al usuario una cadena que tenga números.
		System.out.println("Escribe una cadena que contenga números: ");
		s = readString();
		//3. Se muestra el valor total de todas las sumas.
		System.out.println(counter(s));
	}
	
	public static int counter(String s) {
		int total = 0;
		//2. Se recorre esa cadena y cada vez que se vea un número se va sumando.
		for(int i=0; i<s.length(); i++) {
			if(Character.isDigit(s.charAt(i))){
				total += Character.getNumericValue(s.charAt(i));
			}
		}
		return total;
	}
}
