package silsub4.model.vo;

public class Student {
	private static int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	public Student() {}
	
	public void setGrade(int grade) {
		this.grade=grade;
	}
	public void setClassroom(int classroom) {
		this.classroom=classroom;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	
	public int getGrade() {
		return this.grade;
	}
	public int getClassroom() {
		return this.classroom;
	}
	public String getName() {
		return this.name;
	}
	public double getHeight() {
		return this.height;
	}
	public char getGender() {
		return this.gender;
	}
	
	public String information() {
		String info = "학년 : "+this.grade+"학년, 반 : "+this.classroom+"반, 이름 : "+this.name+", 키 : "+this.height+"cm, 성별 : "+this.gender;
		return info;
	}
}
