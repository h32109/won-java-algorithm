package homework5_grade;

import javax.swing.JOptionPane;

public class GradeController {

	public static void main(String[] args) {
		GradeService service = new GradeService();
		Grade grade = null;
		
		while(true) {
			switch(JOptionPane.showInputDialog("0. 종료  1. 숫자입력  2. 숫자보기 3. 총합  4. 평균")) {
			
			case "0" : return;
			
			case "1" :
				grade = new Grade();
				grade.setKor(Integer.parseInt(JOptionPane.showInputDialog("국어 점수를 입력해 주세요.")));
				grade.setEng(Integer.parseInt(JOptionPane.showInputDialog("영어 점수를 입력해 주세요.")));
				grade.setMath(Integer.parseInt(JOptionPane.showInputDialog("수학 점수를 입력해 주세요.")));
				break;
				
			case "2" :
				JOptionPane.showMessageDialog(null, grade.toString());
				break;
				
			case "3" :
				JOptionPane.showMessageDialog(null, service.getTotal(grade));
				break;
			case "4" :
				JOptionPane.showMessageDialog(null, service.getAvg(grade));
				break;
				
				
			}
		}
		
	}

}
