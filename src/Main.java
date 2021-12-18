import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double[] tab = {5.23, 56.23, 123.1, 0.6344, 9983.5364};
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

        for (double value : tab) {
            System.out.println(value);
        }
    }
}
