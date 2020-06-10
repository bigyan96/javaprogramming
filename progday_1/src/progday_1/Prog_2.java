//prome numbers from 1-100


package progday_1;

public class Prog_2 {

	public static void main(String[] args) {
		
		int a=1,b=0,c;
		System.out.println(a+" "+b);
		
		for(int i=0;i<=10;i++) {
			c=a+b;
			System.out.println(+c);
			
			a=b;
			b=c;
		}
		
	}

}
