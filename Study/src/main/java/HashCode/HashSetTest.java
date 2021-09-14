package HashCode;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Test> set = new HashSet<Test>();
		
		Test t1 = new Test(10, 20);
		Test t2 = new Test(10, 20);

		set.add(t1);
		set.add(t2);
		
		System.out.println(set);


	}

}
