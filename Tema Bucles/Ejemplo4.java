/*Programa que calcule y muestre por pantalla, independientemente la suma de los números pares 
 * y la suma de impares de los números comprendidos entre 100 y 200.
 * 
 * Autor:Guillermo Jáuregui Lahoz
 * 
 */
public class Ejemplo4{
  public static void main (String[] args){
	
	int acum=0;
	int suma=0;
	
	int acum1=0;
	int suma1=0;
	
	for (int cont=100; cont<=200; cont= cont+2){
		acum= cont+suma;
		suma= acum;
	}
	System.out.println(suma);
	
	for (int cont=101; cont<=200; cont= cont+2){
		acum1= cont+suma1;
		suma1= acum1;
	}
	System.out.println(suma1);
}
}
