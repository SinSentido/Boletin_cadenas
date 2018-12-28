package ejercicio1;
import static keyboard.Keyboard.*; 

public class Ejercicio1 {
	public static void main(String[] args) {
		
		String s;
		
		/*
		 * 1. Se le pide al usuario que escriba True y se comprueba si lo ha escrito bien
		 * 2. Se le pide al usuario que escriba una palabra de 3 letras y se comprueba que está bien.
		 * 3. Se le pide al usuario que escriba 5 o más carácteres, sin incluir ñ, z ni x.
		 * 4. Se le pide al usuario que escriba una frase que no empiece por un número.
		 * 5. Se le pide al usuario que escriba una frase sin b
		 * 6. Se le pide al usuario que escriba un número menor de 300.
		 * 7. Se le pide al usuario que escriba un número de teléfono.
		 * 8. Se le pide al usuario que escriba un DNI.
		 * 9. Se le pide al usuario que escriba un nombre(sin espacios, primera letra mayuscula)
		 * 10. Se le pide al usuario que escriba una frase que empiece por vocal y sigan consonantes o nada.
		 * 11. Se le pide al usuario que escriba un correo electronico.
		 * */
		
		//1. Se le pide al usuario que escriba True y se comprueba si lo ha escrito bien
		do {
			System.out.println("Escribe \"True\": ");
			s = readString();
		}while(!s.matches("True"));
		
		//2. Se le pide al usuario que escriba una palabra de 3 letras y se comprueba que está bien.
		do {
			System.out.println("Escribe una palabra de 3 letras: ");
			s = readString();
		}while(!s.matches("[\\w]{2}[^0-9]"));
		
		//3. Se le pide al usuario que escriba 5 o más carácteres, sin incluir ñ, z ni x.
		do {
			System.out.println("Escribe 5 o más caracteres sin incluir Ñ, Z ni X");
			s = readString();
		}while(!s.matches("[\\w]{4,}[^ÑZX]"));
		
		//4. Se le pide al usuario que escriba una frase que no empiece por un número.
		do {
			System.out.println("Escribe una frase que no empiece por un número");
			s=readString();
		}while(!s.matches("[^\\d].*"));
		
		//5. Se le pide al usuario que escriba una frase sin b
		do {
			System.out.println("Escribe una frase que no contenga la letra b");
			s=readString();
		}while(!s.matches(".[^b]*"));

		//6. Se le pide al usuario que escriba un número menor de 300.
		do {
			System.out.println("Introduce un número menor de 300");
			s=readString();
		}while(!s.matches("[\\d]{1,2}||[1-2][\\d][\\d]"));
				
		//7. Se le pide al usuario que escriba un número de teléfono.
		do {
			System.out.println("Escribe tu número de teléfono");
			s=readString();
		}while(!s.matches("[0-9]{9}"));

		//8. Se le pide al usuario que escriba un DNI.
		do {
			System.out.println("Escribe tu DNI:");
			s=readString();
		}while(!s.matches("[0-9]{7}[\\w][^IÑOU]"));
				
		//9. Se le pide al usuario que escriba un nombre(sin espacios, primera letra mayuscula)
		do {
			System.out.println("Escribe tu nombre, con la primera letra en mayúscula y sin espacios:");
			s=readString();
		}while(!s.matches("[A-Z][a-z]*"));

		//10. Se le pide al usuario que escriba una frase que empiece por vocal y sigan consonantes o nada.
		do {
			System.out.println("Escribe una frase que empiece por vocal y continue con consonantes o nada:");
			s=readString();
		}while(!s.matches("[aeiouAEIOU][a-zA-Z]*[^aeiouAEIOU]"));
				
		//11. Se le pide al usuario que escriba un correo electronico.
		do {
			System.out.println("Escribe un correo electrónico válido");
			s=readString();
		}while(!s.matches("[\\w]*[@][\\w]*[\\.][a-zA-Z]*"));
	}

}
