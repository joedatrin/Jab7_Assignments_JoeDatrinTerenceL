package exercise_18_04_22;

class MyThread extends Thread{
    public void run() {
        for(int i=1;i<=10;i++) {
            System.out.println(i);
        }
    
    }
}
public class ThreadDemo {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MyThread th1=new MyThread();
        MyThread th2=new MyThread();
        th1.start(); // The run() method is already present in start() method
        
        th2.start();
      
    }
}

// We cannot have complete control over thread. Try running the program multiple times and well get different results