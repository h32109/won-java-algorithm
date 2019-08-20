 package homework2;

import java.util.Scanner;

/*프로그램을 하나 개발해야 합니다.
교수가 요청하기를 브라우저에서 사용할 계산기를 만들어 달랍니다.
복잡할 필요는 없고, 사칙연산 가능하고 나눗셈은
몫과 나머지값으로 출력하면 된답니다.
출력결과물은 예를 들어
5 + 5 = 10
2 - 7 = -5
이렇게 되고,
10 / 3 = 3 [1] 나눗셈은 이렇게 나오면 된답니다.
그러면 []값이 나머지인지는 교수가 이미 알고 있겠답니다.
*/

public class ArithmeticCalculator {

	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
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

}
