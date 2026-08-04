import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = 0;

        while(true) {

            if (N == 1) {
                System.out.print(cnt);
                break;
            }

            if(N % 2 == 0) {
                N /= 2;
                cnt++;
            } else if (N % 2 == 1) {
                N = (N * 3) + 1;
                cnt++;
            }

        }
    }
}