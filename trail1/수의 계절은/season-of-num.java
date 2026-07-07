import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();

        if(M > 2 && M < 6) {
            System.out.println("Spring");
        } else if (M > 5 && M < 9) {
            System.out.println("Summer");
        } else if (M > 8 && M < 12) {
            System.out.println("Fall");
        } else {
            System.out.println("Winter");
        }

    }
}