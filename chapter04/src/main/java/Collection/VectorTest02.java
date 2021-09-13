package Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new Vector<String>();

		list.add("둘리");
		list.add("마이콜");
		list.add("도우너");

		// 순회1
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			System.out.println(s);
		}

		// 삭제
		list.remove(2);

		System.out.println("=========================");

		// 순회2

		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		
		// 한번 만들어진 Iterator 객체는 위 while에서 끝났으므로, 
		// 다시 반복하기 위해서는 새 객체를 만들어주어야 한다.
//		Iterator<String> it = list.iterator();
//		while (it.hasNext()) {
//			String s = it.next();
//			System.out.println(s);
//		}

		System.out.println("=========================");

		// 순회3
		for (String s : list) {
			System.out.println(s);
		}

	}

}
