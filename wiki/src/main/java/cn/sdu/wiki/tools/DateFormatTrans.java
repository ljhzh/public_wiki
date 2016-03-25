package cn.sdu.wiki.tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatTrans {
	
	public String TimeToString(Date date) {
		SimpleDateFormat time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return time.format(date);
	}
	
	public String DateToString(Date date) {
		SimpleDateFormat time=new SimpleDateFormat("yyyy-MM-dd");
		return time.format(date);
	}
	
	public String getCurrentTime() {
		Date date = new Date();
		SimpleDateFormat time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return time.format(date);
	}
	
	public String getCurrentDate() {
		Date date = new Date();
		SimpleDateFormat time=new SimpleDateFormat("yyyy-MM-dd");
		return time.format(date);
	}
	
	public Date StringToTime(String datetime) {
		SimpleDateFormat time=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			return time.parse(datetime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public Date StringToDate(String datetime) {
		SimpleDateFormat time=new SimpleDateFormat("yyyy-MM-dd");
		try {
			return time.parse(datetime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public Date getCurrentDating() {
		return StringToTime(getCurrentDate());
	}
	
	public Date getCurrentTiming() {
		return StringToDate(getCurrentDate());
	}

}
