import java.util.Scanner;
public class Ejercicio7{
  public static void main (String[] args){
	Scanner s= new Scanner(System.in);
	  
	int[] cien= new int[100];
	  
	for( int i=0; i<100; i++){
	cien[i]=(int)(Math.random()*21);
	System.out.print(cien[i]+" ");
    }
    System.out.println(" ");
    System.out.print("Dime un número de los que han aparecido: ");
    int numero= s.nextInt();
    System.out.print("Dime por que numero quieres sustituirlo: ");
    int sustituto= s.nextInt();
      
	for( int i=0; i<100; i++){
	  if(cien[i]==numero){
	  cien[i]=sustituto;
	  System.out.print("'"+cien[i]+"'");
    }else {
	System.out.print(" "+cien[i]+" ");}
	} 
  }
}
