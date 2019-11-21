
public interface A {
	public default void add() {
		System.out.println("A interface");
	}
}
interface B {
	public default void add() {
		System.out.println("B interface"); 
	}
}