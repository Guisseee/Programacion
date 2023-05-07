package Tema14.Tarea14_2;
import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);

    
    System.out.println("Dame 6 números y te diré cual es el mayor");
    System.out.println("Si quieres salir del programa ingrese el numero 0.");
    System.out.print("Tus número son: ");
    int maximo= Integer.MIN_VALUE;
    int minimo= Integer.MAX_VALUE;
    do{
    int mayor= s.nextInt();
    int numero2= s.nextInt();
    
    if(mayor==Integer.MAX_VALUE){
      System.out.print("El número mayor es: "+mayor);
      }
    } while(numero2==0);
  }
}
