public class OperadorLogicoOR {
	public static void main (String[] args){
		
		boolean a;
		a=true;
		
		boolean b; 
		b= false;
		
		System.out.println("true or true es: "+(a || a));
		System.out.println("true or false es: "+(a || b));
		System.out.println("false or false es: "+(b || b));
		System.out.println("false or true es: "+(b || a));
		
		
}
}
