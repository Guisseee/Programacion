/*Programa que e pinte la letra L por pantalla hecha con asteriscos. El
programa pedirá la altura.
*
*Autor: Guillermo Jáuregui Lahoz.
*
*/
import java.util.Scanner;
public class Ejercicio31 {
  public static void main(String[] args) {
  Scanner s= new Scanner(System.in);
  
    System.out.print("Introduzca la altura de la L: ");
    int altura = s.nextInt();

    for (int i = 1; i < altura; i++) {
      System.out.println("*");
    }

    for (int i = 0; i < altura / 2 + 1; i++) {
      System.out.print("* ");
    }

  }
}
