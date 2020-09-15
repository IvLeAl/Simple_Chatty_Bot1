import java.util.Scanner;
class For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int estudiantes = scanner.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;

        for (int i = 0; i < estudiantes; i++) {
            int nota = scanner.nextInt();
            if (nota == 1) {
                a = ++a;
            } else if (nota == -1) {
                b = ++b;
            } else if (nota == 0) {
                c = ++c;
            }
        }
        System.out.println(c + " " + a + " " + b );
    }
}