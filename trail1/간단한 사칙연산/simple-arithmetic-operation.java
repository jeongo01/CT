import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int a = A + B;
        int b = A - B;
        int c = A/B;
        int d = A%B;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}