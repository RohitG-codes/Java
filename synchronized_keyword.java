class Counter {
  int count;

  public synchronized void increament()// if you make your method synchronized it means only one thread can work with
                                       // at a time
  { // if you don't make your method synchronized that means your method or class is
    // not thread-safe
    count++; // means multiple threads can access the method or class at the same time
  }
}

public class synchronized_keyword {
  public static void main(String[] args) throws Exception {
    Counter c = new Counter();
    Thread t1 = new Thread(() -> {
      for (int i = 0; i < 1000; i++) {
        c.increament();
      }
    });
    Thread t2 = new Thread(() -> {
      for (int i = 0; i < 1000; i++) {
        c.increament();
      }
    });
    t1.start();
    t2.start();
    t1.join();
    t2.join();
    System.out.println("Count" + c.count);
  }
}
