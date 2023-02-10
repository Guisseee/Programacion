/*Programa que que calcula y muestra por pantalla, la suma y el producto de los 10 primeros números naturales.
 * 
 * Autor:Guillermo Jáuregui Lahoz
 * 
 */
public class Ejemplo3{
  public static void main (String[] args){
	
	int num=0;
	int suma=0;
	
	int num2=0;
	int prod=1;
	
	for (int cont=1; cont<=10; cont++){
		num= num+cont;
		suma=num;
	}
	System.out.println(suma);
	
	for (int cont=1; cont<=10; cont++){
		num2= cont*prod;
		prod= num2;
	}
	System.out.print(prod);
	
}
}
