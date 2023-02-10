/*Programa que Realiza el control de acceso a una caja fuerte.
 * 
 * Autor:Guillermo Jáuregui Lahoz
 * 
 */
import java.util.Scanner;
public class Ejercicio7 {
  public static void main(String[] args) {
  Scanner s= new Scanner(System.in);
    
    int intentos = 4;
    int numeroIntroducido;
    boolean acertado = false;
    
    do {
      System.out.print("Introduzca la clave de la caja fuerte: ");
      numeroIntroducido = s.nextInt();
      
      if (numeroIntroducido == 1313) {
        acertado = true;
      } else {
        System.out.println("Clave incorrecta");
      }
      
      intentos--;
  
    } while((intentos > 0) && (!acertado));
    
    if (acertado) {
      System.out.println("Ha abierto la caja fuerte.");
    } else {
      System.out.println("Lo siento, ha agotado las 4 oportunidades.");
    }
  }
}
