/*Programa que pide dos números con los cuales realizará el calculo del area de un triángulo.
 * 
 * Autor:Guillermo Jáuregui Lahoz
 * 
 */
public class Ejercicio6Libro3{
  public static void main (String[] args){
	String calculoarea;
	
	System.out.print("Dame la base del triangulo ");
	calculoarea=System.console().readLine();
	double base;
	base=Double.parseDouble(calculoarea);
	
	System.out.print("Dame la altura del triangulo ");
	calculoarea=System.console().readLine();
	double altura;
	altura=Double.parseDouble(calculoarea);
	
	double area;
	area= (base*altura)/2;
	
	System.out.println("El área del rectangulo es: "+area);
	
}
}
