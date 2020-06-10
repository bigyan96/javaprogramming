package programmingday_13;

public class Program_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j,lines=5;
for(i=1;i<=lines;i++){
	for(j=lines;j>=1;j--) {
		if(j!=i) {
		System.out.print(j);
	}else
	System.out.print("*");
}
	
System.out.println(" ");
	}

}
}
