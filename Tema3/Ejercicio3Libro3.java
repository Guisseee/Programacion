/*Programa que muestra por pantalla la conversión de pesetas elegidos a euros.
 * 
 * Autor:Guillermo Jáuregui Lahoz
 * 
 */
public class Ejercicio3Libro3{
  public static void main (String[] args){
	String linea;
	
	System.out.print("Dame una cantidad de euros y lo cambiare a pesetas ");
	linea=System.console().readLine();
	int pesetas;
	pesetas=Integer.parseInt(linea);
	
	double conversion;
	conversion= pesetas/166.38;
	
	System.out.println("El numero de euros es: "+conversion);
}
}
