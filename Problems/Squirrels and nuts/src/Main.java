import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int squirrel = scanner.nextInt();
        int nuts = scanner.nextInt();

        int value = nuts % squirrel;
        System.out.println(value);
    }
}