/*Programa que muestra por pantalla el valor de dos números introducidos ademas de realizar una operación matemática con ellos.
 * 
 * Autor:Guillermo Jáuregui Lahoz
 * 
 */
public class EjercicioLeerNumerosEjemplo {
  public static void main (String[] args){
	String linea;
	
    //Estas lineas de código imprimen por pantalla un mensaje y seguidamente se pide por pantalla un numero que será guardado con la variable primernúmero.
	System.out.print("Por favor, introduce un número ");
	linea=System.console().readLine();
	int primernumero;
	primernumero=Integer.parseInt(linea);
	
	//Estas lineas realizan lo mismo que las anteriores pero en este caso el nuevo número guardad se queda guardado en la variable segundonumero.
	System.out.print("Introduce otro numero, por favor ");
	linea=System.console().readLine();
	int segundonumero;
	segundonumero=Integer.parseInt(linea);
	
	//En estas lineas de código se le pide al programa que realice una operación buscando las variables que se le piden de todas las que se hayan guardado en el código.
	int total;
	total=(2*primernumero)+segundonumero;
	
	//Esta línea de código imprime por pantalla el valor del primer número que se haya introducido.
	System.out.print("El primer numero introducido es "+primernumero);
	//Esta línea de código imprime por pantalla el valor del segundo número que se haya introducido.
	System.out.println(" y el segundo número introducido es "+segundonumero);
	//Esta línea de código imprime por pantalla el resultado de la operación total que se ha realizado anteriomente.
	System.out.print("El doble del primer numero más el segundo es "+total);
}
}
	
