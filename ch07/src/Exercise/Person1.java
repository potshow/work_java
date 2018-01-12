package Exercise;

class Person1{
		private String name;
		
		public Person1(String name) {
		this.name = name;
		}

		public boolean equals(Person1 p) {
		if(this.name == p.name) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Person1 p1 = new Person1("홍길동");
		System.out.println(p1.equals(new Person1("홍길동")));
		System.out.println(p1.equals(new Person1("최영태")));

	}
}
