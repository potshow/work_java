package Ex10;

public class Regular extends Employee {

	public Regular(String name, int age, String address, String division) {
		super(name, age, address, division);
	}

	public void printInfo() {
		System.out.println("정규직");
		System.out.println("급여 : " + super.salary);
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}

}
