//to swap values of 2nos with/without 3rd variable


package programmingday_4;

public class Prog_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a=10,b=20;
       //int t;
      // t=a;
       //a=b;                                                //with 3rd variable
       //b=t;
       //System.out.println("swapped value of a is " +a);
       //System.out.println("swapped value of b is "  +b);
       
       a=a+b;
       b=a-b;                                                  //without 3rd variable
       a=a-b;
       System.out.println("swapped value of a is " +a);
       System.out.println("swapped value of b is "  +b);
		
	}

}
