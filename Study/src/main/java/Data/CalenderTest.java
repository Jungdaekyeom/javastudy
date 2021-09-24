package Data;

import java.util.*;

public class CalenderTest {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();

		cal.set(Calendar.YEAR, 2021);
		cal.set(Calendar.MONTH, 11);
		cal.set(Calendar.DATE, 25);
		System.out.println(cal.get(Calendar.YEAR));

	}
}
