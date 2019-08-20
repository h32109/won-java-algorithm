package study3;

import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		while(true) {
			System.out.println("0.종료 1.BMI");
			switch(scanner.nextInt()) {
			case 0 : System.out.println("종료");
			return;
			
			case 1 : System.out.println("BMI");
			System.out.println("이름을 입력해주세요.");
			String name = scanner.next();
			System.out.println("몸무게를 입력해 주세요.");
			double weight = scanner.nextDouble();
			System.out.println("키를 입력해 주세요.");
			double height = scanner.nextDouble();
			String result = student.getBMI(weight, height, name);
			System.out.println(result);
			break;
			
			
			
			}
		}
	}

}



