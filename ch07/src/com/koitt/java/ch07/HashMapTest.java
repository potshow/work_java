package com.koitt.java.ch07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {
	
	public static void main(String[] args) {
		
		Map<String,String> hm = new HashMap<String, String>();
		
		hm.put("대한민국", "서울");	// Map은 add대신에 put을 씀 ( "key"값, "value"값 )
		hm.put("일본", "동경");
		hm.put("중국", "북경");
		hm.put("태국", "방콕");		
		hm.remove("태국");			// "key"값 remove -> value 포함해서 삭제
		hm.put("중국", "북경1");		// key값이 같을 경우 value가 최신값으로 갱신됨

		System.out.print("키 : " + hm.keySet());		// key값만 모아주는 역할을 하는 keySet
		System.out.println(" 값 : " + hm.values());	

		Iterator<String> keys = hm.keySet().iterator();	// iterator는 순차적으로 돌리는 역할. 출력은 안해요
		
		// 1. Iterator 이용
		while ( keys.hasNext() ) {
			String key = keys.next();
			String value = hm.get(key);
			System.out.println(key + ": " + value);
		}
		
		// 2. for-each문
		for(String key : hm.keySet()) {	// set이라는 주머니에서 key 하나씩 끄집어 낸다.
										// Set의 특징 : 한번 다 끄집어 내봐야 내용을 알 수 있다.
										
			String value = hm.get(key);	// key 값( key 안에 value 불러옴) 불러온다~
			System.out.println(key + ": " + value);
		}
		
		// 3. key값을 알고 있어서 직접 key값을 입력하여 값을 끄집어 낸다.
		String value = hm.get("대한민국");
		System.out.println(value);
	}
}
