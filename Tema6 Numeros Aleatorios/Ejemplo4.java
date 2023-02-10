/* Programa que muestra 15 numeros aleatorios entre 1 y 10
 * 
 * Autor: Guillermo Jáuregui Lahoz
 * 
 */
public class Ejemplo4 {
  public static void main(String[] args) {
	
	System.out.println("15 números aleatorios entre 1 y 10 (sin decimales):");
	
	for (int i = 1; i <= 15; i++) {
	System.out.print( (int)(Math.random()*10 + 1) + " ");
	
	}
	System.out.println();
  }
}
