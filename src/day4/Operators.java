package day4;

public class Operators {

    public static void main(String[] args) {

        devide(45,4);

        int a = 5;
        int b = 5;
        int c = a+b;
        System.out.println("sum = " + c);

        int x = 5;
        float y = 6f;

        float z = x;       // implicit conversion because float has higher precedence
        System.out.println(z);
        int e = (int)z;    // explicit conversion has high chances of data loss
        System.out.println(e);

        float m = 10.87f;
        int n =(int)m;  // you will experience loss of data
        System.out.println(n);

        int i = 1;
        int j = 2;
        i++;   // i = 2
        System.out.println(i);
        j--;  // j = 1
        System.out.println(j);

        int l = 2;
        int q = 2;
        int o = 3*++l;  // l=3 prefix
        System.out.println(o);  // 9
        int p = 3*q++;  // q = 2 multiply and increases the value of q to 3
        System.out.println(p); // 6
        System.out.println("q = " +q);

    }

    public static void devide(int f,int g){
        float  total = (float) f/g;
        System.out.println("Total = " + total);
    }
}
