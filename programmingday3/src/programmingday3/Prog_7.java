//check for leap year

package programmingday3;

public class Prog_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int year=2014;
      {
    	 if(year%400==0||year%4==0 && year%100!=0)
    	 {
    		 System.out.println(" it is leap year");
    	 }
    	 else {
    		 System.out.println("it is not leap year");
    	 }
     }
	}
}