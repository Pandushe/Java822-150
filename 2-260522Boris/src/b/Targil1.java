package b;

public class Targil1 {

	public static void main(String[] args) {
		int a = (int) (Math.random()*6 + 1);
		if (a>3) {
			System.out.println("Big");
		} else if (a<3){
			System.out.println("Small");
		}else
			System.out.println("bingo");
		System.out.println(a);
	
	}

}
