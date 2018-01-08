package Ex10;

public class Employee {
	
	String name; //이름
	int age; //나이
	String address; //주소
	String division; //부서
	int salary; //월급
	int money = 10000;
	
	public Employee(String name, int age, String address, String division) {
		this.name = name;
		this.age = age;
		this.division = division;
		this.address = address;
	}
	
	public void printInfo() {
		System.out.println("이름: " + this.name + " 나이: " + this.age + " 주소: " + this.address + " 부서: " + this.division);
	}

	public int setWorkHour(int worktime) {
		return salary = worktime * money; 
		
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


	
	
}
