/*Programa que permita ir introduciendo una serie indeterminada
 *     de números mientras su suma no supere  el valor 10000. Cuando esto último
 *     ocurra, se debe mostrar el total acumulado, el contador de los números
 *     introducidos y la media.
*
*Autor: Guillermo Jáuregui Lahoz.
*
*/
import java.util.Scanner;
public class Ejercicio23 {
  public static void main(String[] args) {
  Scanner s= new Scanner(System.in);
  
    System.out.println("Por favor, vaya introduciendo números.");
    System.out.println("El programa terminará cuando la suma de los números sea mayor que 10000.");
    
    int numeroIntroducido;
    int suma = 0;
    int numeroDeElementos = 0;
    
    do {
      numeroIntroducido = s.nextInt();
      suma += numeroIntroducido;
      numeroDeElementos++;
    } while (suma <= 10000);
    
    System.out.println("Ha introducido un total de " + numeroDeElementos + " números.");
    System.out.println("La suma total es " + suma + ".");
    System.out.println("La media es " + suma / (double) numeroDeElementos);
  }
}
