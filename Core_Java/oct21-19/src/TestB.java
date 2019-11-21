
public class TestB {

	public static void main(String[] args) {
		System.out.println("==================================");
		Cow c= new Cow();
		c.color="black";
		c.name="ganga";
		System.out.println("color is="+c.color);
		System.out.println("name is="+c.name);
		c.eat();
		c.sleep();
		System.out.println("======================================");
	}

}
