
public class TestA {
	int c;
	int key;
	public static void add(int a,int b) {
		System.out.println("add a,b"+(a+b));
	}
	public static void add(int a,float b) {
		System.out.println("add a,b"+(a+b));
	}
	public static void add(int a, byte b) {

		System.out.println("add a,b"+(a+b));
	}
	public static void main(String[] args) {
		add(10,5.6f);
		add(10,20);
		add(60,6);
		main(6);
	}
	void msg() {
		System.out.println(c);
		System.out.println(new TestA().key);
	}
	public static void main(int args ) {
		System.out.println("main"+args);
		TestA a=new TestA();
		a.msg();
		int ab;
		System.out.println(a);
	}

}
