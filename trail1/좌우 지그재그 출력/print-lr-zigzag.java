import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                for(int j = 0; j < N; j++) {
                    System.out.print((j+1) + (i*N) + " ");
                }
            } else {
                for (int j = 0; j < N; j++) {
                    System.out.print((i+1) * N - j + " ");
                }
            }
            System.out.println();
        }
    }
}