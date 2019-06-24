package pack2;

public class employeedetails {

	String name;
	public employeedetails(String name2, String desg2, float salary2) {
		// TODO Auto-generated constructor stub
		name = name2;
		desg= desg2;
		salary=salary2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public float getNewsalary() {
		return newsalary;
	}
	public void setNewsalary(float newsalary) {
		this.newsalary = newsalary;
	}
	String desg;
    float salary;
    float newsalary;
 }
