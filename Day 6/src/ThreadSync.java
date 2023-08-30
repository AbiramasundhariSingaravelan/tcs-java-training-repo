
class Table
{
	synchronized void printTable(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i+" * "+n+ " = "+(i*n));
			try
			{
				Thread.sleep(700);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
class MyThread1 extends Thread
{
	Table t;
	MyThread1(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);
	}
}
class MyThread2 extends Thread
{
	Table t;
	MyThread2(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(10);
	}
}
public class ThreadSync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table t=new Table();
		MyThread1 t1=new MyThread1(t);
		MyThread2 t2=new MyThread2(t);
		t1.start();
		t2.start();
		
	}

}
