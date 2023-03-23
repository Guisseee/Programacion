/* Programa que muestra 10 numeros aleatorios
 * 
 * Autor: Guillermo Jáuregui Lahoz
 * 
 */
public class Ejemplo1 {
  public static void main(String[] args) {
    
    System.out.println("Diez números aleatorios:\n");
    for (int i = 1; i < 16; i++) {
    System.out.println(Math.random());
    }
  }
}
