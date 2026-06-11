class Employee{
	private String empID,name;
	private double salary;
	
		public Employee(String empID,String name,double salary){
		this.empID=empID;
		this.name=name;
		this.salary=salary;
	}
	public String getEmpID(){
		return this.empID;
	}
	public String getName(){
		return this.name;
	}
	public double getSalary(){
		return this.salary;
	}
	public void setEmpId(String empID){
		this.empID=empID;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setSalary(double salary){
		this.salary=salary;
	}
	public String toString(){
		return "Employee :[Name: "+getName()+" ,Employee Id: "+getEmpID()+" ,Salary: "+getSalary()+  "]";
	}
	
	
}
public class Q1{
	public static void main(String [] args){
		Employee emp1=new Employee("E101","John",50000);		
		Employee emp2=new Employee("E208","Alice",70000);
		
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		
		emp1.setSalary(52000);
		System.out.println(emp1.getSalary());

	}
}