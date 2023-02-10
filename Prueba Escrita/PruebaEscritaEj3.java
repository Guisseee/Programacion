/*programa que pregunta tres datos: tu año de nacimiento, el mes y el día. Después debe mostrarlo por pantalla.
 * 
 *Autor:Guillermo Jáuregui Lahoz
 * 
 */
import java.util.Scanner;
public class PruebaEscritaEj3{
  public static void main (String[] args){
	Scanner s= new Scanner(System.in);
	
	System.out.print("Dame tu año de nacimiento: ");
	int año= s.nextInt();	
	System.out.print("Dame tu mes de nacimiento: ");
	String mes= s.next();
	System.out.print("Dame tu dia de nacimiento: ");
	int dia= s.nextInt();
	
	System.out.print("Mi fecha de nacimiento es el: "+dia+" de "+mes+" de "+año);
	
}
} 
