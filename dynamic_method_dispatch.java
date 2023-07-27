class A4 // when your source code get converted into machine code that is called compile
         // time
{ // when your code is running that is called run time, generally comes after
  // compile time

    public void show() {
        System.out.println("in a");
    }
}

class B extends A4 {
    public void show() {
        System.out.println("in b");
    }
}

class C extends A4 {
    public void show() {
        System.out.println("in c");
    }
}

public class dynamic_method_dispatch {
    public static void main(String[] args) {
        A4 obj = new B(); // you can create the object of the sub class and reference of the parent class
                          // //this linking is happen during runtime ,this is called runtime polymorphism
        obj.show(); // here the output will be in b because we are creating the object of B not the
                    // object of A(but the reference of A)
                    // here if B has a method that is not there in A, and if you call it there will
                    // be an error on the output because the reference is of A(see next line)
        obj = new C(); // so you have to call those methods which are in both a and b
        obj.show(); // everytime you call the different methods with the same reference this is
                    // called dynamic method dispatch

    }
}
