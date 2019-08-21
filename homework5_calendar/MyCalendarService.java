package homework5_calendar;


public class MyCalendarService {
	public String getEndDay(MyCalendar calendar) {
		String endDay = "";
		int month = calendar.getMonth();		
		int days = 0;
		switch(month){
		case 1 : days = 31; break;
		case 2 : days = 29; break;
		case 3 : days = 31; break;
		case 4 : days = 30; break;
		case 5 : days = 31; break;
		case 6 : days = 30; break;
		case 7 : days = 31; break;
		case 8 : days = 31; break;
		case 9 : days = 30; break;
		case 10 : days = 31; break;
		case 11 : days = 30; break;
		case 12 : days = 31; break;}
		return String.format("%d월달은 %d일 입니다.", month,days);
	}
	public String isLeapYear(MyCalendar calendar) {
		int year = calendar.getYear();
		String name = "";
		if(year%4==0) {
			name = "윤년";
			if(year%100==0) {
				name = "평년";
				if(year%400==0) {
					name = "윤년";
				}
			}
		}
		return String.format("%d년은 %s입니다.",year,name);
	}
}
