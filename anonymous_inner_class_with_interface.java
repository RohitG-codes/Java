interface A321 {
  void a1();
}

public class anonymous_inner_class_with_interface {
  public static void main(String[] args) {
    A321 obj = new A321() // creating object of an interface with the help of an anonymous class
    {
      public void a1() {
        System.out.println("in a1 show");
      }
    };
    obj.a1();

  }
}
