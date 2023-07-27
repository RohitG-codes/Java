// when you put an primitive value inside an object that is called boxing or wrapping
// when you fetch the value of "ii", that is called unboxing or unwrapping
public class wrapper_class {
  public static void main(String[] args) {
    int i = 5; // here int is a primitive datatype and i is a variable
    Integer ii = new Integer(i); // wrapping(Java) or boxing(oops) // here Integer is a class and ii is an object
    int j = ii.intValue(); // unwrapping(java) or unboxing(oops)
    System.out.println(i + " : " + ii + " : " + j);
    // primitives are faster than wrapper classess,that's why we use this in certain
    // frameworks like: HYBERNET; which doesn't have the primitive datatypes
    int i1 = 6;
    Integer ii1 = i1; // autowrapping(Java) or autoboxing(oops)
    int j1 = ii1.intValue(); // autounwrapping(Java) or autounboxing(oops)
    System.out.println(i1 + " : " + ii1 + " : " + j1);

    String str = "123";
    int k = Integer.parseInt(str);// parseInt is a method which takes a string value and returns a integer
                                  // value,it is a static method so to access it we have to use the class name
    System.out.println(k);

  }
}
