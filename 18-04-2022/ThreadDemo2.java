package exercise_18_04_22;

class MyThread2 extends Thread{
	public void run()
	{	Thread th = Thread.currentThread();
	String name = th.getName();
		System.out.println("Thread with sleep");
		 for(int i=1;i<=5;i++) {
	            System.out.println(i + " "+name);
	            try
	            {
	            	Thread.sleep(1000);
	            }
	            catch(Exception e)
	            {
	            	e.printStackTrace();
	            }
	        }
	}
}
public class ThreadDemo2 {
	
	public static void main(String[] args)
	{
		MyThread2 th1=new MyThread2();
		th1.start();
		
		System.out.println("Thread without sleep");
		for(int i=1;i<=10;i++) {
			
            System.out.println(i);
		}
            try
            {
            	Thread.sleep(500);
            }
            catch(Exception e)
            {
            	e.printStackTrace();
            }
        }
		
	
}
	
	

