import javax.swing.plaf.synth.SynthIcon;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while(scanner.hasNext()){
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();
            if (num1 == 0 || num2 == 0 || num3 == 0){
                break;
            }

            if(num1 > num2 && num2 > num3){
                System.out.print(true);

            }

            else if (num3 > num2 && num3 > num1 && num2 > num1){
                System.out.print(true);

            }

            else {
                System.out.print(false);
            }
        }

    }
}