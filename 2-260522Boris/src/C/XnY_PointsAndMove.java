package C;

public class XnY_PointsAndMove {

	public static void main(String[] args) {
		point place = new point();
		point place2 = new point();
		point place3 = new point();
		place.x = 25;
		place.y = 11;
		place2.x = 42;
		place2.y = 69;
		place3.x = 13;
		place3.y = 37;
		System.out.println(place.x + " " + place.y + " " + place2.x + " " + place2.y + " " + place3.x + " " + place3.y);
		place.moveRight();
		System.out.println(place.x + " " + place.y);
		
	}

}
