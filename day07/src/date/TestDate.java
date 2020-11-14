package date;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class TestDate {
	
	
	
	
	public static void dateFormatIntroduce() {
		
		DateFormat df= DateFormat.getDateTimeInstance();
		String str=df.format(new Date());
		System.out.println(str);
		DateFormat df1= DateFormat.getDateInstance(DateFormat.FULL,Locale.JAPAN);
		System.out.println(df1.format(new Date()));
	}

	public static void main(String[] args) {
		// 获得时间
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getTime());

		long time = 123123123123L;
		date.setTime(time);
		System.out.println(date);

		Date currentTime=new Date();
		System.out.println(date.before(currentTime));
		System.out.println(date.after(currentTime));
	
		dateFormatIntroduce();
	}

}
