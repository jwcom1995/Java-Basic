package silsub4.run;

import silsub4.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Student s = new Student();
		
		s.setGrade(3);
		s.setClassroom(4);
		s.setName("고구마");
		s.setHeight(177.7);
		s.setGender('M');
		
		System.out.println(s.information());
	}

}
