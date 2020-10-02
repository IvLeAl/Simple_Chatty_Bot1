import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String stroka1 = scanner.nextLine();
        String stroka2 = scanner.nextLine();


        String stroka3 = stroka2.replace(" ", "").trim();
        String stroka4 = stroka1.replace(" ", "").trim();

       System.out.print(stroka4.equals(stroka3));

    }
}