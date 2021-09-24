package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {

		List<String> list = new LinkedList<>();

		list.add("ペコリヌ");
		list.add("コッコロ");
		list.add("キャル");

		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next());
		}

		System.out.println();

		for (String value : list) {
			System.out.println(value);
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
