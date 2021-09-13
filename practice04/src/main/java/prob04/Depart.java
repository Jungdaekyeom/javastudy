package prob04;

public class Depart extends Employee {

	private String department;
	
	// 생성자
	public Depart(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
		// TODO Auto-generated constructor stub
	}
	
	public void getInformation() {
		System.out.println("이름 : " + getName() + "	연봉 : " + getSalary() + "   부서 : " + department);
	}

}
