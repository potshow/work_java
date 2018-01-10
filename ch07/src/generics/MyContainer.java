package generics;

import java.util.ArrayList;
import java.util.List;

public class MyContainer<E> {
	private List<E> list;
	
	public MyContainer() {
		list = new ArrayList<E>();
	}
	public E get(int index) {
		return list.get(index);
	}
	public void add(E element) {
		list.add(element);
	}
	
	public static void main(String[] args) {
		
		MyContainer<String> pl = new MyContainer<String>(); // 객체를 만들때 String을 넣었기 때문에 E값 들어간 부분이 다 String이 된것이다.
		pl.add("algol");
		pl.add("C");
		//pl.add(5); 오류 발생
		pl.add("java");
		System.out.println(pl.get(0) + " ");
		System.out.println(pl.get(1) + " ");
		System.out.println(pl.get(2) + " ");
	
		MyContainer<Integer> p2 = new MyContainer<Integer>();
		p2.add(2);	//Generic E를 넣었던 메서드들이 다 Integer 타입으로 바껴가지고 p2는 정수만 입력가능.
	}
}
