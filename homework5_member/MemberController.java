package homework5_member;

import javax.swing.JOptionPane;

public class MemberController {

	public static void main(String[] args) {
			Member member = null;
			MemberService service = new MemberService();
			
			while(true) {				
				switch(JOptionPane.showInputDialog("0.종료   1. 회원가입   2.정보보기   3.BMI")) {
				
				case "0" : 
					 return;
				
				case "1" : 
					member = new Member();
					member.setId(JOptionPane.showInputDialog("회원가입\n아이디를 입력해 주세요."));
					member.setPw(JOptionPane.showInputDialog("비밀번호를 입력해 주세요."));
					member.setName(JOptionPane.showInputDialog("이름을 입력해 주세요."));
					member.setSsn(JOptionPane.showInputDialog("주민번호를 입력해 주세요."));
					member.setHeight(Double.parseDouble(JOptionPane.showInputDialog("키를 입력해 주세요.")));
					member.setWeight(Double.parseDouble(JOptionPane.showInputDialog("몸무게를 입력해 주세요.")));
					member.setBlood(JOptionPane.showInputDialog("혈액형을 입력해 주세요."));
					JOptionPane.showMessageDialog(null, "회원가입 완료");
					break;
				
				case "2" : 
					JOptionPane.showMessageDialog(null,member.toString());
					break;
					
				case "3" :
					
					JOptionPane.showMessageDialog(null, service.getBmi(member));
					break;
					
			}
		}
	}
}

