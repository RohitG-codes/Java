// there are three types of interfaces in java
// 1.single abstract method interface(sam interface) -- it will have only one method
// normal interface -- it will have more than one method
// marker interface -- it doesn't have any method; ex-> in-build interface "serializable"
// in java 1.8 the sam interface is known as functional interface (lambda expression which comes from "scala" language)

interface Abc {
  void write();
}

public class functional_interface_lambda_expression {
  public static void main(String[] args) {
    Abc obj = () -> System.out.println("hello world");
    obj.write();
  }
}
