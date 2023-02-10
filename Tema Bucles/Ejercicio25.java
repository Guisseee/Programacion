/*Programa que pida un número por teclado y que luego
 *     muestre ese número al revés.
*
*Autor: Guillermo Jáuregui Lahoz.
*
*/
import java.util.Scanner;
public class Ejercicio25 {
  public static void main(String[] args) {
  Scanner s= new Scanner(System.in);
  
    System.out.print("Introduzca un número entero: ");
    int numeroIntroducido = s.nextInt();

    int numero = numeroIntroducido;
    int volteado = 0;
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    }
    
    System.out.print("Si le damos la vuelta al " + numeroIntroducido);
    System.out.println(" tenemos el " + volteado + ".");
  }
}
