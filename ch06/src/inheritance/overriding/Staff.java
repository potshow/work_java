package inheritance.overriding;

public class Staff extends Faculty{
	
	public String division;
	
	public Staff(String name, long number, String univ, long idNumber, String division) {
		super(name, number, univ, idNumber);
		this.division = division;
	}
	
	public void printInfo( ) {
		System.out.print("이름: " + super.name + " 주민번호: " + super.number);
		System.out.print(" 대학: " + this.univ + " 직원번호: " + super.number);
		System.out.println(" 부서: " + this.division);
	}
	
	public void printFacultyInfo() {
		super.printInfo(); //부모의 printInfo를 호출~
	}
	
	public static void main(String[] args) {
		
		Person she = new Person("이소라", 2056432);
		she.printInfo();
		
		Faculty i = new Faculty("김영태", 1145782, "연한대학교", 38764);
		i.printInfo();
		
		Staff he = new Staff("최영기", 1167429, "남도대학교", 1287, "기획처");
		he.printInfo(); // Info를 호출하면 최상위 부모부터 메서드를 확인. Person 확인 -> Faculty 확인 -> Staff확인
		he.printFacultyInfo();
	}

}
