package study3;

import java.util.Scanner;
import study3.Student;

public class Engine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		int flag = 0;
		while(true) {
			System.out.println("메뉴 :  0.종료 1.getLeapYear 2.TimeCalc 3.Tax 4.BMI");
			flag = scanner.nextInt();
			switch(flag) {
			case 0 : System.out.println("종료");return;

			case 1 : System.out.println("getLeapYear");
			student.getLeapYear();
			break;
			case 2 : System.out.println("TimeCalc");
			student.getTimeCalc();
			break;
			case 3 : System.out.println("Tax");
			student.getTax();
			break;
			case 4 : System.out.println("BMI");
			student.getBMI();
			break;

			
				
			}
		}
	}

}
