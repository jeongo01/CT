import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        boolean found = false;

        for(int i = A; i <= B; i++) {
            if(1920 % i == 0 && 2880 % i == 0) {
                found = true;
                break;
            }
        }

        if(found) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }

    }
}