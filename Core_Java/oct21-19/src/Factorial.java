
public class Factorial {

	public static void main(String[] args) {

		System.out.println("fact = ");
		fact(5);
	}
	static int sum=1;
	static void fact(int num) {

		if(num>1) {
			sum= sum * num;
			System.out.println(sum);
			fact(num-1);

		}


	}
}