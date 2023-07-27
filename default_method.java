// till java 1.7  we can't define methods inside an interface
// but in java 1.8 we can define methods inside an interface
// then what is the difference between abstract classes and interface in java 1.8
// the difference is -->
// 1. you can have non public abstract methods inside an abstract class but in interface all the methods are public abstact
// 2. you can define constructors inside an abstract class but not in an interface

interface A54 {
  void write();

  default void read() {
    System.out.println("hi!");
  }
}

class Bee implements A54 {
  public void write() {
    System.out.println("hello");
  }
}

public class default_method {
  public static void main(String[] args) {
    A54 obj = new Bee();
    obj.read();
    obj.write();

  }
}
