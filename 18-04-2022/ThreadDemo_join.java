package exercise_18_04_22;

class MyThread3 extends Thread{
    public void run() {
        Thread th=Thread.currentThread();
        String name=th.getName();
        for(int i=1;i<=5;i++) {
            System.out.println(i + " "+name);
        }
    
    }
}

public class ThreadDemo_join {
	 public static void main(String[] args) throws InterruptedException {
	        // TODO Auto-generated method stub
	        MyThread3 th1=new MyThread3();
	        th1.start();
	        th1.join();
	        Thread th=Thread.currentThread();
	        String name=th.getName();
	        for(int i=1;i<=5;i++) {
	            System.out.println(i+" "+name);
	            try {
	                Thread.sleep(500);
	            }
	            catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	    
	    }
}
