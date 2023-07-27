// interfaces are same as abstract class the only difference is you can define a method in an abstract class but not in an interface
// for abstract classes we write "extends" but for interfaces we write "inplements"
// we can "implements" multiple interfaces, like : class Human implements Man,Woman 
// but we can't "extends" multiple abstract classes, like : class Human extends Man,Woman
// we can also de this : class Human exends Man implements Woman
interface Writer1122 {
  void write(); // by deafault the methods are "public abstract" you don't have to write it
}

class Pen123 implements Writer1122 {
  public void write() {
    System.out.println("i am a Pen123");
  }
}

class Pencil implements Writer1122 {
  public void write() {
    System.out.println("i am a Pen123cil");
  }
}

class Box123 {
  public void something(Writer1122 k1) {
    k1.write();
  }
}

public class interfaceDemo {
  public static void main(String[] args) {
    Box123 obj = new Box123();
    Writer1122 p = new Pen123(); // you can't create the object of an interface but the reference of it (you can
                                 // use 'Pen123' instead of 'Writer' )
    Pencil pc = new Pencil();
    obj.something(p);
    obj.something(pc);
  }
}
