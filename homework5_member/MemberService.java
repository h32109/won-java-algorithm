package homework5_member;

public class MemberService {

	public String getBmi(Member member) {
		String result = "";
		String val = "";
		String name = member.getName();
		double weight = member.getWeight();
		double height = member.getHeight();
		double bmi = weight / ((height*0.01)*(height*0.01));
		if(bmi>30.0) {
			val = "고도비만";
		}else if(bmi>25.0) {
			val = "비만";
		}else if(bmi>23.0) {
			val = "과체중";
		}else if(bmi>18.5){
			val = "정상";
		}else {
			val = "저체중";
		}
		result = String.format("%s님은 %s입니다.", name,val);
		return result;
	}
	
}
