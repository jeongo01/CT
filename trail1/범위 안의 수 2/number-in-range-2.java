import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        int sum = 0;
        double avg = 0;

        for(int i = 1; i <= 10; i++) {
            int num = sc.nextInt();
                if(0 <= num && num <= 200) {
                    sum += num;
                    cnt++;
                }
        }
        avg = (double)sum / cnt;

        System.out.printf("%d %.1f", sum, avg);

    }
}