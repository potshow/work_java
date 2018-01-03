package exercise;

public class Dog {
	String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Dog doori = new Dog("Doori");
		System.out.println(doori.name);
	}
	
	
}
