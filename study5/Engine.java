package study5;

import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Member member = null;
		Service service = new Service();
		while(true) {
			System.out.println("0.종료    1.회원가입    2.정보보기    3.비밀번호,주민번호    4.BMI측정");
			switch(scanner.nextInt()) {
			case 0 : System.out.println("종료"); return;
			case 1 : 
				member = new Member();
				System.out.println("아이디를 입력해 주세요.");
				member.setId(scanner.next());
				System.out.println("비밀번호를 입력해 주세요.");
				member.setPass(scanner.next());
				System.out.println("이름을 입력해 주세요.");
				member.setName(scanner.next());
				System.out.println("주민번호를 입력해 주세요. ");
				member.setSsn(scanner.next());
				System.out.println("키를 입력해 주세요. 예 ) 1xx.x");
				member.setHeight(scanner.nextDouble());
				System.out.println("몸무게를 입력해 주세요. 예 ) xx.x");
				member.setWeight(scanner.nextDouble());
				System.out.println("혈액형을 입력해 주세요.");
				member.setBlood(scanner.next());
				System.out.println("국어점수");
				member.setKor(scanner.nextInt());
				break;
				
			case 2 : 
				System.out.println(member.toString());
				break;
				
			case 3 : 
				System.out.println("이름을 입력해주세요.");
				String searchName = scanner.next();
				System.out.println("아이디를 입력해주세요.");
				String searchId = scanner.next();
				if(searchName.equals(member.getName()) &&
						searchId.equals(member.getId())) {
					System.out.printf("아이디 :  %s\n"
							+ "주민번호 : %s\n",member.getId(),member.getSsn());
				}else {
					System.out.println("정보를 잘못 입력하셨습니다./n");
				}
				
			 case 4 :
				 System.out.println("BMI측정");
				 
				 break;
			}
		}

	}

}
