/*Programa que ordena tres números introducidos por teclado.
 * 
 * Autor:Guillermo Jáuregui Lahoz
 * 
 */
import java.util.Scanner;
public class Ej13Tema4 {
  public static void main(String[] args) {
  Scanner s= new Scanner(System.in);
  
    int aux;
        
    System.out.println("Este programa ordena tres números introducidos por teclado.");
    System.out.println("Por favor, vaya introduciendo los tres números y pulsando INTRO:");
    int a = s.nextInt();
    int b = s.nextInt();
    int c = s.nextInt();

    if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }

    if (b > c) {
      aux = b;
      b = c;
      c = aux;
    }

    if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }
        
    System.out.println("Los números introducidos ordenados de menor a mayor son " + a + ", " + b + " y " + c + "."); 
  }
}
