package ejercicio5;
import static keyboard.Keyboard.*;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		/*
		 * 1. Se le pide una cadena al usuario
		 * 2. El usuario elige un carácter que quiera utilizar como delimitador de la cadena
		 * 3. Se recorre la cadena buscando la primera y la última aparicón de ese carácter.
		 * 	3.1 Cuando hay una coincidencia se guarda esa posición del caracter.
		 * 	3.2 Si vuelve a haber otra coincidencia se guarda la nueva posición y se le resta la posición anterior.
		 * 4. Se le muestra al usuario el número total de caracteres.
		 * */
		
		String s;
		char c;
		//1. Se le pide una cadena al usuario
		System.out.println("Introduce una cadena:");
		s = readString();
		//2. El usuario elige un carácter que quiera utilizar como delimitador de la cadena
		System.out.println("Introduce un carácter:");
		c = readChar();
		
		//4. Se le muestra al usuario el número total de caracteres.
		System.out.println(numChar(s, c));
	}
	
	public static int numChar(String s, char c) {
		int counter = 0;
		//3. Se recorre la cadena buscando la primera y la última aparicón de ese carácter.
		for(int i=0; i<s.length(); i++) {
			//3.1 Cuando hay una coincidencia se guarda esa posición del caracter.
			//3.2 Si vuelve a haber otra coincidencia se guarda la nueva posición y se le resta la posición anterior.
			if(s.charAt(i) == c) {
				counter = i - counter;
			}
		}
		counter++; //Se le suma uno porque en las posiciones de los string se empieza a contar en 0 en lugar de 1.
		return counter;
	}
}
