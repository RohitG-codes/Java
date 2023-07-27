class calc {
    int num1;
    int num2;
    int result;

    public void add() // here public is an access modifier,void is a return type and add is the name
                      // of the method
    {
        result = num1 + num2;
    }

}

public class class_object {
    public static void main(String[] args) {
        calc obj = new calc(); // here obj works as a reference,the new keyword is used to allocate the
                               // memory(how much memory is needed that is defined by the constructor)
        obj.num1 = 5; // and new calc is the name of the object
        obj.num2 = 3;
        obj.add();
        System.out.println(obj.result);

    }
}
