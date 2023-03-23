/* Programa que pinte por pantalla una serpiente con un “serpenteo” aleatorio.
*Autor: Guillermo Jauregui Lahoz
*/
import java.util.Scanner;
public class Ejercicio22 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca la longitud de la serpiente ");
    System.out.print("contando la cabeza: ");
    int longitud = s.nextInt();
    
    // pinta la cabeza
    System.out.println("\n            @");
    
    // pinta el cuerpo
    int i;
    int x = 13;
        
    while (longitud > 1) {
      // suma -1, 0 o 1 a la variable x
      x += (int)(Math.random() * 3) - 1;
      
      
      for (i = 1; i < x; i++) {
        System.out.print(" ");
      }

      
      System.out.println("#");

      longitud--;
    }
  }
}
