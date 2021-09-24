package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> m = new HashMap<>();

		m.put("내장지방", "유산소운동");
		// 덮어쓰게된다.
		m.put("지방간", "커피");
		m.put("지방간", "유산소운동");

		System.out.println(m);

		System.out.println(m.size());

		String s1 = "지방간";

		System.out.println(s1 + "에는 " + m.get(s1) + "이 최고!");

		// 순회
		Set<String> s = m.keySet();

		for (String key : s) {
			System.out.println(key + "에는" + m.get(s1));
		}

	}

}
