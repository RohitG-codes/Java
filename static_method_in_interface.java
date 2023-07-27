interface Demo456 {
  int num = 7; // when you create an variable inside an interface it becomes constant (" final
               // int num=7; ")

  static void show() {
    System.out.println("hi");
  }
}

public class static_method_in_interface {
  public static void main(String[] args) {
    Demo456.show();

  }
}
