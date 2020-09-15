import java.util.Scanner;
class For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int estudiantes = scanner.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int i = 0; i < estudiantes; i++) {
            int nota = scanner.nextInt();
            if (nota == 5) {
                a = ++a;
            } else if (nota == 4) {
                b = ++b;
            } else if (nota == 3) {
                c = ++c;
            } else if (nota == 2) {
                d = ++d;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);
    }
}
