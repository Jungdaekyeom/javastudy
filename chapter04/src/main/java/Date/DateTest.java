package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date now = new Date();
		System.out.println(now);

		printDate01(now);

		printDate02(now);
	}

	public static void printDate01(Date d) {
		// 2021-09-13 16:06:30
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String date = sdf.format(d);
		System.out.println(date);
	}

	public static void printDate02(Date d) {
		// 년도(+1900)
		int year = d.getYear();

		// 연도(0~11, +1 필요)
		int month = d.getMonth();

		// 일
		int date = d.getDate();

		// 시간
		int hours = d.getHours();

		// 분
		int minutes = d.getMinutes();

		// 초
		int seconds = d.getSeconds();

		System.out.println(year);

		System.out.println((year + 1900) + "년-" +

				(month + 1) + "월-" +

				(date) + "일-" +

				(hours) + "시-" +

				(minutes) + "분-" +

				(seconds) + "초");

	}

}
