
public class Student {
	String USN;
	String name;
	String college;
	String branch;
	double cgpa;
	public Student(String USN, String name,String college,String branch,double cgpa) {
		// TODO Auto-generated constructor stub
		this.branch=branch;
		this.cgpa=cgpa;
		this.college=college;
		this.name=name;
		this.USN=USN;
	}
	void printDetails() {
		System.out.println("Student Details \n name="+name+"\n USN="+USN+"\n college="+college+"\n branch="+branch+"\n cgpa="+cgpa);
	}
	public static void main(String[] args) {
		Student s1= new Student("16CS414", "Darshan", "SSIT", "CSE", 7.83);
		Student s2= new Student("16CS415", "Vinod", "SSIT", "ECE", 8.83);
		Student s3= new Student("16CS416", "Akash", "SSIT", "CSE", 9.83);
		Student s4= new Student("16CS417", "Ram", "SSIT", "ECE", 6.83);
		Student s5= new Student("16CS418", "Vijay", "SSIT", "CSE", 7.83);
		Student s6= new Student("16CS419", "Brahma", "SSIT", "CSE", 7.83);
		Student s7= new Student("16CS410", "Shiva", "SSIT", "CSE", 7.83);
		Student s8= new Student("16CS411", "Krishna", "SSIT", "CSE", 8.83);
		Student s9= new Student("16CS412", "chandan", "SSIT", "ECE", 9.83);
		Student s10= new Student("16CS413", "annonyms", "SSIT", "TCE", 6.83);
		s1.printDetails();
		System.out.println("======================================================");
		s2.printDetails();
		System.out.println("======================================================");
		s3.printDetails();
		System.out.println("======================================================");
		s4.printDetails();
		System.out.println("======================================================");
		s5.printDetails();
		System.out.println("======================================================");
		s6.printDetails();
		System.out.println("======================================================");
		s7.printDetails();
		System.out.println("======================================================");
		s8.printDetails();
		System.out.println("======================================================");
		s9.printDetails();
		System.out.println("======================================================");
		s10.printDetails();

	}
}
