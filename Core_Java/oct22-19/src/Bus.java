
public class Bus {
int seats;
String color;
	public Bus() {
		this(40);
		// TODO Auto-generated constructor stub
	}
	public Bus(int seats, String color) {
		
		this.seats = seats;
		this.color = color;
	}
	public Bus(int seats) {
	
		this(seats,"red");
	}
	void PrintDetails() {
		System.out.println("Selected bus seats="+seats+" color"+color);
	}
	
	public static void main(String[] args) {
		Bus b=new Bus(45,"green");
		Bus b1=new Bus(35);
		Bus b2=new Bus();
		b.PrintDetails();
		System.out.println("================================");
		b1.PrintDetails();
		System.out.println("================================");
		b2.PrintDetails();
	}

}
