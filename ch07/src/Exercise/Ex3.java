package Exercise;

public class Ex3 {

	public static void main(String[] args) {
		
		String s1 = new String("java");
		String s2 = new String("java");
		String s3 = s2;
		
		System.out.println(s1 == s2);		//주소값비교
		System.out.println(s1.equals(s2));	//실제값(Constant Pool) 비교
		System.out.println(s2 == s3);
		System.out.println(s2.equals(s3));
		
	}
	
}
