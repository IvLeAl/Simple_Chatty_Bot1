import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int elements = scanner.nextInt();
        int max = 0;

        for (int i = 0; i < elements; i++) {
            int curVal = scanner.nextInt();
            if (curVal % 4 == 0 && curVal > max) {
                max = curVal;
            }
        }

        System.out.println(max);
    }
}