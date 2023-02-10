/*Programa que
*
*Autor: Guillermo Jáuregui Lahoz.
*
*/
import java.util.Scanner;
public class Ejercicio19 {
  public static void main(String[] args) {
  Scanner s= new Scanner(System.in);
   
    System.out.print("Por favor, introduzca la altura de la pirámide: ");
    int alturaIntroducida = s.nextInt();

    System.out.print("Introduzca el carácter de relleno: ");
    String relleno = s.next();
    
    int planta = 1;
    int longitudDeLinea = 1;
    int espacios = alturaIntroducida-1;
    
    while (planta <= alturaIntroducida) {

      for (int i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }

      for (int i = 1; i <= longitudDeLinea; i++) {
        System.out.print(relleno);
      }

      System.out.println();

      planta++;
      espacios--;
      longitudDeLinea += 2;
    }
  }
}
