abstract class Writer {
  public abstract void show(int i);

  public abstract void print(double d);

  public abstract void scan(float f);

}

class Pencil extends Writer {
  public void show(int i) {
    System.out.println(i);
  }

  public void print(double d) {
    System.out.println(d);
  }

  public void scan(float f) {
    System.out.println(f);
  }
}

class Pen extends Pencil {

}

public class need_of_abstract_class1 {
  // if you want to run this class,remove the 1 from its name
  public static void main(String[] args) {
    Pen obj1 = new Pen();
    obj1.show(5);
    obj1.print(5.5);
    obj1.scan(5.5f);

  }
}
