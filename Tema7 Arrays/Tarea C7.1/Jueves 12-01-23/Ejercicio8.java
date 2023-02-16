import java.util.Scanner;
public class Ejercicio8{
  public static void main (String[] args){
	Scanner s= new Scanner(System.in);
	
	int[] temperatura= new int[12];
	String[] meses= {"enero", "febrero", "marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
	
	for(int i=0; i<12; i++){
		System.out.print("Temperatura media "+meses[i]+": ");
		temperatura[i]= s.nextInt();
	}
	for(int i=0; i<12; i++){
		
		
		for(int io=0; io<temperatura[i]; io++){
		System.out.print("*");
	}
	System.out.println(" "+meses[i]+"= "+temperatura[i]);
}
}
}
