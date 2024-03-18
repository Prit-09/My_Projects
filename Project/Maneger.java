package Project;

public class Maneger extends Employee{
	
	public Maneger(String name,double salary) {
		super(name,salary);
		
	}
	
	public Maneger(String name,String address,double salary) {
		super(name,address,salary);
		
	}

	@Override
	public String toString() {
		return "Maneger [EmpId()=" + getEmpId() + ", Salary()=" + getSalary() + ", calculateSalary()="
				+ calculateSalary() + ", Name()=" + getName()+ ",Address()=" + getAddress() + "]";
	}
	
	
	


}
