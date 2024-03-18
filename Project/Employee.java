package Project;

public class Employee extends Person{
	private int empId;
	private static int nextId;
	private static int empCount;
	private double salary;
	
	static {
		nextId = 0;
		empCount = 0;
		
	}
	public Employee(String name, double salary) {
		super(name);
		this.empId = ++nextId;
		this.salary = salary;
		empCount++;
	}
	public Employee(String name,String address, double salary) {
		super(name, address);
		this.empId = ++nextId;
		this.salary = salary;
		empCount++;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	
	
	public static int getNextId() {
		return nextId;
	}
	public static void setNextId(int nextId) {
		Employee.nextId = nextId;
	}
	
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public double calculateSalary() {
		return salary;
	}
	
	
	public static int getEmpCount() {
		return empCount;
	}
	
             //@Override
	protected void finalise()throws Throwable{
		empCount--;
		//System.out.println(this,empId + "has been deleted.....");
		System.out.println(this);
		System.out.println("Current employee count is : "+this.empCount);
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + "]";
	}
	
	
	
	

}
