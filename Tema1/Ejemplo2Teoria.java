/*programa que calcula la nota que necesitas sacar en el siguiente examen dependiendo de la media que se desee en el trimestre.
 * 
 * Autor:Guillermo Jáuregui Lahoz
 * 
 */
import java.util.Scanner;
public class Ejemplo2Teoria{
    public static void main (String[] args){
	Scanner s= new Scanner(System.in);
	System.out.print("¿Cual es el idioma oficial de Alemania? ");
	String idioma= s.next();
	idioma= idioma.toLowerCase();
	
	if ("aleman".equals(idioma)){
		System.out.print("La respuesta es correcta");
	} else{
		System.out.print("La respuesta es incorrecta");
	}
}
}
