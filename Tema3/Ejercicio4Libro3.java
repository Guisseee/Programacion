/*Programa que pide dos números en pantalla y realiza la suma, resta, multiplicación y división de ellos.
 * 
 * Autor:Guillermo Jáuregui Lahoz
 * 
 */
public class Ejercicio4Libro3 {
  public static void main (String[] args){
	String operaciones;
	
	System.out.print("Dame un numero ");
	operaciones=System.console().readLine();
	int numero1;
	numero1=Integer.parseInt(operaciones);
	
	System.out.print("Dame otro numero ");
	operaciones=System.console().readLine();
	int numero2;
	numero2=Integer.parseInt(operaciones);
	
	int suma;
	suma= numero1+numero2;
	
	int resta;
	resta= numero1-numero2;
	
	int producto;
	producto= numero1*numero2;
	
	double dividir;
	dividir= (double)numero1/(double)numero2;
	
	System.out.println("La suma de los dos números es: "+suma);
	System.out.println("La resta de los dos números es: "+resta);
	System.out.println("La multiplicación de los dos números es: "+producto);
	System.out.println("La división de los dos números es: "+dividir);
}
}
