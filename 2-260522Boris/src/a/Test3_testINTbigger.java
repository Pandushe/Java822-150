package a;

import java.util.Scanner;

public class Test3_testINTbigger {

	public static void main(String[] args) {
		int a = (int) (Math.random()*101);
		int b = (int) (Math.random()*101);
		int max = a > b ? a : b;  // "a > b" if question - "a : b" return a or b depending on the if
		System.out.println(a + " " + b);
		System.out.println(max);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter");
		String user = sc.nextLine();
		System.out.println("hello " + (user.equals("")?"Guest" : user));  // hello user or if null enter guest
		sc.close();
	}

}
