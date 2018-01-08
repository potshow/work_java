package inheritance.typeCast;

public class DownCasting {

	
	public static void main(String[] args) {
		
		Person she = new Person("이소라", 2056432);
		System.out.println(she.name + " " + she.number);
		//Faculty f = she; 				//컴파일오류 : 평상시에 빨간줄 쳐지는 오류
		//Faculty f1 = (Faculty) she; 	//실행오류 (Runtime Exception) : 실행을 해봐야 알수있는 오류
		
		Person p = new Staff("김상기", 1187543, "강서대학교", 3456); // << 이게 업캐스팅. staff가 person타입으로 객체생성
																	// 업캐스팅을 하면 업캐스팅되는 타입의 인자만 보면 됨. 봐야할 요소가 적어져서 편함.
		//Staff s = p;					//컴파일오류
		Staff i = (Staff) p;	// <<이게 다운캐스팅임..... p 타입 staff로 변경
		i.division = "교학처";
		System.out.print(p.name + " " + p.number + " ");
		System.out.print(i.univ + " " + i.number + " ");
		System.out.println(i.division);
			
		Faculty f2 = i;			//업캐스팅 : 자식이 잠깐 부모행세 하는것.
		Staff s1 = (Staff) f2; 	//다운캐스팅 : 부모행세했다가 자기타입으로 돌아오는게 다운캐스팅
		
		
	}
	
}
