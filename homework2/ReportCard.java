package homework2;

import java.util.Scanner;

/*
 * 
To. 개발자님
  성적표 프로그램 을 하나 개발해야 합니다.
 교수는 학생과 국어, 영어, 수학점수만 입력하면
 총점, 평균, 합격여부가 출력되는 프로그램 입니다.
 오더는 다음과 같이 화면에 출력하라고 합니다.
 
학생           국어        영어        수학        총점        평균        합격여부
 =======================================================
 홍길동     90       90      90     270      90       (장학생)

 합격여부는 다음과 같다고 합니다.
 평균이 90점 이상이면 장학생
 0점 이상 90점미만 이면 합격
 70미만이면 불합격이라고 하네요.
 단) 평균에서 소수점이하는 절삭입니다.
 */
public class ReportCard {

	public static void main(String[] args) {
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

}
