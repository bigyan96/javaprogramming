package programmingday_19;

public class Program_43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][][]a={{{10,20,30},{30,40,50}},{{40,50,60},{80,90}}};
		 for(int i=0;i<a.length;i++) {
			 for(int j=0;j<a[i].length;j++)
				 for(int k=0;k<a[j].length;k++)
			 System.out.print(a[i][j][k]+" ");
		 }
	}

}
