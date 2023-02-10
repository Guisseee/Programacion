/*Programa que a que nos diga cuántos dígitos tiene un número introducido
por teclado
 * 
 * Autor:Guillermo Jáuregui Lahoz
 * 
 */
import java.util.Scanner;
public class Ejercicio9 {
  public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	
    System.out.print("Introduzca un número entero y le diré cuántos dígitos tiene: ");
    long numeroIntroducido = s.nextLong();
    
    long n = numeroIntroducido;
    int numeroDeDigitos = 1;
    
    while (n > 10) {
      numeroDeDigitos++;
      n /= 10;
    }
    
    System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " dígito/s.");
  }
}
