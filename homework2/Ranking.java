package homework2;

import java.util.Scanner;

public class Ranking {

	public static void main(String[] args) {
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
		

	}

