import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int G = sc.nextInt();

        if(N >= 90 && G >= 95) {
            System.out.println("100000");
        } else if (N >= 90 && G >= 90) {
            System.out.println("50000");
        } else {
            System.out.println("0");
        }

    }
}