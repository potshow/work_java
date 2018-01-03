package exercise;

public class Person2 {

	String name;
	
	public Person() {
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Person p = new Person("예진");
		System.out.println(p.name);
		Person p2 = new Person("진태");
		System.out.println(p2.name);
	}
	
}
