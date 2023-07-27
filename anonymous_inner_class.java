class A123 {
  public void show() {

  }
}

public class anonymous_inner_class {
  public static void main(String[] args) {
    A123 obj = new A123() // anonymous class
    {
      public void show() {
        System.out.println("in a show");
      }
    };
    obj.show();
  }
}
