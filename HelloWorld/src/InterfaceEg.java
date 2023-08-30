
interface Demo
{
	public void print();
}
interface Demo1
{
	public void print();
}
//Multiple Inheritance
class ViewDemo implements Demo, Demo1
{
	public void print()
	{
		System.out.println("View Demo Method");
	}
}
public class InterfaceEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new ViewDemo();
		d.print();//invoke print method of Demo Base Class
		ViewDemo vd=new ViewDemo();
		vd.print();
	}

}
