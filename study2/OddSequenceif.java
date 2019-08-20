package study2;

public class OddSequenceif {

	public static void main(String[] args) {

		int val = 0;
		String eval = "";
		for(int i = 1; i <= 10; i++) {
			if(i%2==1) {
				if(i!=9) {
					eval += i + "+";
				}else {
					eval += i + "=";
				}
				val += i;
			}else {}
		}
		System.out.println(eval + val);
	}

}
