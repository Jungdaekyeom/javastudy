package Collection;

import java.util.*;

public class LinkedListTest {

	public static void main(String[] args) {

		List<String> list = new LinkedList<String>();

		list.add("둘리");
		list.add("마이콜");
		list.add("도우너");

		// 순회 1
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			System.out.println(s);
		}

		// 삭제
		list.remove(2);

		// 순회2

		Iterator<String> it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// 순회3
		for (String s : list) {
			System.out.println(s);
		}

	}

}
