
public class ThreadPriority extends Thread{

	public void run()
	{
		System.out.println("Thread Priority from Run M?ethod");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPriority t1=new ThreadPriority();
		ThreadPriority t2=new ThreadPriority();
		ThreadPriority t3=new ThreadPriority();
		System.out.println("Priority of Thread 1:"+t1.getPriority());
		System.out.println("Priority of Thread 2:"+t2.getPriority());
		System.out.println("Priority of Thread 3:"+t3.getPriority());
		t1.setPriority(6);
		t2.setPriority(3);
		t3.setPriority(9);
		System.out.println("Priority of Thread 1:"+t1.getPriority());
		System.out.println("Priority of Thread 2:"+t2.getPriority());
		System.out.println("Priority of Thread 3:"+t3.getPriority());
		System.out.println("Currently executing thread:"+Thread.currentThread().getName());
		System.out.println("Thread Priority of current thread: "+Thread.currentThread().getPriority());
				
	}

}
