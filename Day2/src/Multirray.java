import java.util.Scanner;

class Addition
{
	int r,c;
	int a[][]=new int[3][3];
	int b[][]=new int[3][3];
	int res[][]=new int[3][3];
	public void readMatrix()
	{
		Scanner s=new Scanner(System.in);
		/*System.out.println("Enter the number of rows: ");
		r=s.nextInt();
		System.out.println("Enter the number of columns: ");
		c=s.nextInt();*/
		System.out.println("Enter the matrix A:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Enter the matrix B:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				b[i][j]=s.nextInt();
			}
		}
	}
	public void calculateMatrix()
	{
		 for(int i=0;i<3;i++)
		 {
			 for(int j=0;j<3;j++)
			 {
				 res[i][j]=a[i][j]+b[i][j];
			 }
		 }
		 System.out.println("The Resultant Matrix");
		 for(int i=0;i<3;i++)
		 {
			 for(int j=0;j<3;j++)
			 {
				 System.out.print(res[i][j]+"\t");
			 }
			 System.out.println();
		 }
	}
}
public class Multirray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a =new Addition();
		a.readMatrix();
		a.calculateMatrix();

	}

}
