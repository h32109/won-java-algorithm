package study3;


public class Student {
	
	public String getBMI(double weight, double height, String name) {

		double bmi = weight / ((height*0.01)*(height*0.01));
		String result = "";
		if(bmi>30.0) {
			result = "고도비만";
		}else if(bmi>25.0) {
			result = "비만";
		}else if(bmi>23.0) {
			result = "과체중";
		}else {
			result = "정상";
		}
		return String.format("%s 님은 %s입니다.", name,result);
	
	}
}

