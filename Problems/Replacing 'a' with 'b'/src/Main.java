import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String stroka = scanner.next();
        String stroka1 = stroka.replace("a", "b");
        System.out.println(stroka1);

    }
}