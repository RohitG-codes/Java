interface Demo {
  void abc();

  default void show() {
    System.out.println("in demo show");
  }
}

interface MyDemo {
  default void show() {
    System.out.println(" in mydemo show");
  }
}

class DemoImp implements Demo, MyDemo {
  public void abc() {
    System.out.println("hi");
  }

  public void show() // if you don't create the show method of demoimp there will be an error because
                     // when you call obj.show
  { // it cannot determine which show method will be called (show method of demo or
    // mydemo)
    System.out.println("in demoimp show");
  }
  /*
   * // you can also do this (if you don't want to define another show method of
   * demoimp)->
   * 
   * @Override
   * public void show()
   * {
   * Demo.super.show();
   * MyDemo.super.show();
   * }
   * 
   * // the output will be like this -> in demo show
   * in mydemo show
   */
}

public class multiple_interface_issue_with_interface {
  public static void main(String[] args) {
    Demo obj = new DemoImp();
    obj.show();
    obj.abc();

  }
}
