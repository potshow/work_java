package Ex10;

public class Temporary extends Employee{

	int worktime;//일한시간
	int money = 10000; // money = 시간당 보수

	public Temporary(String name, int age, String address, String division) {
		super(name, age, address, division);
	}


	public void printInfo() {
		System.out.println("비정규직");
		System.out.println(this.worktime + super.salary);

	}

	public static void main(String[] args) {
		/*Regular r = new Regular("이순신", 35, "서울", "인사부");
		Temporary t = new Temporary("장보고", 25, "인천", "경리부");

		r.setSalary(5000000);
		r.printInfo();

		t.setWorkHour(120);
		t.printInfo();*/

		Employee r = new Regular("이순신", 35, "서울", "인사부");
		Employee t = new Temporary("장보고", 25, "인천", "경리부");

		r.setSalary(5000000);
		r.printInfo();

		t.setWorkHour(120);
		t.printInfo();

	}
}
