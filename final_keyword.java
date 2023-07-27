class A5 {
  final int DAY; // after making a variable final you cannot change the value of it,it became a
                 // constant(we represent conctant by capital letters)

  public A5() {
    DAY = 10;
  }
}

final class B5 {
  public void show() {
    System.out.println("in B show");
  }
}

// class C extends B --> if you make a class final it becomes inheritable,no
// other class can extend it
// if you don't want anyone to access your class and the data inside it, you can
// make your class as final
class c5 {
  public final void print() {
    System.out.println("in C print");
  }
}

class D extends c5 {
  /*
   * public void print() --> if you don't make the print method of C as final,
   * then the print method of D overrides the print method of C
   * { // so if you don't want anyone to override your method you can make it as
   * final
   * System.out.println(" in D print");
   * }
   */
}

public class final_keyword {
  public static void main(String[] args) {
    A5 obj = new A5();
    System.out.println(obj.DAY);
    B5 obj1 = new B5();
    obj1.show();
    D obj2 = new D();
    obj2.print();
  }
}
