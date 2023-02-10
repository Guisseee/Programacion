/*programa que Realiza un minicuestionario
 * 
 * Autor:Guillermo Jáuregui Lahoz
 * 
 */
import java.util.Scanner;
public class Ejercicio12Tif{
  public static void main (String[] args){
	Scanner s= new Scanner(System.in);
	
	System.out.println("¿Quien imparte la asignatura de programación? a)Araceli b)Antonio c)Rafael d)Jose Antonio");
	String r1= s.next();
	r1= r1.toLowerCase();
	
	if ("a".equals(r1)){
		System.out.println("Respuesta correcta");
	} else {
		System.out.println("Respuesta mala");
	}
	
	System.out.println("¿Quien te cae mejor? a)tu madre b)tu hermana c)tu prima d)tu abuela");
	String r2= s.next();
	r2= r2.toLowerCase();
	
	if ("a".equals(r2)){
		System.out.print("Respuesta correcta");
	} else {
		System.out.println("Respuesta incorrecta");
}
}
}
