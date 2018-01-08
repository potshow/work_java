package inheritance.abstractinterface;

public interface Connectable {
	// interface는 공개되어있기 때문에 무조건 public static abstract이 붙는다. 
	// default로 따로적지않아도 그렇게되있음
	// 상수 정의 ( static 상수 선언!)
	/*public static*/ final String name = "연결 방법: USB";
	
	// 추상 메소드 선언
	/*public abstract*/ void connect();

}
