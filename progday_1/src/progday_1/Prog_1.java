//to reverse a string
package progday_1;

public class Prog_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="bigyan";
		  
		int lang=name.length();
		String rev="";
		for(int i=lang-1;i>=0;i--) {
			
			rev=rev+name.charAt(i);
			
		}
		System.out.println("reverese of the string is "  +rev);
	}

}
