import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    // 행이 1증가하면 별2개 감소  (2*i - b)
    // (2*i + b)
    // 별의 개수 : 6 4 2
    // 공백 개수 : 0 2 4 (N - i - 1)

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N - i; j++) {
                System.out.print("*");
            }

            for(int k = 0; k < i; k++) {
                System.out.print("  ");
            }

            for(int j = 0; j < N - i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}