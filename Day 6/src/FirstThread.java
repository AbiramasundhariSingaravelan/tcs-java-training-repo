
class Demo extends Thread
{
	public void run()
	{
		System.out.println("Threading......");
	}
}
class Demo1 implements Runnable
{
	public void run()
	{
		System.out.println("Threading using Runnable");
	}
}
public class FirstThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo d=new Demo();// new state
		d.start();//active
		Demo1 d1=new Demo1();
		Thread t1=new Thread(d1);
		t1.start();
	}

}
