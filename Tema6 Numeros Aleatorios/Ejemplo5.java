/* Programa que muestra 15 numeros aleatorios entro 50 y 60.
 * 
 * Autor: Guillermo Jáuregui Lahoz
 * 
 */
public class Ejemplo5 {
  public static void main(String[] args) {
	
	System.out.println("15 números aleatorios entre 50 y 60 (sin decimales):");
	
	for (int i = 1; i <= 15; i++) {
	System.out.print(((int)(Math.random()*11) + 50 ) + " ");
	}

	System.out.println();
  }
}
