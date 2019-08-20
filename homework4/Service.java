package homework4;

import java.util.Scanner;

public class Service {
	
	public String getReportCard(Member member) {
		String result = "";
		String pass = "";
		String name = member.getName();
		int kor = member.getKor();
		int eng = member.getEng();
		int math = member.getMath();
		int total = kor + eng + math;
		int aver = (kor + eng + math)/3;
		
		if(aver >= 90) {
			pass = "장학생";
		}else if(aver >=70){
			pass = "합격";
		}else {
			pass = "불합격";
		}

		result = String.format("학생           국어        영어        수학        총점        평균        합격여부\n"
				+ " =======================================================\n"
				+ " %s          %d           %d           %d           %d           %d              (%s)",name,kor,eng,math,total,aver,pass);
		return result;
	}

	public String getTax(Member member) {
		String result = "";
		String name = member.getName();
		int salary = member.getSalary();
		double tax = salary*0.097;
		
		result = String.format("연봉 %d만원을 받으시는 %s님께서 납부할 세금은 %.0f만원입니다.", salary, name, tax);
		return result;
				
	}
	
	public String getBmi(Member member) {
		String result = "";
		String name = member.getName();
		double weight = member.getWeight();
		double height = member.getHeight();
		double bmi = weight / ((height*0.01)*(height*0.01));
		if(bmi>30.0) {
			result = "고도비만";
		}else if(bmi>25.0) {
			result = "비만";
		}else if(bmi>23.0) {
			result = "과체중";
		}else if(bmi>18.5){
			result = "정상";
		}else {
			result = "저체중";
		}
		result = String.format("%s님은 %s입니다.", name,result);
		return result;
	}
	
}
