/*Programa que pinte la letra U por pantalla hecha con asteriscos. El
programa pedirá la altura.
*
*Autor: Guillermo Jáuregui Lahoz.
*
*/
import java.util.Scanner;
public class Ejercicio33 {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    
    System.out.print("Introduzca la altura de la U: ");
    int altura = s.nextInt();

    for (int i = 1; i < altura; i++) {
      System.out.print("* ");
      for (int j = 2; j < altura; j++) {
        System.out.print("  ");
      }
      System.out.println("*");
    }

    System.out.print("  ");
    for (int i = 2; i < altura; i++) {
      System.out.print("* ");
    }

  }
}
