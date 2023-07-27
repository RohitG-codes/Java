abstract class Human // the class which has only declaration not a definition(body),is called an
                     // ABSTRACT CLASS, here human is an ABSTRACT CLASS
{ // you cannot create object of an abstract class but reference of it
  public abstract void eat(); // if a class extends an abstract class,you have to define the abstract method
                              // inside that class otherwise it will also became an abstract class

  public void walk() // you can only declare an abstract method,and if there is only one abstract
                     // method inside a class that class will be an abstract class
  {
    System.out.println("let's walk");
  }
}

class Man extends Human // here Man class is called as CONCRETE CLASS
{
  public void eat() // if you don't define eat() here then Man also becomes an abstract class
  {
    System.out.println("let's eat");
  }
}

public class abstract_class {
  public static void main(String[] args) {
    Human obj = new Man();
    obj.eat();

  }
}
