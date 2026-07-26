import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int tcnt = 0;
        int fcnt = 0;

        for(int i = 1; i <= 10; i++) {
            int num = sc.nextInt();
            if(num % 3 == 0) {
                tcnt++;
            }
            if(num % 5 == 0) {
                fcnt++;
            } 
        }
        System.out.println(tcnt + " " + fcnt);
    }
}