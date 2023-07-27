//in a particular program there are so many sub-processes,this sub-processes are called "Threads"
//when multiple threads are working at the same time to maximize the utilization of cpu that is callled "Multi-Threading"
//by default in every java program there is at least one thread, named as "main Thread"
// all the executions are done by the main thread
// every thread should have a "start" method  
class MyThread extends Thread {
  public void run() {
    int nums[] = { 1, 2, 3, 5, 8 };
    {
      for (int i = 0; i < 5; i++) {
        nums[i] = nums[i] * 2;
        System.out.println(nums[i]);
      }
    }
  }
}

public class multithreading {
  public static void main(String[] args) {
    MyThread t1 = new MyThread();// here there are two threads; 1)main thread and 2)t1 thread
    t1.start(); // mums[i] get printed by t1 thread
    System.out.println("bye");// bye get printed by main thread
                              // while nums[i] getting printed at that time main thread is printing "bye"
                              // that is why "bye" get printed first
  }

}
