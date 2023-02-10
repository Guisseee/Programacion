public class OperardorLogicoAND {
	public static void main (String[] args){
		
		boolean a;
		a=true;
		
		boolean b; 
		b= false;
		
		System.out.println("true y true es: "+(a && a));
		System.out.println("true y false es: "+(a && b));
		System.out.println("false y false es: "+(b && b));
		System.out.println("false y true es: "+(b && a));
		
		
}
}
