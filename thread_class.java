//1000 milisecond=1 second
class Hi extends Thread {
  public void run() {
    for (int i = 1; i <= 5; i++) {
      System.out.println("Hi");
      try {
        Thread.sleep(1000);
      } catch (Exception e) {
      } // it will print "hi" then wait for 1 sec and again print "hi" and so on
    }

  }
}

class Hello extends Thread {
  public void run() {
    for (int i = 1; i <= 5; i++) {
      System.out.println("Hello");
      try {
        Thread.sleep(1000);
      } catch (Exception e) {
      } // when "hi" is not getting printed for 1 sec at that time "hello" get printed
    } // it means "hi" and "hello" get printed simultaneously

  }
}

public class thread_class {
  public static void main(String args[]) {
    Hi o1 = new Hi();
    Hello o2 = new Hello();
    o1.start();
    try {
      Thread.sleep(100);
    } catch (Exception e) {
    } // here t1 thread prints "hi" and wait for"0.1 sec then again print "hi" and so
      // on
    o2.start(); // when t1 is not working at that time t2 prints "hello
  }
} // here total execution time is 5.5 second
