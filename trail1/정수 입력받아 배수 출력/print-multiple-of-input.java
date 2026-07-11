import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int result = 0;

        for(int i = 1; i <= 5; i++) {
            result = N * i;
            System.out.print(result + " ");
        }
    }
}