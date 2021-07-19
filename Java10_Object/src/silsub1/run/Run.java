package silsub1.run;

import silsub1.model.vo.Member;

public class Run {
	public static void main(String[] args) {
		Member a = new Member();
		
		a.setAge(15);
		a.setMemberId("aID");
		a.setMemberName("aName");
		a.setMemberPwd("aPwd");
		a.setGender('M');
		a.setEmail("A@google.com");
		a.setPhone("010-111-151");
		
		System.out.println(a.getMemberId()+", "+a.getMemberName()+", "+a.getMemberPwd()+", "+a.getAge()+", "+a.getEmail()+", "+a.getGender()+", "+a.getPhone());
	}
}
