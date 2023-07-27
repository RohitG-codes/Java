class Outer {
  int a;

  public void show() {
    System.out.println("in show");
  }

  class Inner // normal inner class
  {
    public void display() {
      System.out.println("in display");
    }
  }

  static class Inner1 // static inner class
  {
    public void print() {
      System.out.println("in print");
    }
  }
}

public class inner_class {
  public static void main(String[] args) {
    Outer obj = new Outer();
    Outer.Inner obj1 = obj.new Inner(); // creating object for the normal inner class(outer class object required;"obj"
                                        // required)
    Outer.Inner1 obj2 = new Outer.Inner1(); // creating object for the static inner class(no outer class object
                                            // required;"obj" not required)
    obj.show();
    obj1.display();
    obj2.print();
  }
}
