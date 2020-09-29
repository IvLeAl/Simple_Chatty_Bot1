import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();
        double p = scanner.nextDouble();
        double k = scanner.nextDouble();
        int years = 0;
        while (k > m) {
            m = p / 100 * m + m;

            years++;
        }
        System.out.println(years);
    }
}