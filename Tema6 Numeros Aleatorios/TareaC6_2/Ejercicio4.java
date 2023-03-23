/* Programa que muestra 20 numeros aleatorios entre 0 y 10.
 * 
 * Autor: Guillermo Jáuregui Lahoz
 * 
 */
public class Ejercicio4{
  public static void main (String[] args){
	  
	  int numero= 0;
	  
	  for (int i=0; i<=20; i++){
		  numero=(int)(Math.random()*11);
		  System.out.print(numero+" ");
	  }
   }
}
