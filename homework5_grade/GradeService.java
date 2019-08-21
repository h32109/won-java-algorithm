package homework5_grade;

public class GradeService {
	public String getTotal(Grade grade) {
		int a = grade.getKor();
		int b = grade.getEng();
		int c = grade.getMath();
		String total = String.valueOf(a+b+c);
		return total;
	}
	public String getAvg(Grade grade) {
		int a = grade.getKor();
		int b = grade.getEng();
		int c = grade.getMath();
		String avg = String.valueOf((a+b+c)/3);
		return avg;
	}
}
