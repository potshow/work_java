package ch07;

public class TestGetterSetter {
	
	public static void main(String[] args) {
		
		/*GetterSetter cat1 = new GetterSetter("페르시안 친칠라", 7, "먼지");
		GetterSetter cat2 = new GetterSetter("노르웨이 숲", 4, "키티");
		GetterSetter cat3 = new GetterSetter("봄베이", 2, "까망이");
		GetterSetter cat4 = new GetterSetter("아비시니안", 10, "미옹");
		*/
		
		GetterSetter cat1 = new	GetterSetter();
		GetterSetter cat2 = new GetterSetter();
		
		cat1.setType("페르시안 친칠라");
		cat1.setName("먼지");
		cat1.setAge(7);
		
		
		System.out.println("타입 : " +  cat1.getType());
		System.out.println("이름 : " + cat1.getName());
		System.out.println("나이 : " + cat1.getAge() + "살");
		
	}

}
