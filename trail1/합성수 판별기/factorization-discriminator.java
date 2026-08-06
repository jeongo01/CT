import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        boolean found = false;

        for(int i = 2; i <= N-1; i++) {
            if(N % i == 0) {
                found = true;
                break;
            }
        }

        if(found) {
            System.out.print("C");
        } else {
            System.out.print("N");
        }
    }
}