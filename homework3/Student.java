package homework3;

public class Student {
	
	public String getTimeCalc(int sec) {
		int h, m, s = 0;
		h = sec/3600;
		m = sec%3600/60;
		s = sec%3600%60;
		String result = String.format("%d시 %d분 %초 입니다.", h,m,s); 
		return result;
		
	}

	public String getBMI(double weight, double height,String name) {
		String val = "";
		double bmi = weight / ((height*0.01)*(height*0.01));
		if(bmi>30.0) {
			val = "고도비만";
		}else if(bmi>25.0) {
			val = "비만";
		}else if(bmi>23.0) {
			val = "과체중";
		}else {
			val = "정상";
		}
		String result = String.format("%s님은 %s입니다.", name,val);
		return result; 
	}
	
	public String getLeapYear(int year) {
		String result = "";
		String name = "";
		if(year%4==0) {
			name = "윤년";
			if(year%100==0) {
				name = "평년";
				if(year%400==0) {
					name = "윤년";
				}
			}
		}else {
			name = "평년";
		}
		result = String.format(name);
		return result;
	}
}
