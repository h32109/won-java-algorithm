package homework3;

import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		while(true) {
			System.out.println("0.종료   1.Timecalc     2.BMI     3.LeapYear");
			switch(scanner.nextInt()) {
			case 0 : System.out.println("종료");return;
			
			case 1 : System.out.println("Timecalc");
			System.out.println("초를 입력해 주세요.");
			int sec = scanner.nextInt();
			String result = student.getTimeCalc(sec);
			System.out.println(result);
			
			case 2 : System.out.println("BMI");
			System.out.println("이름을 입력해주세요.");
			String name = scanner.next();
			System.out.println("몸무게를 입력해 주세요.");
			double weight = scanner.nextDouble();
			System.out.println("키를 입력해 주세요.");
			double height = scanner.nextDouble();
			result = student.getBMI(weight, height, name);
			System.out.println(result);
			
			case 3 : System.out.println("LeapYear");
			System.out.println("연도를 입력해 주세요.");
			int year = scanner.nextInt();
			result = student.getLeapYear(year);
			System.out.println(result);
			
			case 4 : System.out.println();
			
			
			}
		}
		
	}

}
