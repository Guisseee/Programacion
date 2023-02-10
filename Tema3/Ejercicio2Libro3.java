/*Programa que muestra por pantalla la conversión de los euros elegidos a pesetas.
 * 
 * Autor:Guillermo Jáuregui Lahoz
 * 
 */
public class Ejercicio2Libro3{
  public static void main (String[] args){
	String linea;
	
	System.out.print("Dame una cantidad de euros y lo cambiare a pesetas ");
	linea=System.console().readLine();
	int euros;
	euros=Integer.parseInt(linea);
	
	double pesetas;
	pesetas=166.38;
	
	double conversion;
	conversion= euros*pesetas;
	
	System.out.println("El numero de pesetas es: "+conversion);
}
}
