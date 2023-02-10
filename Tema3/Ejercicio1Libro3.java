/*Programa que muestra por pantalla el valor de dos números introducidos ademas de realizar una operación matemática con ellos.
 * 
 * Autor:Guillermo Jáuregui Lahoz
/*Programa que muestra por pantalla una operación matemática con los numeros introducidos.
 * 
 * Autor:Guillermo Jáuregui Lahoz
 * 
 */
public class Ejercicio1Libro3 {
  public static void main (String[] args){
	String linea;
	
	System.out.print("Introduce un número ");
	linea=System.console().readLine();
	int numero1;
	numero1=Integer.parseInt(linea);
	
	System.out.print("Introduce otro número ");
	linea=System.console().readLine();
	int numero2;
	numero2=Integer.parseInt(linea);
	
	int total;
	total=numero1*numero2;
	
	System.out.println("El resultado de la multiplicación es: "+total);
}
}
	
