import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;
        boolean c = false;

        System.out.println(a && b && c || a);
        System.out.println(a && !(b && c || a));
        System.out.println(b && c || c );
        System.out.println((b && true) && !c || a);
        System.out.println((a && b && false || false) || true);
        System.out.println((a || b || c) && b);

        int x = 53;
        int y = 23;
        int z = 62;

        System.out.println(x > z);
        System.out.println((x == z) || (y < x));
        System.out.println((y != z) && true);
        System.out.println((x >= z) || (y <= y) && !(y != z));
    }
}
