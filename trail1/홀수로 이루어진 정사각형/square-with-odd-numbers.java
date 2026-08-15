import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int startNum = 11;

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                int num = startNum + (i*2) + (j*2);
                System.out.print(num + " ");
            }
            System.out.println();
        }


    }
}