package Ex10;

public class Student {

	private String major; //학과
	private int num; //학번
	
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Student(String major, int num) {
		this.major = major;
		this.num = num;
	}
	
	public static void main(String[] args) {
		Student A = new Student("식품과", 20141234);
		
		System.out.println(A.major + A.num);
		
		A.setMajor("식품영양과");
		A.setNum(20143214);
		
		System.out.println(A.getMajor() + A.getNum());
	}
	
}
