package homework5_calendar;

public class MyCalendar {
	private int month, year;
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public String toString() {
		return String.format("입력하신 연도 :%d \n입력하신 달 :%d", year,month);
	}

}
