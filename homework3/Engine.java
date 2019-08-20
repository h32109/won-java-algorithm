package homework3;

import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		
		while(true) {
			System.out.println("\n0. 종료   1.ArithmeticCalculator   2.BMI\n 3.Howmuch   4.join   5.LeapYear\n 6.MonthEndDay   7.Ranking   8.ReportCard\n 9.ScoreCalc   10.Tax   11.TimeCalc");
			switch(scanner.nextInt()) {
			case 0 :  System.out.println("종료"); return;
			case 1 :  System.out.println("1.ArithmetiecCalculator");
			student.getArithmeticCalculator();break;
			case 2 :  System.out.println("2.BMI");
			student.getBMI();break;
			case 3 :  System.out.println("3.Howmuch");
			student.getHowMuch();break;
			case 4 :  System.out.println("4.join");
			student.getJoin();break;
			case 5 :  System.out.println("5.LeapYear");
			student.getLeapYear();break;
			case 6 :  System.out.println("6.MonthEndDay");
			student.getMonthEndDay();break;
			case 7 :  System.out.println("7.Ranking");
			student.getRanking();break;
			case 8 :  System.out.println("8.ReportCard");
			student.getReportCard();break;
			case 9 :  System.out.println("9.ScoreCalc");
			student.getScoreCalc();break;
			case 10 :  System.out.println("10.Tax");
			student.getTax();break;
			case 11 :  System.out.println("11.TimeCalc");
			student.getTimeCalc();break;
			
			}
			
		}

	}

}
