
public class Student {
	String name;
	String usn;
	final String cname;
	final int cid;
	public Student(String name,String usn) {
		// TODO Auto-generated constructor stub
		cname="SSIT";
		cid=123;
		this.name=name;
		this.usn=usn;
	}
	final void details() {
		System.out.println("name= "+name+" usn= "+usn+" cname= "+cname+" cid= "+cid);
	}
}
