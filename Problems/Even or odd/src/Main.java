import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int val;
        while ((val = scanner.nextInt()) != 0) {
            if (val %2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}