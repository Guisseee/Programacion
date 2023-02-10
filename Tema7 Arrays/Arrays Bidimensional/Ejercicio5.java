/* Programa que muestra el contenido de todos los elementos del array dispuestos en forma de tabla
*
* Autor:Guillermo Jáuregui Lahoz.
*/
public class Ejercicio5{
	public static void main(String[] args){
		
		int [][] num= new int [6][10];
		int f,c;
		int maximo= Integer.MIN_VALUE;
		int minimo= Integer.MAX_VALUE;
		
		for(f=0; f<6; f++){
			for(c=0; c<10; c++){
				num[f][c]=(int)(Math.random()*1001);
			}
			System.out.print(num[f][c]);
		}
	}
}
