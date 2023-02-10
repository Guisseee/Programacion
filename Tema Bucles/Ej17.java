/*Programa que sume los 100 números siguientes a un número entero
y positivo introducido por teclado.
*
*Autor: Guillermo Jáuregui Lahoz.
*
*/
import java.util.Scanner;
public class Ej17 {
  public static void main(String[] args) {
  Scanner s= new Scanner(System.in);
    
    int numeroIntroducido = 0;
    
    do {
      System.out.print("Introduzca un número entero positivo: ");
      numeroIntroducido = s.nextInt();
      
      if(numeroIntroducido < 0) {
        System.out.print("El número introducido no es correcto,");
        System.out.println(" debe introducir un número positivo.");
      }
    } while (numeroIntroducido < 0);
    
    int suma = 0;
    
    for(int i = numeroIntroducido; i < numeroIntroducido + 100; i++) {
      suma += i;
    }

    System.out.print("La suma de los 100 números siguientes a ");
    System.out.println(numeroIntroducido + " es " + suma + ".");
  }
}
