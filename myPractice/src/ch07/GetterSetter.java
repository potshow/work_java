package ch07;

public class GetterSetter {

	private String type;	// 종
	private int age;		// 나이
	private String name;	// 이름

	
	/*public GetterSetter(String type, int age, String name) {
		this.type = type;
		this.age = age;
		this.name = name;
	}*/
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
