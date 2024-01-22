package api.util;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
	
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; //���� 1���� 0���� 11�� 12������
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK); //�Ͽ����� ���� 1
		
		String strWeek = null;
		
		switch(week) {
		case Calendar.MONDAY: strWeek = "��"; break;
		case Calendar.TUESDAY: strWeek = "ȭ"; break;
		case Calendar.WEDNESDAY: strWeek = "��"; break;
		case Calendar.THURSDAY: strWeek = "��"; break;
		case Calendar.FRIDAY: strWeek = "��"; break;
		case Calendar.SATURDAY: strWeek = "��"; break;
		case Calendar.SUNDAY: strWeek = "��"; break;
		default : strWeek = "��"; break;
		}
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println("������ "+year+"�� "+month+"�� "+day+"���Դϴ�.");
		System.out.println(hour+"�� "+minute+"�� "+second+"�� "+strWeek+"����");
	}
}