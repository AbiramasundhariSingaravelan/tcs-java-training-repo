import java.util.Scanner;

class StudentDemo
{
	int a[]=new int[5];
	//a[]={1,2,3,4,5}
	public  void readData()
	{
		System.out.println("Enter the array elements");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<=5;i++)
		{
			a[i]=s.nextInt();
		}
	}
	public void printData()
	{
		for(int i=0;i<=5;i++)
		{
			//a[0] = 1
			System.out.println("A[ "+i +" ]  ="+a[i]);
		}
	}
}
public class ArraysEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDemo sd =new StudentDemo();
		sd.readData();
		sd.printData();
	}

}
