package array.basic;

public class Arraycopy {

	public static void main(String[] args) {
		
		int[] copyFrom = {1, 2, 3, 4, 5, 6, 7};
		int[] copyTo = {10, 20, 30, 40, 50, 60, 70, 80};
		
		
		
		//System.arraycopy(src, srcPos, dest, desyPos, length); << system.a 치고 ctrl+스페이스바 치면 나옴!
		//	  			근원지	근원값	목적지	목적값 	원본에서 몇칸까지 쓸건가
		/* 원본의 일부를 복사해봅시다.
		 * src : 소스. 원본값 copyFrom
		 * srcPos : 소스의 포지션. 4번째 값부터 복사해올 것이다.
		 * dest : 목적지. 붙여넣을 값 copyTo
		 * desyPos : 목적지. 1번째 값부터 붙여넣을 것이다.
		 * length : 붙여넣을 값의 범위
		 */
		System.arraycopy(copyFrom, 4, copyTo, 1, 3);
		
		for (int i = 0; i < copyFrom.length; i++) {
			System.out.print(copyFrom[i] + " ");
		}
		System.out.println();
		
		//for-each 문
		// int value(새로운 변수값) : (기존 배열) 로 치면 기존 배열의 length만큼 값을 print 해줌.
		for (int value : copyTo)  {
			System.out.print(value + " ");
		}
	}
	
}
