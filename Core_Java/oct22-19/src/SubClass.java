
public class SubClass extends Super{
	String s="sub class variable";
	SubClass(){
		
		System.out.println("sub class");
	}
	void getData() {
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
		super.method();
	}	
}
