/*Programa que realiza un conversor de Mb a Kb.
 * 
 * Autor:Guillermo Jáuregui Lahoz
 * 
 */
import java.util.Scanner;
public class Ejercicio10Libro3{
  public static void main (String[] args){
	Scanner s= new Scanner(System.in);
	
	System.out.print("Dime cuanta cantidad de Mb quieres convertir a Kb: ");
	double Mb= s.nextDouble();
	
	int Kb;
	Kb= 1000;
	
	double conversion;
	conversion= Mb*Kb;
	
	System.out.print(Mb+" Mb pasados a Kb son "+conversion+" Kb ");
}
}
