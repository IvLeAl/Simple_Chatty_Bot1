import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int res = -1;
        int value;
        do {
            value = scanner.nextInt();
            res++;
        } while (value != 0);
        System.out.println(res);
    }
}