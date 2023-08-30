
class Employee
{
	int eno;
	String name;
	String design;
	float salary;
	public void getDetails(int eno,String name)
	{
		System.out.println("Employee Number: "+eno);
		System.out.println("Employee Name: "+name);
	}
	public void getDetails(String design,float salary)
	{
		System.out.println("Employee Designation: "+design);
		System.out.println("Employee Salary: "+salary);
	}
	public int getDetails(String design,float salary)
	{
		
	}
}

public class PolyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.getDetails(100, "Arthi");
		e.getDetails("Tester", 56789.76f);
	}

}
