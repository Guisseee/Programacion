/*programa que calcula la media de tres notas y dice la nota lo que representa.
 * 
 * Autor:Guillermo Jáuregui Lahoz
 * 
 */
import java.util.Scanner;
public class Ejercicio8Tif {
  public static void main (String[] args){
    Scanner s= new Scanner(System.in);
    
    System.out.print("Dame las tres notas y te haré la media de los examenes ");
    double nota1= s.nextDouble();
    double nota2= s.nextDouble();
    double nota3= s.nextDouble();
    
    double media= (nota1+nota2+nota3)/3;
    
    System.out.println("La nota media de tus examenes es: "+media);
    
    if (media<=4){
		System.out.println("Tu nota es insuficiente");
	} else if (media==5){
		System.out.println("Tu nota es sufuciente");
	} else if (media==6){
		System.out.println("Tu nota es bien");
	} else if (media<=8){
		System.out.println("Tu nota es notable");
	} else if (media<=9){
		System.out.println("Tu nota es sobresaliente");
	}
  }
}
