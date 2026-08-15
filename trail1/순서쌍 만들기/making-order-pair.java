import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

for(int i = 0; i < N; i++){
    for(int j = 0; j < N; j++) {
        int x = N - i;
        int y = N - j;
        System.out.printf("(%d,%d) ", x, y);
    }
    System.out.println();
}
    }
}