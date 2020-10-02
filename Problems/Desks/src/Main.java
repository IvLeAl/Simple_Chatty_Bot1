import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int class1 = scanner.nextInt();
        int class2 = scanner.nextInt();
        int class3 = scanner.nextInt();

        int partClass1 = (class1 / 2) + (class1 % 2);
        int partClass2 = (class2 / 2) + (class2 % 2);
        int partClass3 = (class3 / 2) + (class3 % 2);

        int valuePart = partClass1 + partClass2 + partClass3;

        System.out.println(valuePart);


    }
}