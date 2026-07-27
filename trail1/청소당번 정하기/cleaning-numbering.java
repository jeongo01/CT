import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int classroom = 0; // 교실 청소 횟수 (2일 주기)
        int hallway = 0;   // 복도 청소 횟수 (3일 주기)
        int restroom = 0;  // 화장실 청소 횟수 (12일 주기)

        // 1일차부터 n일차까지 하루씩 확인합니다. (0일은 제외!)
        for (int i = 1; i <= n; i++) {
            
            // 1. 가장 주기가 긴 12일 화장실 청소부터 먼저 확인!
            if (i % 12 == 0) {
                restroom++; 
            } 
            // 2. 그다음으로 긴 3일 복도 청소 확인
            else if (i % 3 == 0) {
                hallway++; 
            } 
            // 3. 마지막으로 2일 교실 청소 확인
            else if (i % 2 == 0) {
                classroom++; 
            }
        }

        // 결과 출력 (교실, 복도, 화장실 순서)
        System.out.print(classroom + " " + hallway + " " + restroom);
    }
}