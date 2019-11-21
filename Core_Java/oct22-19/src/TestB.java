
public class TestB {
	static {
		System.out.println("static block");
	}
	public TestB() {
		// TODO Auto-generated constructor stub
		System.out.println("TestB constructor");
	}
	public static void main(String[] args) {
		System.out.println("main started");
		new TestB();
		System.out.println("main ended");
	}
}
