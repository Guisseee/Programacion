/*Programa que dice cual es el primer digito de un numero que es introducido por teclado.
 * 
 * Autor:Guillermo Jáuregui Lahoz
 * 
 */
import java.util.Scanner;
public class Ejercicio18TSwitch{
  public static void main (String[] args){
	Scanner s= new Scanner(System.in);
	
	System.out.println("Dime un numero de maximo de 5 digitos y te diré el primero.");
	System.out.print("Tu número es: ");
	int numero;
	numero= s.nextInt();
	
	int resultado;
	resultado=numero;
	
	if ((numero<=9)&&(numero>=0)){
		 resultado= numero;
	} else if ((numero<=99)&&(numero>=10)){
		resultado= numero/10;
	} else if ((numero<=999)&&(numero>=100)){
		resultado= numero/100;
	} else if ((numero<=9999)&&(numero>=1000)){
		resultado= numero/1000;
	} else if ((numero<=99999)&&(numero>=10000)){
		resultado= numero/10000;
	}
	System.out.print("El primer digito de tu número es: "+resultado);
}
}
	
