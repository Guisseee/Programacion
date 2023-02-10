/*Programa que te dice el ultimo digito del numero introducido.
 * 
 * Autor:Guillermo Jáuregui Lahoz
 * 
 */
import java.util.Scanner;
public class Ejercicio17TSwitch{
  public static void main (String[] args){
    Scanner s= new Scanner(System.in);
    
    System.out.println("Dime un número y te dire cual es el ultimo digito del mismo.");
    System.out. println("Tu numero es: ");
    int numero;
    numero= s.nextInt();
    
    int ultimodigito;
    ultimodigito= numero%10;
	
	System.out.print("El ultimo digito de tu número es: "+ultimodigito);
}
}
