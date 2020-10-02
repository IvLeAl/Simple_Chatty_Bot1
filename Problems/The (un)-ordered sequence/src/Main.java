import javax.swing.plaf.synth.SynthIcon;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 0;
        for ( int i = 0; i <= a ; i++) {
            for ( int j = 0; j < i ; j++) {
                if ( b == a) break;
                b++;
                System.out.println(i);

            }
        }
    }
}