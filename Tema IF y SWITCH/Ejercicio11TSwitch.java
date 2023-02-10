/* Programa que dice los segundos que faltan para la medianoche.
*
* Autor:Guillermo Jáuregui Lahoz
*/
import java.util.Scanner;
public class Ejercicio11TSwitch{
  public static void main (String[] args){
	Scanner s= new Scanner(System.in);
	
    System.out.print("Dame la hora y los minutos que son y te dire los segundos que faltan para medianoche ");
    int hora= s.nextInt();
    int minutos= s.nextInt();

    int segundos;
    segundos= (hora * 3600) + (minutos * 60);
    
    int segundosQueFaltan;
    segundosQueFaltan= (24 * 3600) - segundos;
    
    System.out.print("Los segundos que faltan para la medianoche son: "+segundosQueFaltan);
   }
}
