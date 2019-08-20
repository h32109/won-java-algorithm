package study2;

import java.util.Scanner;

public class UserSequence {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("시작값을 입력해 주세요.");
		int start = scan.nextInt();
		System.out.println("종료값을 입력해 주세요.");
		int end = scan.nextInt();
		int eval = 0;
		String val = "";
		
		for(int i = start ; i<end;i++) {
			if(i%2 ==1&&i<(end-1)) {
				val += i + "+";
				eval += i;
				
			}else if(i%2 ==1&&(end-1)<=end){
				val += i + "=1";
				eval += i;
			}
		}
		System.out.println(val+eval);
	}

}
