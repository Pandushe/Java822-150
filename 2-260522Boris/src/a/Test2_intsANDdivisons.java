package a;

public class Test2_intsANDdivisons {

	public static void main(String[] args) {
		int a = 100;
		int b = 350;
		int c = (int) (Math.random() * (b - a -1)) + a;
		System.out.println(c);
		int d = c / 60;
		int e = c % 60;
		System.out.println("Hours " + d + " minutes " + e);
		
	
				
	}

}
