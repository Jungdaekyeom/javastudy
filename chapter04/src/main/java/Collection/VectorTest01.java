package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> v = new Vector<String>();
		
		v.addElement("둘리");
		v.addElement("마이콜");
		v.addElement("도우너");
		v.addElement("고길동");
		
		// 순회
		for(int i=0; i<v.size(); i++) {
			String s = v.elementAt(i);
			System.out.println(s);
		}
		
		System.out.println("====================");
		
		// 삭제
		v.removeElement(2);
		
		// 순화2
		Enumeration<String> e = v.elements();
		// e 안에 뭐가 더 있으면 while로 들어감
		while(e.hasMoreElements()) {
			String s = e.nextElement();
			System.out.println(s);
		}
		
		
		
		

	}

}
