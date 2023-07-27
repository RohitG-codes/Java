
class A780 {
  public void add(int i, int j) {
    System.out.println(i + j);
  }

  public void add(int i, int j, int k) {
    System.out.println(i + j + k);
  }

  public void add(double i, double j) {
    System.out.println(i + j);
  }

  public void show() {
    System.out.println("hi");
  }
}

public class method_overloading_and_overriding_using_same_class {
  public static void main(String[] args) {
    A780 obj = new A780() {
      public void show() {
        System.out.println("hiii");
      }
    };
    obj.show();
    obj.add(1, 2);
    obj.add(1, 2, 3);
    obj.add(5.4, 5.6);

  }
}
