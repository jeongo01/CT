import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        for(int i = 1; i < A + 1; i++) {
            for(int j = 1; j < B + 1; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}