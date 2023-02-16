/* Programa que modifica el programa anterior de tal forma que los números que se introducen
en el array se generen de forma aleatoria (valores entre 100 y 999).
* Autor:Guillermo Jáuregui Lahoz.
*/
public class Ejercicio3{
	public static void main(String[] args){
		
		int[][] num= new int[4][5];
		int f,c;
		int sumaf= 0;
		int sumac= 0;
		int total= 0;
		
		for(f=0; f<4; f++){
			for(c=0; c<5; c++){
				num[f][c]= (int)(Math.random()*900+100);
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
