package test;

public class Inheritance {

	public static void main(String[] args) {
		Parent obj = new Child();
		obj.m1();
		
		obj.hashCode();c
	}

}

class Parent {
	public static void m() {
		System.out.println("Parent:m1");
	}
	
	public Number m1() {
		System.out.println("Parent:m1");
		return 0.0d;
	}
}
class Child extends Parent {
	public static void m() {
		System.out.println("Child:m1");
	}
	
	@Override
	public Integer m1() {
		System.out.println("Child:m1");
		return 1;
	}
}
