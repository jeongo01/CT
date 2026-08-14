import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

for(int i = 0; i < N; i++) {
    for(int j = 0; j < N; j++) {
        // j = 1, 3, 5
        
        if(i == 0 || ((j % 2 != 0) && (j >= i))) {
            System.out.print("* ");
        } else {
            System.out.print("  ");
        }
    }
    System.out.println();
}
    }
}
