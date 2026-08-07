import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = 1;

        for(int i = 1; i <= 5; i++) {
            int num = sc.nextInt();

            if(num % 3 != 0) {
                result = 0;
                break;
            }
        }
        System.out.println(result);
    }
}