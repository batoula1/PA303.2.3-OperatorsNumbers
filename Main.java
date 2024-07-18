public class Main {
    public static void main(String[] args) {

        //Task 1.
        int x = 2;
        System.out.println(Integer.toBinaryString(x));
        x = x << 1;
        //4
        System.out.println(x);
        //100
        System.out.println(Integer.toBinaryString(x));

        int a = 9, b = 17, c = 88;

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(c));

        a = a << 1;
        b = b << 1;
        c = c << 1;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(c));


        //Task 2.
        int x2 = 150;

        System.out.println(Integer.toBinaryString(x2));

        x2 = x2 >> 1;

        System.out.println(x2);
        System.out.println(Integer.toBinaryString(x2));

        int a2 = 225, b2 = 1555, c2 = 32456;

        System.out.println(Integer.toBinaryString(a2));
        System.out.println(Integer.toBinaryString(b2));
        System.out.println(Integer.toBinaryString(c2));


        a2 = a2 >> 1;
        b2 = b2 >> 1;
        c2 = c2 >> 1;

        System.out.println(a2);
        System.out.println(b2);
        System.out.println(c2);

        System.out.println(Integer.toBinaryString(a2));
        System.out.println(Integer.toBinaryString(b2));
        System.out.println(Integer.toBinaryString(c2));

        //Task 3
        int x3 = 7, y3 = 17, z3 = x3 & y3;

        System.out.println(Integer.toBinaryString(x3));
        System.out.println(Integer.toBinaryString(y3));
        System.out.println(Integer.toBinaryString(z3));

        //Task 4.
        System.out.println(Integer.toBinaryString(x3 | y3));


        //Task 5.
        int value1 = 20;
        System.out.println(value1);
        value1++;
        System.out.println(value1);

        //Task 6
        int incrementValue = 10;
        System.out.println(incrementValue);
        incrementValue++;
        System.out.println(incrementValue);
        incrementValue = incrementValue + 1;
        System.out.println(incrementValue);
        incrementValue += 1;
        System.out.println(incrementValue);
    }
}