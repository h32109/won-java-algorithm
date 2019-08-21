package homework5_calendar;

import javax.swing.JOptionPane;

public class MyCalendarController {

	public static void main(String[] args) {
		MyCalendar calendar = null;
		MyCalendarService calendarService = new MyCalendarService();
		
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료  1.날짜입력  2.날짜보기  3.윤년판단  4.일 수 보기")) {
			
			case "0" : 
				return;
			
			case "1" : 
				calendar = new MyCalendar();
				calendar.setMonth(Integer.parseInt(JOptionPane.showInputDialog("달을 입력해 주세요.")));
				calendar.setYear(Integer.parseInt(JOptionPane.showInputDialog("연도를 입력해 주세요.")));
				break;
				
			case "2" :
				JOptionPane.showMessageDialog(null, calendar.toString());
				break;
			case "3" :
				JOptionPane.showMessageDialog(null, calendarService.isLeapYear(calendar));
				break;
			case "4" :
				JOptionPane.showMessageDialog(null, calendarService.getEndDay(calendar));
				break;
			}
		}
	}
}

