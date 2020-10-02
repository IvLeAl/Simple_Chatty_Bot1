import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int yar = scanner.nextInt();


        if ( yar % 4 == 0 && yar % 100 != 0 || yar % 400 == 0) {
            System.out.print("Leap");
        } else {
            System.out.print("Regular");
        }
    }
}