public class lambda_expression_in_thread {
  public static void main(String args[]) throws Exception {
    Thread t1 = new Thread(() -> {
      for (int i = 1; i <= 5; i++) {
        System.out.println("Hi");
        try {
          Thread.sleep(1000);
        } catch (Exception e) {
        }
      }
    });
    Thread t2 = new Thread(() -> {
      for (int i = 1; i <= 5; i++) {
        System.out.println("Hello");
        try {
          Thread.sleep(1000);
        } catch (Exception e) {
        }
      }
    });
    t1.start();
    try {
      Thread.sleep(100);
    } catch (Exception e) {
    }
    t2.start();
    System.out.println(t1.isAlive()); // isAlive() method detects wheather your thread is in running state or not
    t1.join(); // it will print true before you join a thread
    t2.join(); // it will print false after you join a thread
    System.out.println(t2.isAlive());// after you join a thread;it means your thread is not in running state
    System.out.println("bye"); // this is printed by the main thread
  }
}
