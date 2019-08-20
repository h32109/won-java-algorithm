package study1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Month {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		String month = sdf.format(date);
		System.out.println(month);
		int eval = Integer.parseInt(month.substring(6,7));
		String val = "";
		
		switch(eval) {
			case 1 : val = "1월";
			break;
			case 2 : val = "2월";
			break;
			case 3 : val = "3월";
			break;
			case 4 : val = "4월";
			break;
			case 5 : val = "5월";
			break;
			case 6 : val = "6월";
			break;
			case 7 : val = "7월";
			break;
			case 8 : val = "8월";
			break;
			case 9 : val = "9월";
			break;
			case 10 : val = "10월";
			break;
			case 11 : val = "11월";
			break;
			case 12 : val = "12월";
			break;
			default : break;
			
		}
		System.out.println(val);
		
				
	}

}
