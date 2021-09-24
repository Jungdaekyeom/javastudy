package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		
		list.add("ペコリぬ");
		list.add("コッコロ");
		list.add("キャル");
		list2.add("여기는");
		list2.add("한국어");
		
		list.addAll(list2);
		
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			System.out.println(s);
		}

		for (String s : list) {
			System.out.println(s);
		}

		list.remove(2);

		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			System.out.println(s);
		}

		Set<String> s = new HashSet<>();

		s.add("ジャガイモ");
		s.add("ニンジン");
		s.add("キャベツ");
		s.addAll(list);

		System.out.println(s);
		
		System.out.println("================================");
		
		HashSet<Integer> A = new HashSet<>();
		A.add(1);
		A.add(2);
		A.add(2);
		A.add(2);
		A.add(2);
		A.add(3);
		A.add(2);
		
		System.out.println(A);

	}

}
