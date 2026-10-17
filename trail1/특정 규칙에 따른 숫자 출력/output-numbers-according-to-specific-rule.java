import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int curr = 1;

        for(int i = 0; i < N; i++) {

            for(int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            for(int j = 0; j < N - i; j++) {
                if(curr > 9) {
                    curr = 1;
                }
                System.out.print(curr + " ");
                curr++;
            }
            System.out.println();
            
        }
    }
}