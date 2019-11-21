
public class TestF {
	public static void main(String[] args) {
		Bmw b=new Bmw();
		int g=b.gear();
		b.gps();
		b.abs();
		System.out.println("gear= "+g);
		System.out.println("===================================");
		Toyota t=new Toyota();
		int g1=t.gear();
		t.gps();
		System.out.println("gear= "+g1);
		System.out.println("===================================");
	}
}
