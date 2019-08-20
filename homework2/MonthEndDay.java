package homework2;

import java.util.Scanner;

/*To. 개발자님
월을 입력하면 해당 월이 몇일까지인지
알려주는 프로그램을 작성해 주세요.
단) 2월은 윤년을 따지지 않고 무조건 29일입니다.
출력문장 : "??월은 **일 까지 입니다."
*/

public class MonthEndDay {

	public static void main(String[] args) {
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
				
}

