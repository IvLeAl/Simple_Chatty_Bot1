import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        long InputNumber = scanner.nextLong();
        int number = 1;
        do {
            number++;
        } while (calculateFactorial(number) <= InputNumber);
        System.out.println(number);
    }

    public static long calculateFactorial(long number) {
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}