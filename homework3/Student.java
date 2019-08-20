package homework3;

import java.util.Scanner;

public class Student {
	 Scanner scanner = new Scanner(System.in);
	public void getArithmeticCalculator() {
		 System.out.println("첫번째 수를 입력해 주세요.");
		 int one = scanner.nextInt();
		 System.out.println("두번째 수를 입력해 주세요.");
		 int two = scanner.nextInt();
		 int val1, val2 = 0;
		 System.out.println("연산 종류를 선택해 주세요. +, -, /, *");
		 String calc = scanner.next();
		 
		 switch(calc) {
		 case "+" :
			 val1 = one + two;
			 break;
		 case "-" :
			 val1 = one - two;
			 break;
		 case "*" :
			 val1 = one * two;
			 break;
		 case "/" :
			 val1 = one / two;
			 val2 = one % two;
			 break;
			 default : System.out.println("잘못 입력 하셨습니다.");
			 return;
		 }
		 
		 if(calc.equals("/")) {
			 System.out.printf("%s/%s=%s[%s]",one,two,val1,val2);
		 }else {
			 System.out.printf("%s%d%s=%s",one,calc,two,val1);
		 }
	}
	
	public void getBMI() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력해주세요.");
		String name = scanner.next();
		System.out.println("몸무게를 입력해 주세요.");
		double weight = scanner.nextInt();
		System.out.println("키를 입력해 주세요.");
		double height = scanner.nextInt();
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
		System.out.printf(name + "님은 %s입니다.", result);
		
	}
	public void getHowMuch() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
		System.out.println("얼마에요?");
		int price = scanner.nextInt();
		System.out.println(price + "원 입니다.\n몇개 드릴까요?");
		int num = scanner.nextInt();
		System.out.println(num + "개 주세요.");
		int money = price*num;
		System.out.println("총 금액은 " + money + "원 입니다.");
		int discount =money - money/10;
		System.out.println("비싸요. 10%만 깎아주세요.");
		System.out.println("그럼 " + discount + "원만 주세요.");
	  }
	}
	public void getJoin() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("아이디를 입력해 주세요.");
		String id = scanner.next();
		System.out.println("비밀번호를 입력해 주세요.");
		String pass = scanner.next();
		System.out.println("이름을 입력해 주세요.");
		String name = scanner.next();
		System.out.println("생년월일을 입력해 주세요. 예 ) 1xxx-0x-xx");
		String birth = scanner.next();
		System.out.println("키를 입력해 주세요. 예 ) 1xx.x");
		double height = scanner.nextDouble();
		System.out.println("몸무게를 입력해 주세요. 예 ) xx.x");
		double weight = scanner.nextDouble();
		System.out.println("혈액형을 입력해 주세요.");
		String blood = scanner.next();
		int birth2 = Integer.parseInt(birth.substring(1,4));
		String adult = "";
		
		if(birth2>=2000) {
			adult = "미성년자";
		}else { adult = "성인";}
		
		System.out.printf("아이디 : %s\n" + 
				"비밀번호 : %s\n" + 
				"이름 : %s\n" + 
				"생년월일 :  %s\n" + 
				"성인여부 : %s\n" + 
				"키 : %.1f\n" + 
				"몸무게(소수점 첫째자리까지) : %.1f\n" + 
				"혈액형 : %s형", id,pass,name,birth,adult,height,weight,blood);


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
			name = "평년";
		}
		System.out.println(name);
		}

	
	public void getMonthEndDay() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력해 주세요.");
		int month = scanner.nextInt();
		int days = 0;
		switch(month){
		case 1 : days = 31; break;
		case 2 : days = 29; break;
		case 3 : days = 31; break;
		case 4 : days = 30; break;
		case 5 : days = 31; break;
		case 6 : days = 30; break;
		case 7 : days = 31; break;
		case 8 : days = 31; break;
		case 9 : days = 30; break;
		case 10 : days = 31; break;
		case 11 : days = 30; break;
		case 12 : days = 31; break;
		
		}
		System.out.printf("%d월은 %d일 까지 입니다.",month,days);
	}
	public void getRanking() {
		Scanner scanner = new Scanner(System.in);
		int[] rec = new int[3];
		double[] sec = new double[3];
		String[] play = new String[] {"A","B","C"};
		
		for(int i = 0; i < 3; i++) {
			rec[i] = 1;
		}
		
		System.out.println("기록을 입력해 주세요.");
		for(int i = 0; i < 3; i++) {
		System.out.printf("%s선수의 기록",play[i]);
		sec[i] = scanner.nextDouble();
		}
		
		for(int i =0; i < 3; i++) {
			for(int j=0; j < 3; j++) {
				if(sec[i]>sec[j]) {
					rec[i] = rec[i]+1;
					
				}
			}
		}
			for(int i = 0; i < 3; i++) {
				System.out.printf("%d등 : %s 선수기록 (%.1f초)\n",rec[i],play[i],sec[i]);
			}
	}
	public void getReportCard() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력해 주세요.");
		String name = scanner.next();
		System.out.println("국어 점수를 입력해 주세요.");
		int kor = scanner.nextInt();
		System.out.println("영어 점수를 입력해 주세요.");
		int eng = scanner.nextInt();
		System.out.println("수학 점수를 입력해 주세요.");
		int math = scanner.nextInt();
		int total = kor + eng + math;
		int aver = (kor + eng + math)/3;
		String pass = "";
		
		if(aver >= 90) {
			pass = "장학생";
		}else if(aver >=70){
			pass = "합격";
		}else {
			pass = "불합격";
		}

		System.out.printf("학생           국어        영어        수학        총점        평균        합격여부\n"
				+ " =======================================================\n"
				+ " %s          %d           %d           %d           %d           %d              (%s)",name,kor,eng,math,total,aver,pass);
	}
	public void getScoreCalc() {
		Scanner scanner = new Scanner(System.in);
		
		int total=0;
		String val = "";
		String eval = "";

		while(true) {
			System.out.println("더하시려는 숫자를 입력하세요(종료는 -1)");
			int num = scanner.nextInt();
			if(num>=0) {
				if(val == "") {
					val = String.valueOf(num);
					eval += num;
					total += num;
				}else {
					val = String.valueOf(num);
					eval += "+" + num;
					total += num;
				}
				
			}else if(num == -1) {
				System.out.println(eval + "=" + total);
				break;
			}
		}

		
		

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
