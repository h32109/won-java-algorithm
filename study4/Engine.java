package study4;

import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Student student = new Student();
	String name = "";
	String result = "";
		while(true) {
			System.out.println("0.종료 1.BMI 2.이해못할문제");
			switch(scanner.nextInt()) {
			case 0 : System.out.println("종료");return;
			case 1 : System.out.println("BMI : 이름, 키, 몸무게 입력");
			name = scanner.next();
			double height = scanner.nextDouble();
			double weight = scanner.nextDouble();
			result = student.getBMI(name,height,weight);
			System.out.println(result);
			break;
			case 2 : 
				System.out.println("이름,주소,나이,은행잔고,신용도 입력");
				name = scanner.next();
				String adress = scanner.next();
				int age = scanner.nextInt();
				int money = scanner.nextInt();
				String grade = scanner.next();
				//이름,주소,나이,은행잔고,신용도
				// 결과가 무엇을 넣던간에 1억대출
				result = student.deachl(name, adress, age, money, grade);
				System.out.println(result);
				break;
			}
		}
	}

}
