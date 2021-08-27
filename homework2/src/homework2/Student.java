package homework2;

public class Student extends User{ 
	
	
	private String schoolNumber;
	
	public Student() {
		
	}
	
	
	//prefered clasS cuz class cannot be used for String 
	public String getSchoolNumber() {
		return schoolNumber;
	}
	public void setSchoolNumber(String schoolNumber) {
		this.schoolNumber = schoolNumber;
	}
	public int getClasS() {
		return  getAge()-8;
	}
		

}
