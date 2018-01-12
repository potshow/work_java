package Exercise;

import java.util.HashMap;
import java.util.Map;

public class Ex8 {

	public static void main(String[] args) {
		
		Map<String, Integer> hm = new HashMap<String, Integer>();
		
		String[] words = new String[7];
		words[0] = "java";
		words[1] = "c";
		words[2] = "java";
		words[3] = "cpp";
		words[4] = "cpp";
		words[5] = "cobol";
		words[6] = "java";
		
		for (int i = 0; i < words.length; i++) {
		
			Integer num = hm.put(words[i], hm.get(words[i]));
			if (num == null) {
				hm.put(words[i], 1);
			} else {
				hm.put(words[i], hm.get(words[i]) + 1);
			}
	
		}
		
		for (String key : hm.keySet()) {
			System.out.println(key + " : " + hm.get(key));
		}
		
		Map<String, Integer> map2 = new HashMap<String, Integer>(); 
		
		Integer num2 = map2.put("count", 1);	// 변수 타입은 원소타입 따라감. 
		
		System.out.println("count key 값의 이전 value 값: " + num2
							+ " / 현재 count key의 value값: " + map2.get("count"));	
		
		Integer num3 = map2.put("count", map2.get("count") + 1);
		
		System.out.println("count key 값의 이전 value 값: " + num3
							+ " / 현재 count key의 value값: " + map2.get("count"));	
		
	}
	
}
