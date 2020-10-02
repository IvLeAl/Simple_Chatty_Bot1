import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a  = scanner.nextInt();

        boolean a1 = (a > 0) && (a < 10);
        System.out.print(a1);
    }
}