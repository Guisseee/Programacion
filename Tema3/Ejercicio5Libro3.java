/*Programa que pide dos números con los cuales realizará el calculo del area de un rectángulo.
 * 
 * Autor:Guillermo Jáuregui Lahoz
 * 
 */
public class Ejercicio5Libro3{
  public static void main (String[] args){
	String calculoarea;
	
	System.out.print("\033[31mDame la base del rectángulo ");
	calculoarea=System.console().readLine();
	double base;
	base=Double.parseDouble(calculoarea);
	
	System.out.print("\033[33mDame la altura del rectángulo ");
	calculoarea=System.console().readLine();
	double altura;
	altura=Double.parseDouble(calculoarea);
	
	double area;
	area= base*altura;
	
	System.out.println("\033[31mEl área del rectangulo es: "+area+"\033[37m");
	
}
}
