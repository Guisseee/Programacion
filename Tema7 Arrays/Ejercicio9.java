import java.util.Scanner;
public class Ejercicio9{
  public static void main(String[] args){
	Scanner s= new Scanner(System.in);
	
	System.out.println("Dime 8 numeros y te digo si son pares o impares.");
	
	int num[]= new int[8];
	
	for(int i=0; i<8; i++){
      num[i]= s.nextInt();
	}
	for(int i=0; i<8; i++){
	  if(num[i]%2==0){
        System.out.println(num[i]+" es par");
	  }if(num[i]%2!=0){
		System.out.println(num[i]+" es impar");
	  }
    }
  }
}
