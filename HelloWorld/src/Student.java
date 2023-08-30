public class Student {

	String name;
	String dept;
	public Student()
	{
		System.out.println("Default Constructor");
	}
	public Student(String name)
	{
		this.name=name;
	}
	public Student(String dept,int dummy)
	{
		this.dept=dept;
	}
	public void printData()
	{
		System.out.println(name +" - student of "+dept+ " Department");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s=new Student("Arthi","CSE");
		s.printData();
	}

}
