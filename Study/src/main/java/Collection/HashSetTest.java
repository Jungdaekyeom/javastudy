package Collection;

import java.util.HashSet;
import java.util.Set;

import Array.ArrayStudy;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<ArrayStudy> set = new HashSet<ArrayStudy>();
		
		ArrayStudy t1 = new ArrayStudy(10, 20);
		ArrayStudy t2 = new ArrayStudy(10, 20);

		set.add(t1);
		set.add(t2);
		
		System.out.println(set);


	}

}
