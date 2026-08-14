import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        // 행 & 열에 대한 규칙 
        int size = (N * 2) + 1;

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(i == 0 || i == size - 1 || j == 0 || j == size - 1|| (i % 2 == 0 || j % 2 == 0)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        } 
    }
}