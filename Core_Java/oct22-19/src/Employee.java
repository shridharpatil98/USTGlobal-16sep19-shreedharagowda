
public class Employee {
	String name;
	int eid;
	long adhar;
	public Employee(String name,int eid) {
		this.name = name;
		this.eid = eid;
	}
	public Employee(String name, int eid, long adhar) {

		this.name = name;
		this.eid = eid;
		this.adhar = adhar;
	}
	void PrintDetails() {
		System.out.println("Employee Details \n nmae="+name+"\n eid="+eid+"\n adhar="+adhar);
	}
	public static void main(String[] args) {
		Employee e=new Employee("Kumar", 12);
		Employee e1=new Employee("Darshan", 77, 451212);
		e.PrintDetails();
		System.out.println("====================================");
		e1.PrintDetails();
		System.out.println("=====================================");
	}
}
