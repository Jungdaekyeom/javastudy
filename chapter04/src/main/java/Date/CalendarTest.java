package Date;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal = Calendar.getInstance();

		cal.set(Calendar.YEAR, 2022);
		// cal.set(Calendar.YEAR, 2021); // 에러남.
		cal.set(Calendar.MONTH, 11); // 12월
		cal.set(Calendar.DATE, 25); // 25일
		printDate(cal);
		
		cal.set(2021, 8, 13);
		cal.add(Calendar.DATE, 100);
		printDate(cal);


	}

	public static void printDate(Calendar c) {
		final String[] DAYS = { "일", "월", "화", "수", "목", "금", "토" };

		int year = c.get(Calendar.YEAR);
		// 0~11 + 1
		int month = c.get(Calendar.MONTH);
		int date = c.get(Calendar.DATE);
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		int millisecond = c.get(Calendar.MILLISECOND);
		System.out.println((year) + "년-" + (month + 1) + "월-" + (date) + "일\n" + (hour) + "시:" + (minute) + "분:"
				+ (second) + "초:" + (millisecond) + "밀리초");

		System.out.println("=================================");

		// 0(日曜日)~ 7(土曜日)
		int day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(DAYS[day] + "요일");
	}

}
