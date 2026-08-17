import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 0; i < N; i++) {

            if(i % 2 == 0) {
                for(int j = 1; j <= N; j++) {
                    System.out.print(j);
                }
            } else {
                for(int k = N; k > 0; k--) {
                    System.out.print(k);
                }
            }
            System.out.println();
        }
    }
}