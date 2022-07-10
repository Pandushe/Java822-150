package D;

public class demo4_2RandomPrintbetween {

	public static void main(String[] args) {
		int a = (int) (Math.random()*101);
		int b = (int) (Math.random()*101);
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		System.out.println("a=" + a + " "  + "b=" + b);
		for (int i = a; i<=b; i++) {
			System.out.println(i);
		}
			
		
	}

}
