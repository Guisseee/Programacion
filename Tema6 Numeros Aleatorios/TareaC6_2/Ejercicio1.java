/* Programa que muestra 10 numeros aleatorios
 * 
 * Autor: Guillermo Jáuregui Lahoz
 * 
 */
public class Ejercicio1{
  public static void main (String[] args){
	
	int dado=0;
	
	for (int i=1; i<=3; i++){
	 dado=(int)(Math.random()*6)+1;
	 System.out.println("La tirada del dado "+i+ " = "+dado);
	}
  }
}
