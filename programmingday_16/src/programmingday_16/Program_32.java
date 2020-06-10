package programmingday_16;

public class Program_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=6;i!=0;i--) {
			for(int j=0;j<6-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<(2*i-1);k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
