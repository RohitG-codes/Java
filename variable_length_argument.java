class calc1 {
    public int add(int... i) // here (1,2,3,4,5,6) come to i as an whole array
    {
        int sum = 0;
        for (int k : i) {
            sum = sum + k;
        }
        return sum;
    }
}

public class variable_length_argument {
    public static void main(String[] args) {
        calc1 obj = new calc1();
        int result = obj.add(1, 2, 3, 4, 5, 6);
        System.out.println(result);

    }
}
