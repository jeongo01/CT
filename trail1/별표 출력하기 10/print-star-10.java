import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        for(int i = 0; i < N*2; i++) {
            // 짝수는 1부터 1씩 증가 (행+2 마다 * 1증가)
            // 홀수는 N개에서 1씩 감소 (행+2 마다 * 1감소)
            if(i % 2 == 0) {
                for(int j = 0; j < 1 + (i/2); j++) {
                    System.out.print("* ");
                }
            } else {
                for(int k = 0; k < N - (i - 1) / 2; k++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}