import java.util.Scanner;
public class Ejercicio13{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		
		int[] num= new int[100];
		int maximo= Integer.MIN_VALUE;
		int minimo= Integer.MAX_VALUE;
		
		for (int i = 0; i < 100; i++) {
				num[i] = (int)(Math.random()*501);
				System.out.print(num[i]+" ");
			if (num[i] < minimo) {
				minimo = num[i];
			}
			if (num[i] > maximo) {
				maximo = num[i];
			}
		}
		System.out.println(" ");
		System.out.print("¿Qué quiere destacar? 1=mínimo 2=máximo ");
		int opcion = s.nextInt();
		
		int destacado;
			
		if (opcion == 1) {
			destacado = minimo;
		} else {
			destacado = maximo;
		}

			for (int elemento : num) {
			if (elemento == destacado) {
				System.out.print(" **" + elemento + "** ");
			} else {
			System.out.print(elemento + " ");
			}
		}
	}
}
