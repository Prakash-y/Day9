package Day9;

public class StudentMain {

	public static void main(String[] args) {
		
	Student s = (name, rollno) ->{
		System.out.println("Name : "+name);
		System.out.println("Roll Number : "+rollno);
		
	};
	s.display("Prakash", 18);
}
}