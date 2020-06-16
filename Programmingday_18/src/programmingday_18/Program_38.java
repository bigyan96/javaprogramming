package programmingday_18;

import java.util.Scanner;

public class Program_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input=new Scanner(System.in); 
		System.out.println("enter the instructions");
		String text=input.nextLine();
		
		switch(text){
			case "Run" :
            System.out.println("its is running");
		    break;
			case "Stop" :
			System.out.println("it has stopped");
			break;
			default :
				System.out.println("instruction not clear");
	}
		
	}

		
	}



