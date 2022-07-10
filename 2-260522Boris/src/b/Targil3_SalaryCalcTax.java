package b;

import java.util.Scanner;

public class Targil3_SalaryCalcTax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter salary");
		
		double salary = sc.nextDouble();
		sc.close();
		
		double tax = 0;
		
		if (salary >= 0) {
			System.out.println("calculating tax");
			if (salary < 23000) {
				tax = salary * 0.1;
			} else if (salary <= 50000) {
				tax = salary * 0.2;
			} else if (salary <= 100000) {
				tax = salary * 0.3;
			} else {
				tax = salary * 0.4;
			}
			System.out.println("salary before tax : " + salary);
			System.out.println("tax is : " + tax);
			System.out.println("salary after tax : " + (salary - tax));
			
			
		} else {
			System.out.println("salary cannot be negative");
		}
				
	}

}
