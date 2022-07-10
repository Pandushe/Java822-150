package b;

import java.util.Scanner;

public class Targil2_SalaryCalcTax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter salary: ");
		
		double salary = sc.nextDouble();
		sc.close();
		
		double tax = 0;
		
		if (salary >= 0) {
			System.out.println("calculating tax");
			if (salary < 23000) {
				tax = salary * 0.1;
			} else if (salary <= 50000) {
				tax += 23000 * 0.1;
				tax += (salary - 23000) * 0.2;
			} else if (salary <= 100000) {
				tax += 23000 * 0.1;
				tax += 27000 * 0.2;
				tax += (salary - 50000) * 0.3;
			} else {
				tax += 23000 * 0.1;
				tax += 27000 * 0.2;
				tax += 50000 * 0.3;
				tax += (salary - 100000) * 0.4;
			}
			System.out.println("salary before tax : " + salary);
			System.out.println("tax is : " + tax);
			System.out.println("salary after tax : " + (salary - tax));
			
			
		} else {
			System.out.println("salary cannot be negative");
		}
				
	}

}
