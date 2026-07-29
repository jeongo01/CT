import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int sum = 0;
        double avg = 0;

        for(int i = 1; i <= N; i++) {
            int num = sc.nextInt();
            sum += num;
        }

        avg = (double) sum / N;
        System.out.printf("%d %.1f ", sum, avg);

    }
}