package practice1;

import java.util.Scanner;

public class Uri1075 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int n = scanner.nextInt();
		
		for(int i=2;i<10000;i++) {
			if(i%n==2) {
				System.out.println(i);
			}
		}
		
		
		scanner.close();
	}
}
