public class EjercicioPizarra2{
	public static void main (String[] args){
		int [][] a= new int[5][10];
		int suma=1;
		int f,c;
		int columna=10;
		int fila=5;
		
		for(c=0; c<columna; c++){
			for(f=0; f<fila; f++){
				a[f][c]=suma;
				suma= suma+1;
			}
		}
		for(c=0; c<fila; c++){
			for(f=0; f<columna; f++){
				System.out.printf("%10d",a[c][f]);
			}
			System.out.println("");
		}
	}
}
