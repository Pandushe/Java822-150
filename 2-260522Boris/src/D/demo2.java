package D;

import java.util.Scanner;

public class demo2 {

	public static void main(String[] args) {
		int password = 123;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Password");
		int input = sc.nextInt();
		
		while (input != password) {
			System.out.println("Wrong. Enter Password");
			input = sc.nextInt();
		}
			
		sc.close();
		System.out.println("Welcome Retard");
	}

}
