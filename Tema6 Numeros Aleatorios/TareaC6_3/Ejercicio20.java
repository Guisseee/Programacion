/* Programa que que pinte por pantalla una cuba con cierta cantidad de agua. La capacidad será indicada por el usuario.
*Autor: Guillermo jauregui Lahoz
*/
import java.util.Scanner;
public class Ejercicio20 {
  public static void main(String[] args) {

    System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
    int capacidad = s.nextInt();

    System.out.println();
    
    // Rellena la cuba con unos litros aleatorios
    // teniendo en cuenta no pasarse de la capacidad.
    int litros = (int)(Math.random() * (capacidad + 1));
        
    for (int i = 0; i < capacidad; i++) {
      if (i < (capacidad - litros)) {
        System.out.println("#    #");
      } else {
        System.out.println("#====#");
      }
    }
        
    System.out.println("######");
    System.out.print("La cuba tiene una capacidad de " + capacidad);
    System.out.print(" litros y contiene " + litros + " litros de agua.");
  }
