import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int sum = 0;
        int scans = scanner.nextInt();
        int numbers;

        for (; count <= scans; count++) {
            numbers = scanner.nextInt();
            if (numbers % 6 == 0) {
                sum += numbers;
            }
        }

        System.out.println(sum);
    }
}