import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int temp = 0;
        
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                temp++;

                int currentNum = (temp % 9 == 0) ? 9 : temp % 9;

                System.out.print(currentNum);
            }
            System.out.println();
        }

    }
}