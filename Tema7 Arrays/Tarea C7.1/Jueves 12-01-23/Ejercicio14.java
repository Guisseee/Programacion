import java.util.Scanner;
public class Ejercicio14{
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		
		String[] color={"verde","rojo","azul","amarillo","amarillo","naranja","rosa","negro","blanco","morado"};
		String[] palabras= new String[8];
		
		for(int i=0; i<8; i++){
			palabras[i]= s.next();
		for(int io=0; io<8; io++){
				System.out.print(palabras[i]);
			}
		}
	}
}
