package String;

public class StringTest03 {

	public static void main(String[] args) {
		String s1 = "Hello" + "World" + "Java " + 1.8;
		String s2 = new StringBuffer("Hello ").append("World").append("Java ").append("1.8").toString();

		System.out.println(s1);
		System.out.println(s2);

//		String s3 = "";
//		for(int i=0; i<100000000; i++) {
//			//s3 = s3 + i;
//			//s3 = new StringBuffer(s3).append(i);
//		}

//		StringBuffer sb2 = new StringBuffer("");
//		for(int i=0; i<100000000; i++) {
//			sb2.append(i);
//		}

		// String method들...
		String s4 = "aBcABCabcAbc";
		System.out.println(s4.length());
		System.out.println(s4.charAt(2));
		System.out.println(s4.indexOf("B", 1)); // 1번째에 있으므로 1
		System.out.println(s4.indexOf("B", 4)); // 4번째에 있으므로 4
		System.out.println(s4.indexOf("abc"));
		System.out.println(s4.indexOf("abc", 6)); // 있으므로 6에 나옴
		System.out.println(s4.indexOf("abc", 7)); // 없으므로 -1
		System.out.println(s4.lastIndexOf("B"));

		System.out.println(s4.substring(3)); // 3번부터 끝까지
		System.out.println(s4.substring(3, 5)); // 3번부터 5번 앞까지.(3~4)

		String s5 = "     ab     cd     ";
		String s6 = "efg,hij,klm,nop,qrs";

		String s7 = s5.concat(s6);

		System.out.println(s5);
		// trim : 뒤에 띄어쓰기가 사라짐
		System.out.println("----" + s5.trim() + "----");
		// replace : 대체(파이썬과 동일)
		System.out.println("----" + s5.replace(" ", "") + "----");
		System.out.println("=================================");

		String[] tokens = s6.split(",");
		System.out.println("토큰배열로 쪼갬 : " + tokens[0]);
		for (String s : tokens) {
			System.out.println(s);
		}

		System.out.println("=================================");
		System.out.println("없는 공백으로 쪼개봄");
		String[] tokens2 = s6.split(" ");

		for (String s : tokens2) {
			System.out.println(s);
		}

		System.out.println("쪼갤 대상이 없어 한개를 한개로 쪼갬");

	}
}
