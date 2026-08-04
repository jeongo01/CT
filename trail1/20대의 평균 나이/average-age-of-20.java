import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        double avg = 0;
        int cnt = 0;

        for(int i = 1; i <= 100; i++) {
            int num = sc.nextInt();
            if(num < 30 & num > 19) {
                sum += num;
                cnt++;
            } else {
                break;
            }
        }
        avg = (double)sum / cnt;
        
        System.out.printf("%.2f", avg);

    }
}