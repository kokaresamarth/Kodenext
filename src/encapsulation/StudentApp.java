package encapsulation;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.setData("samu", 21, "male");
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.getGender());
	}

}
