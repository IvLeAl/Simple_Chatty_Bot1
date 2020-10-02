import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int num1 = scanner.nextInt();


        int hunders = num1 / 100;
        int decades = (num1 / 10) % 10;
        int number = num1 % 10;

        System.out.println(number * 100 + decades * 10 + hunders);

    }
}