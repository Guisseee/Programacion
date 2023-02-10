/*Programa que dice que estacion del año representa el mes que has introducido.
 * 
 * Autor:Guillermo Jáuregui Lahoz
 * 
 */
import java.util.Scanner;
public class EjemploEstacionesAño{
  public static void main (String[] args){
	Scanner s= new Scanner(System.in);
	
	System.out.println("Dime un mes y te dire que estacion del año corresponde.");
	String mes= s.next();
	mes= mes.toLowerCase();
	
	switch (mes){
		case "enero","febrero","marzo":
			System.out.print("Este mes correspode a invierno");
		break;
		case "abril","mayo","junio":
			System.out.print("Este mes corresponde a primavera");
		break;
		case "julio","agosto","septiembre":
			System.out.print("Este mes corresponde a verano");
		break;
		case "octubre","noviembre","diciembre":
			System.out.print("Este mes corresponde a otoño");
		break;
		default:
			System.out.print("Lo que has introducido no es ningun mes");

	}
}
}
