/*Programa que cuenta hasta 0 a partir del numero que se introduce por teclado.
 * 
 * Autor:Guillermo Jáuregui Lahoz
 * 
 */
import java.util.Scanner;
public class Ejemplo2{
  public static void main (String[] args){
	Scanner s= new Scanner(System.in);
	
	int num= s.nextInt();
	
	for (int cont=0; cont<= num; cont++){
		System.out.println(cont);
	}
}
}
