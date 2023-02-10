/* Programa que dice si el numero introducido es divisible entre 2 y 5.
*
* Autor:Guillermo Jáuregui Lahoz
*/
import java.util.Scanner;
public class Ejercicio14TSwitch{
  public static void main (String[] args){
	Scanner s= new Scanner(System.in);
	
	System.out.print("Dame un numero: ");
	double numero;
	numero= s.nextDouble();
	
	if ((numero%2)==0){
		System.out.println("Este numero es divisible entre 2");
	} else {
		System.out.println("Este numero no es divisible entre 2");
	}
	
	if ((numero%5)==0){
		System.out.println("Este número es divisible entre 5");
	} else {
		System.out.println("Este númeno no es divisible entre 5");
	}
}
}
