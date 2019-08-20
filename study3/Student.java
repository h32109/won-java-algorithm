package study3;

import java.util.Scanner;

public class Student {

	public void getBMI() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력해주세요.");
		String name = scanner.next();
		System.out.println("몸무게를 입력해 주세요.");
		int weight = scanner.nextInt();
		System.out.println("키를 입력해 주세요.");
		int height = scanner.nextInt();
		double bmi = weight / ((height*0.01)*(height*0.01));
		if(bmi>30.0) {
			System.out.println(name + "님은 고도비만입니다.");
		}else if(bmi>25.0) {
			System.out.println(name + "님은 비만입니다.");
		}else if(bmi>23.0) {
			System.out.println(name + "님은 과체중입니다.");
		}else {
			System.out.println(name + "님은 정상입니다.");
		}
	}
	public void getLeapYear() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("연도를 입력해 주세요.");
		int year = scanner.nextInt();
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
			System.out.println("평년");
		}
		System.out.println(name);
	}
	public void getTax() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력해 주세요.");
		String name = scanner.next();
		System.out.println("연봉을 입력해 주세요.");
		int money = scanner.nextInt();
		double tax1 = money*0.097;
		int tax2 = (int) tax1; // double을 int로 바꾸는 방법! (인터넷 검색)
		
		
		System.out.printf("연봉 %d만원을 받으시는 %s님께서 납부할 세금은 %s만원입니다.", money, name, tax2);
		
				

	}
	public void getTimeCalc() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("초를 입력해 주세요.");
		int sec = scanner.nextInt();
		int h, m, s = 0;
		h = sec/3600;
		m = sec%3600/60;
		s = sec%3600%60;
		System.out.printf("%d시%d분%d초",h,m,s);
		
	}
	}


