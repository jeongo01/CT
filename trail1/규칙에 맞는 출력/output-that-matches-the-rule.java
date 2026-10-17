import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int sn = 0;

        for(int i = 1; i <= N; i++) {

            for(int j = 0; j < i; j++) {
                sn = N - i + 1;    
            }

            for(int j = sn; j <= N; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}