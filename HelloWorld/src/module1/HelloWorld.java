package module1;

import package02.AnotherPackage;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello from main method!");
		anotherClass ac = new anotherClass();
		ac.anotherHello();
		ac.moduleHello();
		ac.helloClass();
		AnotherPackage ap = new AnotherPackage();
		ap.anotherPackageHello();
	}

}

class anotherClass extends HelloModule implements HelloClass{
	
	public void anotherHello() {
		System.out.println("Hello from another Class!");
	}
}
