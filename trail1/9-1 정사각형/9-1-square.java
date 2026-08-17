import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int num = 9;

        for(int i = 0; i < N; i++) {

            for(int j = 0; j < N; j++) {
                
                System.out.print(num);

                num--;

                if(num < 1) {
                    num = 9;
                }
            }

            System.out.println();
        }

    }
}