package HashCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class ObjectTest01 {

	public static void main(String[] args) {
		Point p = new Point(10, 20);
		
		// Class klass = p.getClass();
		System.out.println(p.getClass());
		System.out.println(p.hashCode());
		System.out.println(p.toString());
		System.out.println(p);
	}

}
