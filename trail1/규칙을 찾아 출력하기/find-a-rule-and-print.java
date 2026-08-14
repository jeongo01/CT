import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int size = N - 1;

for(int i = 0; i < N; i++) {
    for(int j = 0; j < N; j++) {
        //  && ()
        if(i == 0 || i == size || j == 0 || j == size || (i > j)) {
            System.out.print("* ");
        } else {
            System.out.print("  ");
        }
    }
    System.out.println();
}
    }
}