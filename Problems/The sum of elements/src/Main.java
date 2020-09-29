import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            int i = scanner.nextInt();
            if (i == 0) {
                break;
            } else {
                sum = sum + i;
            }
        }

        System.out.println(sum);
    }
}