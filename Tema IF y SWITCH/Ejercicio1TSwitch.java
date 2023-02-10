/* Programa que te dice la primera clase que tienes del dia que tu preguntes.
 * 
 * Autor:Guillermo Jáuregui Lahoz
 * 
 */
import java.util.Scanner;
public class Ejercicio1TSwitch{
  public static void main (String[] args){
	Scanner s= new Scanner(System.in);
	
	System.out.println("Dime un dia de la semana y te dire que te toca a primera");
	String dia;
	dia= s.next();
	dia= dia.toLowerCase();
	
	switch (dia){
		case "lunes":	
		System.out.print("El lunes a primera te toca FOL");
		break;
		case "martes":
		System.out.print("El martes a primera te toca Base de datos");
		break;
		case "miercoles":
		System.out.print("El miercoles a primera te toca Base de datos");
		break;
		case "jueves":
		System.out.print("El jueves a primera te toca Sistemas");
		break;
		case "viernes":
		System.out.print("El viernes a primera te toca Entornos");
		break;
		case "sabado":
		System.out.print("El sabado no hay clase");
		break;
		case "domingo":
		System.out.print("El domingo no hay clase");
		break;
		default:
		System.out.print("Eso no es un dia de la semana");
	}
}
}
	
