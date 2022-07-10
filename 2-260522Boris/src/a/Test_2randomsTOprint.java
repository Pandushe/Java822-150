package a;

public class Test_2randomsTOprint {

	public static void main(String[] args) {
		int a = (int) (Math.random()*100);
		int b = (int) (Math.random()*100);
		
		System.out.println(a + " " + b);  //both 
		System.out.println(a+b);  //sum
		System.out.println((a+b)/2D);  //average
		System.out.println(a%10 + " " + b%10); //remainder
		System.out.println(a * b);
		
	}

}
