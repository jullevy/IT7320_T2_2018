package people;

public class Employee {

		public String getEmployeeid() {
		return employeeid;
	}
	public Employee(String employeeid, String firstName, String lastName, String email) {
			super();
			this.employeeid = employeeid;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
		}
	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
		private String employeeid;
		private String firstName;
		private String lastName;
		private String email;
}
