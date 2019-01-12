package ejercicio12;
import static keyboard.Keyboard.*;

public class Ejercicio12 {
	public static void main(String[] args) {
		
		/*
		 * 1. Se le pide una cadena al usuario.
		 * 2. Se le pide una segunda cadena al usuario para buscar dentro de la primera cadena.
		 * 3. Se recorre la primera cadena hasta que se encuentra una coincidencia con el primer caracter de la segunda cadena.
		 * 4. Cuando se encuentre la coincidencia se comprueba si los caracteres siguientes coinciden con los de la segunda cadena.
		 * 5. Si la coincidencia de todos los carácteres es correcta se suma 1.
		 * 6. Se muestra la suma total de coincidencias.
		 * */
		
		String s1, s2;
		
		//1. Se le pide una cadena al usuario.
		System.out.println("Introuduce una cadena:");
		s1 = readString();
		//2. Se le pide una segunda cadena al usuario para buscar dentro de la primera cadena.
		System.out.println("Introduce una cadena para buscar dentro de la cadena anterior:");
		s2 = readString();
		
		//6. Se muestra la suma total de coincidencias.
		System.out.println(searcher(s1, s2));
		
	}
	
	public static int searcher(String mainString, String lookFor) {
		int counter=0, subcounter;;
		//3. Se recorre la primera cadena hasta que se encuentra una coincidencia con el primer caracter de la segunda cadena.
		for(int i=0; i<mainString.length(); i++) {
			if(mainString.charAt(i) == lookFor.charAt(0)) {
				subcounter = 0;
				//4. Cuando se encuentre la coincidencia se comprueba si los caracteres siguientes coinciden con los de la segunda cadena.
				for(int j=0; j<lookFor.length(); j++, i++) {
					if(lookFor.charAt(j) == mainString.charAt(i)) {
						subcounter++;
					}
				}
				//5. Si la coincidencia de todos los carácteres es correcta se suma 1.
				if(subcounter == lookFor.length()) {
					counter++;
				}
			}
		}
		return counter;
	}
}
