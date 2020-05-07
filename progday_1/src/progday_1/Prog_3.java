package progday_1;

public class Prog_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int no=7,temp=0;
         for(int i=2;i<=no-1;i++) {
        	 
             if(no%i==0) {
        	 temp=temp+1;
             }
         }
   		
		if(temp==0) {
			System.out.println("it is a prime number");
		}
		else {
			System.out.println("it is not a prime number");
		}
		
	}

}
