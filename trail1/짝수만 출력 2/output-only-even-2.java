import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int temp = 0;
        temp = A;
        A = B;
        B = temp;

        while(B >= A) {
            if(B % 2 == 0) {
                System.out.print(B + " ");               
            }
            B--;
        }

    }
}