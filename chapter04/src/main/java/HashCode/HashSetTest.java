package HashCode;

import java.util.*;

public class HashSetTest {

	public static void main(String[] args) {

		Set<Rect> set = new HashSet<Rect>();

		Rect r1 = new Rect(10, 20);
		Rect r2 = new Rect(10, 20);

		set.add(r1);
		set.add(r2);

		
		for (Rect r : set) {
			System.out.println(r);
		}

	}

}
