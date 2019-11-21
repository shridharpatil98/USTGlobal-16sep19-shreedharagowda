
public class Person extends TestB{
	String name;
	int age;
	public Person(String name,int age) {
		// TODO Auto-generated constructor stub
		this.age=age;
		this.name=name;
	}
	void printDetails() {
		System.out.println("name="+this.name+" age="+this.age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person("Darshan", 41);
		p.printDetails();
		Person p1=new Person("baba", 43);
		p1.printDetails();
	}

}
