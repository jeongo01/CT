import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        
        for(int i = 0; i < 3; i++) {
            char h = sc.next().charAt(0);
            int n = sc.nextInt();
                if(h == 'Y' && n >= 37) {
                    cnt++; 
                }
        }
        
        if (cnt >= 2) {
            System.out.println("E");
        } else {
            System.out.println("N");
        }
    
    }
}