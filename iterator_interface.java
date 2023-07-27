import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

public class iterator_interface {
  public static void main(String[] args) {
    Collection values = new ArrayList();
    values.add(1);
    values.add(2);
    values.add(5);
    values.add(8);
    values.remove(8);
    System.out.println(values);
    Iterator it = values.iterator();// Iterator is an interface which is used to fetch one-one values from
                                    // collectionone
    while (it.hasNext()) // iterator is a method which returns the object of Iterator interface
    { // hasNext() method is used to check wheather there is a next element or not
      System.out.println(it.next());
    }
    /*
     * you can also do this->
     * System.out.println(it.next()); //next() method will print the next element
     * everytime
     * System.out.println(it.next());
     * System.out.println(it.next());
     */
  }
}
