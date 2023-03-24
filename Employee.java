import java.util.Scanner;
public class Employee {
	private int eNo;
	private String eName;
	private int eSalary;
	Employee(int eNo,String eName,int eSalary){
		this.eNo=eNo;
		this.eName=eName;
		this.eSalary=eSalary;
	}
	public String toString() {
		return "Employee No: "+eNo+"  Employee Name: "+eName+"  Employee Salary: "+eSalary;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int i;
		int eNo,eSalary;
		String eName;
		Scanner scan=new Scanner(System.in);
		Employee emp[]=new Employee[20];
		System.out.print("Enter the number of employees:");
		int n=scan.nextInt();
		for(i=0;i<n;i++) {
			System.out.print("Enter employee "+(i+1)+" number,name and salary: ");
			eNo=scan.nextInt();
			eName=scan.next();
			eSalary=scan.nextInt();
			emp[i]=new Employee(eNo,eName,eSalary);
		}
		System.out.print("Enter the employee number of employee to search: ");
		int s=scan.nextInt();
		for(i=0;i<n;i++) {
			if(emp[i].eNo==s) {
				System.out.println(emp[i]);
			}
		}
		
	}

}
