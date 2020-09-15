import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int lenght = scn.nextInt();

        int[] array = new int[lenght];

        for (int i = 0; i < lenght; i++) {
            array[i] = scn.nextInt();
        }

        Arrays.sort(array);

        int n = 1;
        int max = array[array.length - n];

        while (max % 4 != 0) {
            max = array[array.length - n];
            n++;
        }

        System.out.println(max);

    }
}
