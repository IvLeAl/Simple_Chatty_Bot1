import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        String stroka = scanner.nextLine();

        String stroka1 = stroka.toUpperCase();

        System.out.println(stroka1.endsWith("BURG"));
    }
}