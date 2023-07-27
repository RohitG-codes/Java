
//list has all the features of collection + list 
//collection doesn't work with index numbers but list does
import java.util.*;

public class list_interface {
  public static void main(String[] args) {
    List values = new ArrayList();
    values.add(1); // here 1 is not "int 1" it is "Integer 1" -> "Integer values=new
                   // Integer(1);"(wrapper class)
    values.add(2);
    values.add(5);
    values.add(8);
    values.add(2, 3);// here 3 will be added to the List at index number 2
    System.out.println(values);
    Iterator it = values.iterator();// Iterator is an interface which is used to fetch one-one values from
                                    // collectionone
    while (it.hasNext()) {
      System.out.println(it.next());
    }
    for (int i = 0; i < values.size(); i++) { // as list uses index numbers that's why we can use for loops but
                                              // collection doesn't allow any for loops
      System.out.println(values.get(i));
    }
    for (Object o : values) // here (1,2,5..)are not integer values this are object of Integer class(wrapper
                            // class)
    { // that's why we use "Object" instead of "int" in the for-each loop
      System.out.println(o);
    }
  }
}
