package study2;

public class Sum1to10 {

	public static void main(String[] args) {
		String eval = "";
		for(int i=1;i<=10;i++) {
			if(i==10) {
				eval += i + "=";
			}else {
				eval += i + "+";
			}
		}
		System.out.print(eval);
	}

}
