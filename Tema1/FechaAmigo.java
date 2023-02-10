public class FechaAmigo{
	public static void main (String[] args) {
		int year1;
		year1= 2003;
		
		int year2;
		year2= 2002;
		
		int suma;
		suma=year1+year2;
		
		boolean menor;
		menor=year1<year2;//Indica el año mayor o menor, no la edad de la persona//
		
		boolean mayor;
		mayor=year1>year2;
		
		boolean igual;
		igual=year1==year2;
		
		boolean distinto;
		distinto=year1!=year2;
		
		char nombre;
		nombre= 'G';
		
		char nombre2;
		nombre= 'M';
		
		boolean letramayor;
		letramayor='G'>'M';
		
		System.out.println("La suma de los anos es: " +suma);
		System.out.println("El ano 1 es menor: "+menor);
		System.out.println("El ano 1 es mayor: "+mayor);
		System.out.println("Los dos anos son iguales: "+igual);
		System.out.println("Los dos anos son distintos: "+distinto);
		System.out.println("G es mayor que M: "+letramayor);
		}
}
