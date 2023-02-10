/*Programa que calcule el precio de un desayuno.
 * 
 * Autor: Guillermo Jáuregui Lahoz.
 * 
 */
import java.util.Scanner;
public class Ejercicio29{
  public static void main (String[] args){
	  Scanner s= new Scanner(System.in);
    System.out.println("Introduce la altura de cada escalon: ");
    int altura= s.nextInt();
    System.out.println("Introduce el numero de escalones: ");
    int numero= s.nextInt();
    int longitudescalon= 4;
    char relleno= ('*');
    while (numero<= longitudescalon){
      for (int i=1; i==altura; i++){
        System.out.println(relleno);
      }
    }
    for (int i =1; i<longitudescalon; i++){
      System.out.print(relleno);
    }
  }
}
