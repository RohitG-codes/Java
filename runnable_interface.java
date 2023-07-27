//there are two ways to create a thread;1)by extending the thread class 2)implement the runnable interface
//runnable interface is a functional interface
class MyThread123 implements Runnable {
  public void run() {
    System.out.println("my name is rohit gupta");
  }
}

public class runnable_interface {
  public static void main(String[] args) {
    MyThread123 m1 = new MyThread123();
    Thread t1 = new Thread(m1);
    t1.start();

  }
}
