import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 0; i < N; i++) {
            if(i % 2 != 0) {
                for(int k = 0; k < i + 1; k++) {
                    System.out.print("* ");
                }
            }
            else {
                System.out.print("*");  
            }

            System.out.println();
        }
    }
}