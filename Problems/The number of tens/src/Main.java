import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int value1 = scanner.nextInt();
        int val2 = value1 % 100 / 10;
        System.out.println(val2);
    }
}