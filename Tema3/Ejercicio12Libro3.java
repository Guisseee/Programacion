/*programa que calcula la nota que necesitas sacar en el siguiente examen dependiendo de la media que se desee en el trimestre.
 * 
 * Autor:Guillermo Jáuregui Lahoz
 * 
 */
import java.util.Scanner;
public class Ejercicio12Libro3{
  public static void main (String[] args){
	Scanner s= new Scanner(System.in);
	
	System.out.print("¿Qué nota has sacado en el primer examen? ");
	double nota1= s.nextDouble();
	System.out.print("¿Qué nota quieres sacar en el trimestre? ");
	double notatrimestre= s.nextDouble();
	
	double nota2 = ((notatrimestre * 100) - (nota1 * 40)) / 60;
	
	System.out.print("Para sacar un "+notatrimestre+" en el trimestre, necesitas sacar un "+nota2+" en el proximo examen.");
}
}
