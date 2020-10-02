import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int a = scanner.nextInt();
        int b = a + 1;

        if (a % 2 == 0) {
            System.out.print(a + 2);
        } else {
            System.out.print(b);
        }


    }
}