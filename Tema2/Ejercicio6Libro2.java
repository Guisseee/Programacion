/*Programa que muestra el valor total despues de sumar el iva
 * 
 * Autor: Guillermo Jáuregui Lahoz
 */
public class Ejercicio6Libro2 {
  public static void main (String[] args){
	
	double baseimponible;
	baseimponible=23;
	
	double valoriva;
	valoriva=0.21;
	
	double iva;
	iva=baseimponible*valoriva;
	
	double ivasumado;
	ivasumado=iva+baseimponible;
	
	 System.out.println("23 euros mas el iva es: "+ivasumado);
}
}
