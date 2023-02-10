/* Programa que muestra 15 numeros aleatorios entre 0 y 9 con decimales.
 * 
 * Autor: Guillermo Jáuregui Lahoz
 * 
 */
public class Ejemplo3 {
  public static void main(String[] args) {
	
	System.out.println("15 números aleatorios entre 0 y 9 (sin decimales):");
	
	for (int i = 1; i <= 15; i++) {
	System.out.print((int)(Math.random()*10) + " ");
	}
	System.out.println();
  }
}
