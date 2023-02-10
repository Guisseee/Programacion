/*Programa que que calcula y muestra por pantalla el valor de A elevado a B 
 * 
 * Autor:Guillermo Jáuregui Lahoz
 * 
 */
import java.util.Scanner;
public class Ejemplo5{
  public static void main (String[] args){
	Scanner s= new Scanner(System.in);
	
	System.out.println("Dame un numero y su exponente");
	int a= s.nextInt();
	int b= s.nextInt();
	int multi=1;

	for ( int cont=1; cont<=b; cont+=1){
		
		multi= multi*a;
		
	}
	System.out.print("El resultado de la operacion es "+multi);
}
}	
