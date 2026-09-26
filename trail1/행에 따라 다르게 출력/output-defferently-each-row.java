import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int startNum = 1;
        
        for (int i = 1; i <= n; i++) {
            int inc = (i % 2 != 0) ? 1 : 2;
            int curr = startNum;
            
            for (int j = 0; j < n; j++) {
                System.out.print(curr + " ");
                curr += inc;
            }
            System.out.println();
            
            int previousRowEnd = curr - inc;
            int nextInc = ((i + 1) % 2 != 0) ? 1 : 2;
            startNum = previousRowEnd + nextInc;
        }
    }
}