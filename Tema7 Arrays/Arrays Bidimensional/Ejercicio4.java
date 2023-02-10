/* Programa que modifica el programa anterior de tal forma que las sumas parciales y la suma
total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
que el ordenador se queda “pensando” antes de mostrar los números.
* Autor: Guillermo Jauregui Lahoz
*/
public class Ejercicio4{
	public static void main(String[] args)
		throws InterruptedException {
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
			Thread.sleep(1000);
			System.out.print(sumaf);
			total=total+sumaf;
			sumaf=0;
			System.out.println(" ");
		}
		for(f=0; f<5; f++){
			for(c=0; c<4; c++){
				sumac= sumac+num[c][f];
			}
			Thread.sleep(1000);
			System.out.printf("%-5d  ",sumac);
			sumac=0;
		}
		Thread.sleep(1000);
		System.out.print(total);
	}
}

