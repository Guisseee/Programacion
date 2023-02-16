/* Programa que que pide 20 números enteros. Estos números se deben 
* introducir en un array de 4 filas por 5 columnas. El programa mostrará las 
* sumas parciales de filas y columnas igual que si de una hoja de cálculo se
* tratara. La suma total debe aparecer en la esquina inferior derecha.
*
* Autor:Guillermo Jáuregui Lahoz.
*/
import java.util.Scanner;
public class Ejercicio2{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		
		int[][] num= new int[4][5];
		int f,c;
		int sumaf= 0;
		int sumac= 0;
		int total= 0;
		
		for(f=0; f<4; f++){
			for(c=0; c<5; c++){
				num[f][c]= s.nextInt();
			}
		}
		for(f=0; f<4; f++){
			for(c=0; c<5; c++){
				sumaf= sumaf+num[f][c];
				System.out.printf("%-5d  ",num[f][c]);
			}
			System.out.print(sumaf);
			total=total+sumaf;
			sumaf=0;
			System.out.println(" ");
		}
		for(f=0; f<5; f++){
			for(c=0; c<4; c++){
				sumac= sumac+num[c][f];
			}
			System.out.printf("%-5d  ",sumac);
			sumac=0;
		}
		System.out.print(total);
	}
}
