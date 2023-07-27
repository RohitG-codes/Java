public class primitive_datatypes {
    public static void main(String[] args) {
        byte b = 5; // it takes 1 byte=8 bit, integer range is--> -128 to 127
        int i = 6; // it takes 4 byte=32 bit, integer range is--> -2 billion to 2
                   // billion(approximatelyy)
        short s = 4; // it takes 2 byte=16 bit, integer range is--> -32768 to 32767
        double d = 8.2; // it takes 8 byte=64 bit, integer range is--> -9 quintillion to 9
                        // quintillon(approximately),1 quintillion= 18 zeros after 1
        float f = 2.3f; // it takes 4 byte=32 bit, integer range is--> -2 billion to 2
                        // billion(approximatelyy)
        long l = 5; // it takes 8 byte=64 bit, integer range is--> -9 quintillion to 9
                    // quintillon(approximately),1 quintillion= 18 zeros after 1
        char c1 = 'A'; // it takes 2 byte=16 bit, integer range is--> -32768 to 32767
        char c2 = 90; // ASCII value of 'Z' is 90
        double d1 = 5; // implicit convertion
        int i1 = (int) 5.6; // type casting
        System.out.println(b);
        System.out.println(i);
        System.out.println(s);
        System.out.println(d);
        System.out.println(f);
        System.out.println(l);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(d1);
        System.out.println(i1);

    }
}
