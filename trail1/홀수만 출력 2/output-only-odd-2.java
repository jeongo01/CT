import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int B = sc.nextInt();
        int A = sc.nextInt();
        

        for(int i = B; i >= A; i--) {
            if(i % 2 == 1) {
                System.out.print(i + " ");
            }
        }

    }
}