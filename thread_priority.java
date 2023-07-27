//range of thread proroty -> 1 to 10,1-> least prority,5->normal priority,10->highest priority
//by default thread priority of any thread is 5(normal priority)
//by default the name of first thread is "Thread-0"and second thread is "Thread-1" and so on
public class thread_priority {
  public static void main(String args[]) throws Exception {
    Thread t1 = new Thread(() -> {
      for (int i = 1; i <= 5; i++) {
        System.out.println("Hi");
        try {
          Thread.sleep(1000);
        } catch (Exception e) {
        }
      }
    }, "HI THREAD");// you can also define the thread name here
    Thread t2 = new Thread(() -> {
      for (int i = 1; i <= 5; i++) {
        System.out.println("Hello");
        try {
          Thread.sleep(1000);
        } catch (Exception e) {
        }
      }
    });
    t2.setName("HELLO THREAD");
    System.out.println((t1.getName()));
    System.out.println((t2.getName()));
    t1.setPriority(1);
    t2.setPriority(Thread.MAX_PRIORITY); // "MIN_PRIORITY=1","NORM_PRIORITY=5","MAX_PRIORITY=10"
    System.out.println((t1.getPriority()));
    System.out.println((t2.getPriority()));

    t1.start();
    try {
      Thread.sleep(100);
    } catch (Exception e) {
    }
    t2.start();
    System.out.println(t1.isAlive());
    t1.join();
    t2.join();
    System.out.println(t2.isAlive());
    System.out.println("bye");
  }
}
