package whileLoop;

		import java.util.Scanner;

		public class SqurePattern {

			public static void main(String[] args) {
				Scanner s=new Scanner(System.in);
				int n=s.nextInt();
		        //int i=1;
			    //while (i<=n) {
				//	int j=1;
				//	while (j<=n) {
					//	System.out.print(n-j+1);//using while loop code
					//	j++;
				//	}
				//	System.out.println();
				//	i++;
				for(int i=1; i<=n; i++)	{	
					for(int j=1; j<=n; j++) { //using for loop
						System.out.print(n-j+1);
					}
				System.out.println();
				}
			}
		}
