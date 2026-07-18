import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        // 먼저 정수부 몫 출력
        System.out.print((A / B) + ".");

        // 나머지 구하기
        A = (A % B);
        for(int i = 1; i < 21; i++) {
            // 나머지에 10을 곱해서 나눗셈 반복
            A = A * 10;
            System.out.print(A / B);
            // 다시 나머지 구하기
            A = (A % B);
        }

    }
}