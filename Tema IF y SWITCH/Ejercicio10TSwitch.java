/* Programa que te dice el horoscopo que eres segun tu dia de nacimiento.
*
* Autor:Guillermo Jáuregui Lahoz
*/
import java.util.Scanner;
public class Ejercicio10TSwitch{
  public static void main (String[] args){
	Scanner s= new Scanner(System.in);
	
	System.out.print("Dime tu dia y mes de nacimiento y te digo tu horoscopo ");
	int dia= s.nextInt();
	String mes= s.next();
	mes= mes.toLowerCase();
	
	if ((dia>=1)&&(dia<=31)){
		switch (mes){
			case "enero":
				if (dia<=19){
					System.out.print("Tu horoscopo es: Capricornio");
				} else {
				System.out.print("Tu horoscopo es: Acuario");
				}
				break;
			case "febrero":
				if (dia<=18){
					System.out.print("Tu horoscopo es: Acuario");
				} else {
					System.out.print("Tu horoscopo es: Piscis");
				}
				break;
			case "marzo":
				if (dia<=20){
					System.out.print("Tu horoscopo es: Piscis");
				} else{
					System.out.print("Tu horoscopo es: Aries");
				}
				break;
			case "abril":
				if (dia<=19){
					System.out.print("Tu horoscopo es: Aries");
				} else {
					System.out.print("Tu horoscopo es: Tauro");
				}
				break;
			case "mayo":
				if (dia<=20){
					System.out.print("Tu horoscopo es: Tauro");
				} else {
					System.out.print("Tu horoscopo es: Géminis");
				}
				break;
			case "junio":
				if (dia<20){
					System.out.print("Tu horoscopo es: Géminis");
				} else {
					System.out.print("Tu horoscopo es: Cancer");
				}
				break;
			case "julio":
				if (dia<=22){
					System.out.print("Tu horoscopo es: Cancer");
				} else {
					System.out.print("Tu horoscopo es: Leo");
				}
				break;
			case "agosoto":
				if (dia<=22){
					System.out.print("Tu horoscopo es: Leo");
				} else {
					System.out.print("Tu horoscopo es: Virgo");
				}
				break;
			case "septiembre":
				if (dia<=22){
					System.out.print("Tu horoscopo es: Virgo");
				} else {
					System.out.print("Tu horoscopo es: Libra");
				}
				break;
			case "octubre":
				if (dia<=22){
					System.out.print("Tu horoscopo es: Libra");
				} else {
					System.out.print("Tu horoscopo es: Escorpio");
				}
				break;
			case "noviembre":
				if (dia<=21){
					System.out.print("Tu horoscopo es: Escorpio");
				} else {
					System.out.print("Tu horoscopo es: Sagitario");
				}
				break;
			case "diciembre":
				if (dia<=21){
					System.out.print("Tu horoscopo es: Sagitario");
				} else {
					System.out.print("Tu horoscop es: Capricornio");
				}
				break;
			}
}
}
}
