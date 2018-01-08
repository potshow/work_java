package Exercise;

public class Professor extends  Person	{

	String dept;
	
	public Professor(String name, String dept) {
		super(name);
		this.dept = dept;
	}
	
	Professor pf = new Professor("전산학과", "홍성룡");

	
	
	
}
