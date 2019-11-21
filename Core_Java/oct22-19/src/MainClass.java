
public class MainClass {
	final void add() {
		System.out.println("add");
	}
	final void add(int a) {
		System.out.println("add 2");
	}
	public static void main(String[] args) {
		SubClass s = new SubClass();
		s.getData();
		MainClass m=new MainClass();
		m.add();
		m.add(8);
		m.add();
		m.add();
	}
}
