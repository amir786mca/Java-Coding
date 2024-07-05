package whileLoop;

import java.util.Scanner;

public class TringularPattern2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while (i<=n) {
			int j=1;
			int StartingNum=i;
			while (j<=i) {
				System.out.print(StartingNum);
				StartingNum++;
				j++;
			}
			System.out.println();
			i++;
			
		}

	}

}
