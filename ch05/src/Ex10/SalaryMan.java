package Ex10;

public class SalaryMan {
	
	int salary = 1000000; //월급여액
	
	public SalaryMan(int salary) {
		this.salary = salary;
	}
	
	
	public int getAnnualGross() {
		int Bonus = (salary*5);
		int yearMoney = (salary*12)+Bonus; 
		return yearMoney;
	}

	public static void main(String[] args) {
		
		SalaryMan salaryMan = new SalaryMan(1000000);
		SalaryMan salaryMan2 = new SalaryMan(2_000_000);
		
		System.out.println(salaryMan.getAnnualGross());
		System.out.println(salaryMan2.getAnnualGross());
		
	}
	
}
