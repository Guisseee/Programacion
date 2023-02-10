/*Programa que  dados dos números, uno real (base) y un entero
positivo (exponente), saque por pantalla todas las potencias con base el
numero dado y exponentes entre uno y el exponente introducido.
 * Autor:Guillermo Jáuregui Lahoz
 * 
 */
import java.util.Scanner;
public class Ejercicio15 {
  public static void main(String[] args) {
  Scanner s= new Scanner(System.in);

    System.out.print("Introduzca la base: ");
    int base = s.nextInt();
    
    System.out.print("Introduzca el exponente máximo: ");
    int exponenteFinal = s.nextInt();

    int potencia;
    int exponente;
        
    for (int i = 1; i <= exponenteFinal; i++) {
        
      potencia = 1;
      exponente = i;
      
      for (int j = 0; j < exponente; j++) {
        potencia *= base;
      }
      
      System.out.println(base + "^" + i + " = " + potencia);
    }
  }
}
