package Ex10;

public class SalaryMan {
	
	int salary = 1000000; //월급여액
	
	public SalaryMan() {
		
	}
	
	public SalaryMan(int salary) {
		this.salary = salary;
	}
	
	
	//메서드
	public int getAnnualGross() {
		int Bonus = (salary*5);
		int yearMoney = (salary*12)+Bonus; 
		return yearMoney;
	}


	
	public static void main(String[] args) {
		
		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(2_000_000).getAnnualGross());
		
	}
	
}
