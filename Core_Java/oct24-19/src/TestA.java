
public class TestA {
	static int a;
	int b;
	{
		System.out.println("nonnstatic");
	}
	static {
		a=10;
		System.out.println("block1");
	}
	public TestA() {
		// TODO Auto-generated constructor stub
		System.out.println("TestA Constructor");
	}
	public static void main(String[] args) {

		System.out.println("a= "+a);
		System.out.println("main() constructor");
		TestA t = new TestA();
	}
	static {
		a=20;
		System.out.println("block2");
	}
	static {
		a=40;
		System.out.println("block3");
	}
	{
		this.b= 40;
		a = 50;
		System.out.println(this.b + a);
	}
}
