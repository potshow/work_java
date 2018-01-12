package ch07;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex8 {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		String[] words = new String[7];
		words[0] = "java";
		words[1] = "c";
		words[2] = "java";
		words[3] = "cpp";
		words[4] = "cpp";
		words[5] = "cobol";
		words[6] = "java";

		for (int i = 0; i < words.length; i++) {

			Integer num = map.put(words[i], map.get(words[i]));
			if (num == null) {
				map.put(words[i],1);
			} else {
					map.put(words[i], map.get(words[i]) + 1);
				}
			}

			System.out.println("4 distinct words detected:");
			System.out.print(map);



	}
}
