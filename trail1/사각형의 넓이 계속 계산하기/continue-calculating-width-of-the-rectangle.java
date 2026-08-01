import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int cols = sc.nextInt();
            int rows = sc.nextInt();
            char c = sc.next().charAt(0);

            System.out.println(cols*rows);

            if(c == 'C') {
                break;
            }
        }   
    }
}