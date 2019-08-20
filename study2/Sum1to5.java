package study2;

public class Sum1to5 {

	public static void main(String[] args) {
		String eval = "";
		int sum = 0;
		for(int i=1;i<=10;i++) {
			eval += (i==10) ? i + "=" : i+"+";
			sum += i;
		}
		System.out.print(eval + sum);
	}

}
