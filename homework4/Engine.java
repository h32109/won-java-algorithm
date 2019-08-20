package homework4;

import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Member member = null;
		Service service = new Service();
		
		
		while(true) {
			
			System.out.println("0. 종료     1. join     2. 정보보기     3. reportcard     4. tax     5. bmi ");
			
			switch(scanner.nextInt()) {
			
			case 0 : 
				System.out.println("종료"); return;
			
			case 1 : 
				System.out.println("회원가입");
				member = new Member();
				System.out.println("아이디를 입력해 주세요.");
				member.setId(scanner.next());
				System.out.println("비밀번호를 입력해 주세요.");
				member.setPw(scanner.next());
				System.out.println("이름을 입력해 주세요.");
				member.setName(scanner.next());
				System.out.println("주민번호를 입력해 주세요. 예 ) 9xxxxx-1xxxxxx");
				member.setSsn(scanner.next());
				System.out.println("키를 입력해 주세요. 예 ) 1xx.x");
				member.setHeight(scanner.nextDouble());
				System.out.println("몸무게를 입력해 주세요. 예 ) xx.x");
				member.setWeight(scanner.nextDouble());
				System.out.println("혈액형을 입력해 주세요.");
				member.setBlood(scanner.next());
				System.out.println("국어점수를 입력해 주세요.");
				member.setKor(scanner.nextInt());
				System.out.println("영어점수를 입력해 주세요.");
				member.setEng(scanner.nextInt());
				System.out.println("수학점수를 입력해 주세요.");
				member.setMath(scanner.nextInt());
				System.out.println("연봉을 입력해 주세요.");
				member.setSalary(scanner.nextInt());
				System.out.println("회원가입 완료.\n");
				break;
			
			case 2 : 
				System.out.println(member.toString());
				break;
				
			case 3 : 
				System.out.println("reportcard");
				System.out.println(service.getReportCard(member));
				break;
				
			case 4 :
				System.out.println("Tax");
				System.out.println(service.getTax(member));
				break;
				
			case 5 :
				System.out.println("bmi");
				System.out.println(service.getBmi(member));
				break;
				
			}

				
				
		}

	}

}
