package Exercise;

class Person{
		private String name;
		
		
		public Person(String name) {
			super();
			this.name = name;
		}
		
		// equals 누르고 컨트롤+스페이스 하면 오브젝트에서 equals 메서드 불러오기가능
		@Override
		public boolean equals(Object obj) {
			
			//1. Argument의 객체와 나 자신의 주소값을 비교
			if (this == obj) {
				return true;
			}
			
			//2. Argument의 객체가 이 클래스를 상속받고 있는지 검사 (instanceof) : obj가 person을 상속받는지 검사
			//	비교하는 객체가 Person 클래스가 아니면 false 내기. == 를 하면 이름을 비교안해도 클래스가 같다고 true내버리니 안됨. 그래서 !==
			if (!(obj instanceof Person)) {
				return false;
			}
			
			//3. 실제 name 필드값이 같은지 비교
			Person p = (Person) obj;		// obj의 name 필드에 접근하기위해 다운캐스팅. 다운캐스팅 안하면 접근안댐
			if(this.name.equals(p.name)) {
				return true;
			}
			return false;		// boolean의 기본값이 false이기 때문에 기본 리턴값은 false로 한다.
		}
		
		public static void main(String[] args) {
			Person p1 = new Person("홍길동");
			System.out.println(p1.equals(new Person("홍길동")));
			System.out.println(p1.equals(new Person("최영태")));

		}

		

}
