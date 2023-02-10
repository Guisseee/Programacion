public class Ejercicio10{
	public static void main(String[] args){
		
		int[] numero= new int[20];
		int[] pares= new int[20];
		int[] impares= new int[20];
		int[] total= new int[20];
		
		int cont= 0;
		int contador= 0;
		
		for(int i=0; i<20; i++){
			numero[i]= (int)(Math.random()*101);
			System.out.print(numero[i]+" ");
			}
		for(int i=0; i<20; i++){
			if(numero[i]%2==0){
				pares[i]=numero[i];
				cont++;
			}if(numero[i]%2!=0){
				impares[i]=numero[i];
				contador++;
			}
			System.out.println(" ");
			System.out.println(pares[i]+impares[i]);
		}
	}
}
