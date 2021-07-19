package silsub1.model.vo;

public class Member {
	
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	public Member() {}
	
	public void setMemberId(String memberId) {
		this.memberId=memberId;
	}
	public void setMemberPwd(String memberPwd) {
		this.memberPwd=memberPwd;
	}
	public void setMemberName(String memberName) {
		this.memberName=memberName;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	public void setPhone(String phone) {
		this.phone=phone;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	
	public String getMemberId() {
		return this.memberId;
	}
	public String getMemberPwd() {
		return this.memberPwd;
	}
	public String getMemberName() {
		return this.memberName;
	}
	public int getAge() {
		return this.age;
	}
	public char getGender() {
		return this.gender;
	}
	public String getPhone() {
		return this.phone;
	}
	public String getEmail() {
		return this.email;
	}
}
