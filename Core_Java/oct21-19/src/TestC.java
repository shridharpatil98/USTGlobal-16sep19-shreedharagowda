
public class TestC {

	public static void main(String[] args) {
		System.out.println("========================================");
		Person p=new Person();
		p.age=45;
		p.name="darshan";
		Person.color="white";
		p.walk();
		Person.sleep();
		System.out.println("age "+p.age);
		System.out.println("name "+p.name);
		System.out.println("color "+Person.color);
		p.eat();
		System.out.println("===========================================");
	}
}
