package progday_8;

public class Calculator {
	
	public int add(int a,int b) {
		
		return a+b;
	}
	public int subtract(int c, int d) {
		
		
		return c-d;
	}
	public int multiply(int e,int f) {
		
		 return e*f;
		
	}
	public int divide(int g,int h) {
		
		return g/h; 
		
	}

	
	public static void main(String[] args) {


		 Calculator a1= new Calculator();
		System.out.println( a1.add(10,2));
		System.out.println(a1.subtract(12, 10));
		System.out.println(a1.multiply(5,2));
		System.out.println( a1.divide(12,2));
		 
		
		
	}

}
