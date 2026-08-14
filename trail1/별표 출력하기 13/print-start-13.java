import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 0; i < N*2; i++) {
            if(i % 2 == 0) {
                for(int j = 0; j < N - (i/2); j++) {
                    System.out.print("* ");
                }
            } else {
                for(int k = 0; k < 1 + (i/2); k++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}