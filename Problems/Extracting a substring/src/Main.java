import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String stroka1 = scanner.nextLine();
        Integer number1 = scanner.nextInt();
        Integer number2 = scanner.nextInt();

        System.out.println(stroka1.substring(number1, number2 + 1));

    }
}