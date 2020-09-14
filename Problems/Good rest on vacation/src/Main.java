import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int day = scanner.nextInt();
        int costFood = scanner.nextInt();
        int costFlights = scanner.nextInt();
        int costResidence = scanner.nextInt();

        int costFoodTotal = (day * costFood);
        int costResidenceTotal = (day - 1) * costResidence;

        int Total = costFoodTotal + costFlights * 2 + costResidenceTotal;

        System.out.print(Total);
    }
}