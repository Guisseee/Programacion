/*Programa que calcula el volumen de un cono
 *
 * Autor:Guillermo Jáuregui Lahoz
 * 
 */
import java.util.Scanner;
public class Ejercicio9Libro3{
  public static void main (String[] args){
	Scanner s= new Scanner(System.in);
	
	System.out.print("Dame la altura del cono: ");
	double altura= s.nextDouble();
	
	System.out.print("Dame el radio de la base del cono: ");
	double radio= s.nextDouble();
	
	double pi;
	pi= 3.14;
	
	double volumen;
	volumen=(pi*radio*radio*altura)/3;
	
	System.out.print("El volumen del cono es: "+volumen);
}
}
  
