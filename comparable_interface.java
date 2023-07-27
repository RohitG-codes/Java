
//when you have your own class and list and you want to sort the list then you should implement comparable interface
import java.util.*;

class Studenttt implements Comparable<Studenttt> {
  int rollno, marks;
  String name;

  public Studenttt(int rollno, String name, int marks) {
    this.rollno = rollno;
    this.name = name;
    this.marks = marks;
  }

  public String toString() {
    return ("Student[rollno=" + rollno + ",name=" + name + ",marks=" + marks + "]");
  }

  public int compareTo(Studenttt s) {
    return (name.length() > s.name.length() ? 1 : -1);// you can also compare in respect of marks and rollno
  } // for marks-> "return(marks>s.marks?1:-1);
} // for marks-> "return(rollno>s.rollno?1:-1);"

public class comparable_interface {
  public static void main(String[] args) {
    List<Studenttt> s1 = new ArrayList<>();
    s1.add(new Studenttt(10, "raman", 98));
    s1.add(new Studenttt(11, "ramanuj", 90));
    s1.add(new Studenttt(16, "ram", 88));
    Collections.sort(s1);
    for (Studenttt s2 : s1) {
      System.out.println(s2);
    }

  }
}
