import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int busHeight = sc.nextInt();
        int numBus = sc.nextInt();
        int i = 0;
        int bridgeH;
        while (i < numBus) {
            bridgeH = sc.nextInt();
            i++;
            if (bridgeH <= busHeight) {
                System.out.println("Will crash on bridge " + i);
                break;
            }
        }
        if (i == numBus) {
            System.out.println("Will not crash");
        }
    }
}


