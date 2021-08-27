package homework2;

public class Main {

	public static void main(String[] args) {
		//student
		Student student1 =new Student();
		student1.setName("furkan");
		student1.setAge(12);
		student1.setSchoolNumber("443");
		
		Student student2 =new Student();
		student2.setName("eren");
		student2.setAge(15);
		student2.setSchoolNumber("444");
		
		
		StudentManager studentManager=new StudentManager();
	
		Student[] students= {student1,student2};

		for (Student student : students) {
			studentManager.showStudentsClasS(student.getClasS());
		}
		
		//instructor
		Instructor instructor1=new Instructor();
		instructor1.setName("sema");
		instructor1.setAge(35);
		instructor1.setSubject("matematik");
		
		Instructor instructor2=new Instructor();
		instructor2.setName("hüseyin");
		instructor2.setAge(40);
		instructor2.setSubject("türkçe");
		
		
		UserManager[] managers=new UserManager[] {
			new StudentManager(),new InstructorManager()	
		};
		
		User[] users=new User[] {
			student1,student2,instructor1,instructor2	
		};
		
		for(User user:users)
		for (UserManager userManager : managers) {
			
			
			
			
			userManager.callSomeone(user.getName());
		}
		
		
		
		
		
		
		
		
	}

}

