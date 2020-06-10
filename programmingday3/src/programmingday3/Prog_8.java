//calculator using switch case


package programmingday3;

import java.util.Scanner;

public class Prog_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the 1st number");
int no1=s.nextInt();
System.out.println("enter the 2nd number");
int no2=s.nextInt();
int res;
System.out.println("select symbol(+,-,*,/)");
String symbol=s.next();
switch(symbol) {
case"+":res=no1+no2;
        System.out.println("the sum is" +res);
        break;
        
        
case"-":res=no1-no2;
System.out.println("the sum is" +res);
break;
case"*":res=no1*no2;
System.out.println("the sum is" +res);
break;
case"/":res=no1/no2;
System.out.println("the sum is" +res);
break;
}





	}
}
