/*programa que resuelva una ecuación de primer grado (del tipo ax+b = 0).
 * 
 * Autor: Guillermo Jáuregui Lahoz
 * 
 */
import java.util.Scanner;
public class Ej5Tema4 {
  public static void main(String[] args) {
  Scanner s= new Scanner(System.in);

    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
    System.out.print("Por favor, introduzca el valor de a: ");
    double a = s.nextDouble();
    System.out.print("Ahora introduzca el valor de b: ");
    double b = s.nextDouble();

    if (a == 0) {
      System.out.println("Esa ecuación no tiene solución real.");
    } else {
      System.out.println("x = " + (-b/a));
    }
  }
}
