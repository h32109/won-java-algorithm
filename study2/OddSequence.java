package study2;

public class OddSequence {

	public static void main(String[] args) {
		// 1+3+5+7+9 = 25
		String eval = "";
		for(int i=1;i<=10;i++) {
			eval += (i%2==1) ? i + "+" : "";
		}
		System.out.println(eval);
	}

}
