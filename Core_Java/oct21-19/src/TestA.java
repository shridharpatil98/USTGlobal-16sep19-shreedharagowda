
public class TestA {
	public static void main(String[] args) {
		Pen p=new Pen();
		p.color="blue";
		p.cost=20;
		p.brand="bright";
		System.out.println("Cost is "+p.cost);
		System.out.println("color is "+p.color);
		System.out.println("brand is "+p.brand);
		p.write();
		System.out.println("================================================================");
		Van v=new Van();
		v.color="green";
		v.cost=12000;
		System.out.println("cost is"+v.cost);
		System.out.println("color is"+v.color);
		v.move();
	}
}
