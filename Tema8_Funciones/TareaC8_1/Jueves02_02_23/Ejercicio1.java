package Tema8_Funciones.TareaC8_1.Jueves02_02_23;
import Tema8_Funciones.TareaC8_1.Jueves02_02_23.misFunciones.Varias;
import java.util.Scanner;

public class Ejercicio1{
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    //Realiza la función de multiplicar.
    System.out.print("Dame el primer número: ");
    double num1= s.nextDouble();
    System.out.print("Dame el segundo número: ");
    double num2= s.nextDouble();
    double result= Varias.multiplica(num1, num2);
    System.out.print("El resultado de "+num1+" por "+num2+" es: "+result);
  }
}