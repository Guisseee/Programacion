package Tema14.Tarea14_2;
import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);

    
    System.out.println("Dame 6 números y te diré cual es el mayor");
    System.out.println("Si quieres salir del programa ingrese el numero 0.");
    System.out.print("Tus número son: ");
    int mayor= 0;
    do{
    int numero1= s.nextInt();
    int numero2= s.nextInt();
    int numero3= s.nextInt();
    int numero4= s.nextInt();
    int numero5= s.nextInt();
    int numero6= s.nextInt();
    if(numero1>mayor){
      mayor= numero1;
      if(numero2>mayor){
        mayor= numero2;
      }if(numero3>mayor){
        mayor= numero3;
      } if(numero4>mayor){
        mayor= numero4;
      } if(numero5>mayor){
        mayor= numero5;
      } if(numero6>mayor){
        mayor= numero6;
      }
    }
    System.out.print(mayor);
  } while();
  }
}
