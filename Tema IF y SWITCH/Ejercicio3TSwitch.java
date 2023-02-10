/* Programa que presenta el dia de la semana segun el numero introducido por teclado.
*
* Autor:Guillermo Jáuregui Lahoz
*/
import java.util.Scanner;
public class Ejercicio3TSwitch {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.print("Dime un numero de dia de la semana y te diré a cual correspode ");
	int numero;
	numero= s.nextInt();
	
	switch (numero) {
	case 1:
	System.out.print("Este dia de la semana es lunes");
	break;
	case 2:
	System.out.print("Este dia de la semana es martes");
	break;
	case 3:
	System.out.print("Este dia de la semana es miercoles");
	break;
	case 4:
	System.out.print("Este dia de la semana es jueves");
	break;
	case 5:
	System.out.print("Este dia de la semana es viernes");
	break;
	case 6:
	System.out.print("Este dia de la semana es sabado");
	break;
	case 7:
	System.out.print("Este dia de la semana es domingo");
	break;
	default:
    System.out.print("Este dia de la semana no existe");
}
}
}
