package entities;

public class Rent {
	private String student;
	private String email;
	
	public Rent(String student, String email) {
		this.student = student;
		this.email = email;
	}

	public String getStudent() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return student + ", " + email;
	}
	
	
	
}
