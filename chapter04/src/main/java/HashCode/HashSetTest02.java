package HashCode;

import java.util.*;

public class HashSetTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// set은 순서 상관 X
		Set<Gugudan> s = new HashSet<>();

		s.add(new Gugudan(2, 3));
		s.add(new Gugudan(9, 9));
		// s.add(new Gugudan(2, 3)); 와 같다.
		s.add(new Gugudan(3, 2));

		s.add(new Gugudan(4, 8));
		s.add(new Gugudan(8, 4));

		// 해시값을 같게 해서, 중복값을 없앤다.
		// 오버라이딩을 통해 equals랑 hashCode를 조정한다.
		for (Gugudan g : s) {
			System.out.println(g);
		}
		

	}

}
