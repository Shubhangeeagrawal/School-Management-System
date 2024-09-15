package packageFolder;

public class TeacherMS{
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;

	public TeacherMS(int id, String name, int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.salaryEarned = 0;
	}
	
	public void receiveSalary(int salary) {
		this.salaryEarned += salary;
		SchoolMS.updateTotalMoneySpent(salary);
	}

	public int getID(){
		return id;
	}

	public String getName(){
		return name;
	}

	public int getSalary(){
		return salary;
	}
	
	public void setSalary(int salary){
		this.salary=salary;
	}

	public int getSalaryEarned() {
		return salaryEarned;
	}
	
}