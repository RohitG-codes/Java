// "IS-A" and "HAS-A" relationship in inheritance
//"IS-A" : when a class extends another class that is called "IS-A" relationship in inheritance
//HAS-A" : when you create an object of a class inside another class that is called "HAS-A" relationship in inheritance
class a1 // super class
{
    public int add(int i, int j) {
        return (i + j);
    }
}

class b extends a1 // sub class //single level inheritance, b is inheriting add from a
{
    public int sub(int i, int j) {
        return (i - j);
    }
}

class c extends b // multi-level level inheritance, c is inheriting add and sub from b
{
    public int multi(int i, int j) {
        return (i * j); // JAVA DOESN'T SUPPORT MULTIPLE INHERITACNE
    }
}

public class inheritance {
    public static void main(String[] args) {
        c obj = new c();
        System.out.println(obj.add(15, 6));
        System.out.println(obj.sub(15, 6));
        System.out.println(obj.multi(15, 6));

    }
}
