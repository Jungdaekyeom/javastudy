package HashCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {

		// key, value
		Map<String, Integer> m = new HashMap<>();

		// 자바는 무조건 객체가 들어가야 하므로, auto boxing 중
		// one도 1 도 객체다.
		m.put("one", 1); // auto boxing
		m.put("two", 2);
		m.put("three", 3);
		m.put("four", 4);

		int i = m.get("one"); // auto unboxing

		System.out.println("==============================");
		m.clear();
		
		// ks1 객체
		String ks1 = "one";
		m.put(ks1, 1); // auto boxing
		m.put("two", 2);
		m.put("three", 3);
		m.put("four", 4);

		int j = m.get("one"); // auto unboxing

		System.out.println(j);

		int k = m.get(new String("one"));
		System.out.println(j + ":" + k);

		// 같은 key값으로 put하면 overwrite됨.
		m.put("three", 333333);
		System.out.println(m.get("three"));

		System.out.println("=============================");
		System.out.println("adsf");
		
		// 순회
		Set<String> s = m.keySet();
		for (String key : s) {
			System.out.println(key);
		}
		System.out.println("=============================");

		for (String key : s) {
			System.out.println(m.get(key));
		}

	}

}
