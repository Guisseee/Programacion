/*Libreria de funciones varias
 * Autor: Guillermo Jáuregui Lahoz.
*/
package Tema8_Funciones.TareaC8_1.Jueves02_02_23.misFunciones;

public class Varias {
    /*Funcion de multiplicación.
    *@param n numero entero con decimales.
    *@param m numero entero con decimales.
    *@return multi= el resultado de la multiplicacion.
    */
    public static double multiplica(double n, double m) {
        double multi= n*m;
        return multi;
    }
    /*Función que dice si es mayor o menor de edad.
    @param n numero entero positivo
    @return true si el numero es myor o igual a 18.
    @return false si el numero es menor a 18.
    */
    public static boolean esMayorEdad(int n){
        if(n>=18){
            return true;
        }
        return false;
    }
    /*Función que dice cual es el numero menor de dos introducidos por teclado.
    @param n numero entero
    @param m numero entero
    @return m si es mayor que n
    @return n si es mayor que m
    */
    public static int minimo(int n, int m){
        if(n>m){
            return m;
        }
        return n;
    }
    /*función que dice el signo del numero.
    @param n numero entero
    @return 1 si el numero es mayor o igual a 1
    @return 0 si el numero es igual a 0
    @return -1 si el numero es igual o menor a -1
    */
    public static int dimeSigno(int n){
        if(n>=1){
            return 1;
        }else if(n==0){
            return 0;
        }else{
            return -1;
        }
    }
    /*Funcion que calcula el area de un rectangulo.
    @param n numero entero
    @param m numero entero
    @return area= el calculo del area del rectangulo
    */
    public static double areaRectangulo(double n, double m){
        double area= n*m;
        return area;
    }
    /*Función que calcula el perimetro de un rectángulo.
    @param n numero entero 
    @param m numero entero 
    @return perimetro= el calculo del perimetro del rectangulo
    */
    public static double perimetroRectangulo(double n, double m){
        double perimetro= 2*(n+m);
        return perimetro;
    }
    /*Función que calcula el sumatorio de un número introducido por teclado.
    @param n
    @return sumatorio= el resultado del sumatorio del numero.
    */
    public static int suma1aN(int n){
        int numerosumatorio= n;
        int sumatorio= 0;
        int contador= n;
        while (contador!=0){
            sumatorio= numerosumatorio+contador;
            contador--;
        }
        return sumatorio;
    }
    /*Función que calcula el factorial de un número introducido por teclado.
    @param n numero entero 
    @return factorial= el resultado del factorial del numero
    */
    public static int factorial(int n){
        int numerofactorial= n;
        int factorial= 1;
        int contador= n;
        while (contador!=0){
            factorial= numerofactorial*contador;
            contador--;
        }
        return factorial;
    }
    /*Función que calcula el intermedio.
    @param n numero entero 
    @return intermedio= el resultado de la media del numero
    */
    public static double intermedio1aN(int n){
        double intermedio= n/2;
        return intermedio;
    }
    /*Función que calcula el maximo de 3 números.
    @param n numero n
    @param m numero entero 
    @param b numero entero
    @return aux= si el aux es mayor al numero b
    @return b= si el numero es mayor a aux
    */
    public static int maximo(int n, int m, int b){
        int aux;
        if (n>m){
            aux= n;
        }else {
            aux= m;
        }
        if(aux>b){
            return aux;
        }else{
            return b;
        }
    }
    public static String tablaMultiplicar(int n){
        int multiplicacion= 0;
        String tabla="";
        for(int i=1; i<11; i++){
            multiplicacion= i*n;
            tabla= tabla+Integer.toString(multiplicacion)+" ";
        }
        return (tabla);
    }
}
