/*programa que pregunta tu nombre y edad,y despues las imprime por pantalla.
 * 
 *Autor:Guillermo Jáuregui Lahoz
 * 
 */
import java.util.Scanner;
public class PruebaEscritaEj4{
    public static void main (String[] args){
	Scanner s= new Scanner(System.in);
	
	System.out.print("Dime tu nombre y tu edad: ");
	String nombre= s.next();	
	int edad= s.nextInt();
	
	System.out.print("Mi nombre es "+nombre+" y tengo "+edad+" años");
	
}
} 
