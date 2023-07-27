// when you binding your data with the methods, that cponcept is known as "ENCAPSULATION".
//we can access the variables, only with the help of methods (getters and setters)
class Student {
  private int rollno; // you have to make your data(variables) safe that's why we use the private
                      // keyword, means the data can be accessed only through the methods
  private String name; // if you make the variables public insted of private, then anyone can have
                       // access to change your data

  public void setRollno(int rollno) {
    this.rollno = rollno;
  }

  public void getRollno() {
    System.out.println(rollno);
  }

  public void setName(String name) {
    this.name = name;
  }

  public void getName() {
    System.out.println(name);
  }

}

public class encapsulation {
  public static void main(String[] args) {
    Student obj = new Student();
    obj.setRollno(4);
    obj.getRollno();
    obj.setName("navin");
    obj.getName();

  }
}
