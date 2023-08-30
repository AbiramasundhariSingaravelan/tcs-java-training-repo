import java.util.Scanner;

public class Encapsulation {

	private int rno;
	private String name;
	private String addr;
	private String dept;
	public int getRno()
	{
		return rno;
	}
	public void setRno(int rno)
	{
		this.rno=rno;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ClassName objName=new ClassName();
		Encapsulation e=new Encapsulation();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter rollNo");
		int rno=s.nextInt();
		System.out.println("Enter Name");
		String name=s.next();
		e.setRno(rno);
		e.setName(name);
		e.setAddr("Chennai");
		e.setDept("Testing");
		System.out.println("Roll Number: " +e.getRno());
		System.out.println("Name: " +e.getName());
		System.out.println("Address: " +e.getAddr());
		System.out.println("Department: " +e.getDept());
	}

}
