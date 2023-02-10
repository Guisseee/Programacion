/* Programa que muestra 50 numeros aleatorios entre 100 y 199.
 * 
 * Autor: Guillermo Jáuregui Lahoz
 * 
 */
public class Ejercicio5{
  public static void main (String[] args){
	  
	  int numero= 0;
	  
	  for (int i=0; i<=50; i++){
		  numero= (int)(Math.random()*100)+100;
		  System.out.print(numero+" ");
	  }
   } 
}
