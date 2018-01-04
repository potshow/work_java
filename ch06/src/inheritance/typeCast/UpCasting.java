package inheritance.typeCast;

public class UpCasting {
	public static void main(String[] args) {

		Person she = new Person("이소라", 2056432);
		System.out.println(she.name + " " + she.number);
		
		Faculty f = new Faculty("김영태", 1145782, "연한대학교", 38764);
		Person p = f;		/* 부모타입의 변수는 자식 객체를 저장할 수 있다.
							 * 부모의 타입에 자식의 객체를 넣을수있다. 
							 * 부모가 자식을 품었다 Person < 타입 / f < 자식의 객체
							 */
		//System.out.print(p.name + " " + p.number + " ");
		//System.out.print(p.univ); //참조불가능 < Person 클래스에 univ 필드값이 없기때문에 참조가 안됩니다.
		System.out.println(f.name + " " + ((Person) f).number);
		System.out.println(f.univ + " " + f.number);
		
		Staff s = new Staff("김상기", 1187543, "강서대학교", 3456);
		s.division = "교학처";
		Person pn = s;		//업캐스팅
		Faculty ft = s;		//업캐스팅
		System.out.print(pn.name + " " + pn.number);
		System.out.print(ft.univ + " " + ft.number);
		System.out.println(s.division);
	}

}
