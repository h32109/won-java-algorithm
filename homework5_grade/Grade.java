package homework5_grade;

public class Grade {
	private int kor, eng, math;
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public int getKor() {
		return this.kor;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public int getEng() {
		return this.eng;
	}
	
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getMath() {
		return this.math;
	}
	
	public String toString() {
		return String.format("영어 점수: %d \n국어 점수: %d \n수학 점수: %d", eng,kor,math);
	}

}
