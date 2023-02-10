/* Programa que dibuja un triangulo con el caracter que se introduzca ademas del hacerlo con el vertice para el lado que se desee.
*
* Autor:Guillermo Jáuregui Lahoz
*/
import java.util.Scanner;
public class Ejercicio15TSwitch{
  public static void main (String[] args){
	Scanner s= new Scanner(System.in);
	
	System.out.println("Dime que caracter utilizo para pintar una piramide");
	String caracter;
	caracter= s.next();
	System.out.println("Introduce un número para elegir para que lado quieres el vertice de la piramide");
	System.out.println("1. Arriba");
	System.out.println("2. Abajo");
	System.out.println("3. Izquierda");
	System.out.println("4. Derecha");
	int lado;
	lado= s.nextInt();
	
	switch (lado){
		case 1:
		System.out.println("     "+caracter+"   ");
		System.out.println("    "+caracter+caracter+caracter+"  ");
		System.out.println("   "+caracter+caracter+caracter+caracter+caracter+" ");
		System.out.println("  "+caracter+caracter+caracter+caracter+caracter+caracter+caracter+"");
		break;
		case 2:
		System.out.println("  "+caracter+caracter+caracter+caracter+caracter+caracter+caracter+"");
		System.out.println("   "+caracter+caracter+caracter+caracter+caracter+" ");
		System.out.println("    "+caracter+caracter+caracter+"  ");
		System.out.println("     "+caracter+"   ");
		break;
		case 3:
		System.out.println("      "+caracter);
		System.out.println("    "+caracter+" "+caracter+"");
		System.out.println("  "+caracter+" "+caracter+" "+caracter+"");
		System.out.println("    "+caracter+" "+caracter+"");
		System.out.println("      "+caracter);
		break;
		case 4:
		System.out.println("  "+caracter+"    ");
        System.out.println("  "+caracter+" "+caracter+"  ");
        System.out.println("  "+caracter+" "+caracter+" "+caracter);
        System.out.println("  "+caracter+" "+caracter+"  ");
        System.out.println("  "+caracter+"    ");
        break;
	}
}
}
	
