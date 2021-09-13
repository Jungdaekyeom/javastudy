package Person;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		s1.setGrade(4);
		s1.setMajor("computer programming");

		// 두 개는 같음
		s1.setName("정대겸");
		// ((Person)s1).setName("정대겸");

		// s1.setName("정대겸");와 같은 형식

		Person p1 = s1; // upcasting(암시적, Implicity)
		p1.setName("정대겸");

		///////////////////////////////////////////////////////////////////////

		Student s2 = (Student) p1; // downcasting(명시적, explicity)
		s2.setMajor("전공");

		///////////////////////////////////////////////////////////////////////

	}

}
