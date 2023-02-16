package Tema8_Funciones.TareaC8_1.Martes31_01_23;
import java.util.Scanner;
public class Ejercicio20al28 {
  public static void main(String[] args) {
    
  }
  
  public static int[] generarArray(int n, int max, int min){
    Scanner s= new Scanner(System.in);
    int[] a= new int[n];
    for(int i=0; i<n; i++){
      a[i]=(int)(Math.random()*(max+1-min)+min);
    }
    return a;
  }

  public static int minimoArray(int x[]) {
    int minimo=Integer.MAX_VALUE;
    for (int n=0; n<x.length; n++){
      if (x[n]<minimo){
        minimo=x[n];
      }
    }
    return minimo;
  }

  public static int maximoArray(int x[]){
    int max=Integer.MIN_VALUE;
    for(int n=0; n<x.length; n++){
      if(x[n]>max){
        max=x[n];
      }
    }
    return max;
  }

  public static boolean estaEnArrayInt(int []n, int num){
    boolean esta=false;
    for(int i=0; i<x.length; i++){
      if(x[i]==y){
        return true
      }
    }
  }

}