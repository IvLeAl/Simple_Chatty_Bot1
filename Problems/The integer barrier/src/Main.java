import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        while (true) {
            int a = input.nextInt();
            sum = sum + a;
            if (sum >= 1000) {
                sum -= 1000;
                break;
            }
            if (a == 0)
                break;

        }
        System.out.println(sum);
    }
}