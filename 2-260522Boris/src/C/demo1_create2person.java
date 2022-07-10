package C;

public class demo1_create2person {

	public static void main(String[] args) {
		
		person p1 = new person();  // Referring to person.java
		person p2 = new person();
		
		p1.age = 25;
		p2.age = 69;
		p1.name = "Boris";
		p2.name = "Retard";
		p1.id = 42069;
		p2.id = 69420;
		
		System.out.println(p1.age);
		System.out.println(p1.name);
		System.out.println(p2.age + " " + p1.id);
		System.out.println(p2.name + " " + p2.id);
		p1.sayHello();
		p2.sayHello();
		
	}

}
