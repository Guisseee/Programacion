/*programa realiza una ecuacion de segundo grado la cual pide los valores de a, b y c.
 * 
 * Autor:Guillermo Jáuregui Lahoz
 * 
 */
import java.util.Scanner;
public class Ejercicio9Tif{
  public static void main (String[] args){
	Scanner s= new Scanner(System.in);
	
	System.out.println("Vamos a resolver la ecuación de segundo grado. Dame el valor de a: ");
	double a= s.nextDouble();
	System.out.println("Ahora, dame el valor de b: ");
	double b= s.nextDouble();
	System.out.println("Y por ultimo, dame el valor de c: ");
	double c= s.nextDouble();
	
	double valorRaiz;
	valorRaiz = (b*b)-4*a*c;
	
	double resultadoRaiz;
	resultadoRaiz= Math.sqrt(valorRaiz);
	
	if (valorRaiz<0){
		System.out.println("Esta operación no se puede realizar al ser la raiz negativa");
	} else {
		double resultadoEcuacion1;
		resultadoEcuacion1= (-b+resultadoRaiz)/2*a;
		double resultadoEcuacion2;
		resultadoEcuacion2= (-b-resultadoRaiz)/2*a;
	System.out.println("Los dos resultados de la ecuación son: "+resultadoEcuacion1+" y "+resultadoEcuacion2);
}
}
}
