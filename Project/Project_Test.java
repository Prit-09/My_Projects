package Project;

import java.util.ArrayList;

import java.util.Scanner;

public class Project_Test {
	private static Scanner sc = new Scanner(System.in);

	private static int printMenu() {

		System.out.println("1.Add new maneger");
		System.out.println("2.Add new HR");
		System.out.println("3.Display all employees");
		System.out.println("4.Update no of hires for HR");
		System.out.println("5.Update name of an employee");
		// System.out.println("6.Update salary of an employee");
		// System.out.println("7.Update address of an employee");

		System.out.println("0.Exit");
		System.out.println("\nEnter your choice::");

		int choice = sc.nextInt();
		return choice;
	}

public static void main(String[] args) { 
	
	      /*ArrayList<Employee> emp = new ArrayList<Employee>();
	      
	      emp.add(new Employee("priti",65987.45));
	      emp.add(new Employee("wdfdf",45567.45));
	      emp.add(new Employee("fghghj",67873.45));
	      emp.add(new Employee("fghgkiu",65962.45));
	      
	      System.gc();
	      System.runFinalization();
	      
	      System.out.println("Employee Count is : "+Employee.getEmpCount());
	      */
	
	
		
		int userChoice=0;
		Employee emp[]=new Employee[5];
		
		int counter=0;
		int empId=0,noOfHires=0;
		
		String name="";
		double salary=0,bonusPerHire=0;
		
		do {
			userChoice=printMenu();
			switch(userChoice) {
			case 1:
				//add new manager
				System.out.print("\n Enter the name of maneger::");
				name = sc.next();
				
				System.out.print("\n Enter the salary of maneger::");
				salary = sc.nextDouble();
				
				emp[counter++]=new Maneger(name,salary);
				break;
				
			case 2 :
				//add new HR
				System.out.print("\n Enter the name of HR::");
				name = sc.next();
				
				System.out.print("\n Enter the salary of HR::");
				salary = sc.nextDouble();
				
				System.out.print("\n Enter  bonus per hire of HR::");
				bonusPerHire = sc.nextDouble();
				
				
				emp[counter++]=new HR(name,salary,bonusPerHire);
				break;
				
			case 3 :
				//display all members
				for(int i=0;i<counter;i++)
				{
					System.out.println(emp[i]);
				}
				break;
				
			case 4 :
				System.out.println("\n Enter employee ID :");
				empId = sc.nextInt();
				
				for(int i=0;i<counter;i++)
				{
					if(empId == emp[i].getEmpId())
					{
						if(emp[i] instanceof HR)
						{
							HR h = (HR) emp[i];
							System.out.println("enter number of hires : ");
							noOfHires = sc.nextInt();
							
							h.setNoOfHires(noOfHires);
						}
						else
						{
							System.out.println("Error :: can not set number of hires for maneger object/employee");
							
						}
					}
				}
				break;
				
			 case 5 :
				System.out.println("\n Enter employee ID :");
				empId = sc.nextInt();
				 
				for(int i=0;i<counter;i++)
				{
					if(empId == emp[i].getEmpId())
					{
						System.out.println("\nEnter the name of employee : ");
						sc.next();
						
						emp[i].setName(name);
					}
				}
			    break;
			    
			    default:
			    	System.out.println("Error : Invalid choics. Try again....!!!!");
			    	
			    break;	
			
				
			}
		}
		
		while(userChoice>0);
				
	
	}
}


