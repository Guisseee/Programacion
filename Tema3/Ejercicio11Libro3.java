/*Programa que realiza un conversor de Kb a Mb.
 * 
 * Autor:Guillermo Jáuregui Lahoz
 * 
 */
import java.util.Scanner;
public class Ejercicio11Libro3{
  public static void main (String[] args){
	Scanner s= new Scanner(System.in);
	
	System.out.print("Dime cuanta cantidad de Kb quieres convertir a Mb: ");
	double Kb= s.nextDouble();
	
	int Mb;
	Mb= 1000;
	
	double conversion;
	conversion= Kb/Mb;
	
	System.out.print(Kb+" Kb pasados a Mb son "+conversion+" Mb ");
}
}
