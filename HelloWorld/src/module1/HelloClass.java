package module1;

public interface HelloClass {
	
	default void helloClass() {
		System.out.println("Hello from interface in same Package!");
	}
}
