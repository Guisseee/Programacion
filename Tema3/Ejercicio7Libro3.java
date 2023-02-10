/*Programa que pide el precio de un objeto sin iva para calcular la base imponible sumado al iva.
 * 
 * Autor:Guillermo Jáuregui Lahoz
 * 
 */
public class Ejercicio7Libro3{
  public static void main (String[] args){
	String calculo;
	
	System.out.print("Dime el precio del articulo ");
	calculo=System.console().readLine();
	double precio;
	precio=Double.parseDouble(calculo);
	
	double iva;
	iva=0.21;
	
	double cantidadiva;
	cantidadiva=precio*iva;
	
	double total;
	total=cantidadiva+precio;
	
	System.out.println("El precio total del producto con el IVA sumado es: "+total);
}
}
