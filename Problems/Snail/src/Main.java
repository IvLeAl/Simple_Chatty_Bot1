import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = 0;

        while (h > 0 && h > b && a > b) {
            h -= a;
            h += b;
            count++;
        }
        System.out.print(count);


    }
}