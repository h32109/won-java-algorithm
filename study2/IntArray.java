package study2;

import java.util.Scanner;

public class IntArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] scores;
		scores = new int[5];
		String[] subjects = {"국어", "영어", "수학", "과학", "사회"};
		
		for(int i = 0 ; i < subjects.length ; i++) {
			System.out.printf("%s점수를 입력하세요. \n", subjects[i]);
			scores[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < scores.length ; i++) {
			System.out.printf("%s점수 %d \n", subjects[i], scores[i]);
		}
	}

}
