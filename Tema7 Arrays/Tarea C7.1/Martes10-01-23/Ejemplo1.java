import java.util.Scanner;
public class Ejemplo1{
    public static void main (String[] args){
        Scanner s= new Scanner (System.in);
        int[] num= new int[10];

        num[0] = (int)(Math.pow(2,0));
        num[1] = (int)(Math.pow(2,1));
        num[2] = (int)(Math.pow(2,2));
        num[3] = (int)(Math.pow(2,3));
        num[4] = (int)(Math.pow(2,4));
        num[5] = (int)(Math.pow(2,5));
        num[6] = num[2] * 10;
        num[7] = num[2] / 10;
        num[8] = num[0] + num[1] + num[2];
        num[9] = num[8];

		for(int n=0; n<10; n++){
			System.out.println(num[n]);
		}
		System.out.print("Que posicion quieres saber");
		int p= s.nextInt();
		System.out.println("El numero es: "+num[p]);
		
		int suma= num[0]+num[2]+num[4]+num[6]+num[8];
		System.out.pritnln("La suma de los numeros pares es: "+suma);
    }
}
